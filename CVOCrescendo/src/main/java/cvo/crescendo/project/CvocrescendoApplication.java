package cvo.crescendo.project;

import cvo.crescendo.project.models.Course;
import cvo.crescendo.project.models.CourseInfoResponse;
import cvo.crescendo.project.repositories.CourseRepository;
import org.json.JSONException;
import org.json.JSONObject;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate; //MVC Spring

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;


@SpringBootApplication
public class CvocrescendoApplication {

    //private static final Logger log = LoggerFactory.getLogger(CvocrescendoApplication.class);

    public static String hmacDigest(String msg, String keyString, String algo) {
        String digest = null;
        try {
            SecretKeySpec key = new SecretKeySpec((keyString).getBytes("UTF-8"), algo);
            Mac mac = Mac.getInstance(algo);
            mac.init(key);

            byte[] bytes = mac.doFinal(msg.getBytes("ASCII"));

            StringBuffer hash = new StringBuffer();
            for (int i = 0; i < bytes.length; i++) {
                String hex = Integer.toHexString(0xFF & bytes[i]);
                if (hex.length() == 1) {
                    hash.append('0');
                }
                hash.append(hex);
            }
            digest = hash.toString();
        } catch (UnsupportedEncodingException e) {
        } catch (InvalidKeyException e) {
        } catch (NoSuchAlgorithmException e) {
        }
        return digest;
    }

    public static void main(String[] args) {
        new SpringApplicationBuilder(CvocrescendoApplication.class).run(args);
    }

    @Bean
    CommandLineRunner runOnStartup(CourseRepository courseRepository) {
        return (args) -> {

            RestTemplate restTemplate = new RestTemplate();

            HttpHeaders requestHeaders = new HttpHeaders();

            JSONObject request = new JSONObject();
            try {
                request.put("schoolYear", "2014-15");
            } catch (JSONException e) {
                e.printStackTrace();
            }

            String url = "https://testservices.informatsoftware.be/icursisten/1/course";

            SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyyMMddHHmmss");
            DATE_FORMAT.setTimeZone(TimeZone.getTimeZone("UTC"));
            Date today = new Date();
            SimpleDateFormat UTC_FORMAT = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
            UTC_FORMAT.setTimeZone(TimeZone.getTimeZone("UTC"));
            String output = UTC_FORMAT.format(today);
            String date = DATE_FORMAT.format(today);

            String message = "verb=POST&timestamp=" + date + "&url=" + url + "&instellingsnr=128521";
            String hmac = hmacDigest(message, "3FBrk5gxgbEV5Hgf4pO9pc61LyGV7KxJNi4EJeWA4oCPc0wbfvtDqUGPfVzmsq6PC2Y0A1", "HmacSHA256");

            requestHeaders.add("Timestamp", output);
            requestHeaders.add("InstellingsNr", "128521");
            requestHeaders.setContentType(MediaType.APPLICATION_JSON);
            requestHeaders.add("Authentication", "pubKey_WPQkP8ulx8BCmopSH2lMmCq0JRXBcj" + ":" + hmac);

            HttpEntity<?> requestEntity = new HttpEntity(request.toString(), requestHeaders);

            List<Course> courses = restTemplate.postForObject(url, requestEntity, CourseInfoResponse.class).getCourses();

            for (Course c : courses) {
                courseRepository.save(c);

            }

            // fetch all customers
            System.out.println("Course found with findAll():");
            System.out.println("-------------------------------");
            for (Course course : courseRepository.findAll()) {
                System.out.println(course.toString());
            }

            // fetch an individual customer
            System.out.println("Course found with findByName('Lasser Pakket 1 di av (Jaar)'):");
            System.out.println("--------------------------------");
            System.out.println((courseRepository.findByName("Lasser Pakket 1 di av (Jaar)")).toString());

        };
    }

}
