package cvo.crescendo.project;

import cvo.crescendo.project.models.Course;
import cvo.crescendo.project.models.CourseInfoResponse;
import cvo.crescendo.project.models.Student;
import cvo.crescendo.project.models.StudentInfoResponse;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

/**
 * Created by thomasleysen on 2/05/17.
 */
public class InformatConnector {



    private HttpHeaders globalRequestHeaders = new HttpHeaders();
    private final String BASE_URL= "https://testservices.informatsoftware.be/icursisten/1";


    public void Connect(String url) {

        HttpHeaders requestHeaders = new HttpHeaders();


        SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyyMMddHHmmss");
        DATE_FORMAT.setTimeZone(TimeZone.getTimeZone("UTC"));
        Date today = new Date();
        SimpleDateFormat UTC_FORMAT = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
        UTC_FORMAT.setTimeZone(TimeZone.getTimeZone("UTC"));
        String output = UTC_FORMAT.format(today);
        String date = DATE_FORMAT.format(today);

        String message = "verb=POST&timestamp=" + date + "&url=" + url + "&instellingsnr=128521";

        String hmac = hmacDigest.hmacDigest(message, "3FBrk5gxgbEV5Hgf4pO9pc61LyGV7KxJNi4EJeWA4oCPc0wbfvtDqUGPfVzmsq6PC2Y0A1", "HmacSHA256");

        requestHeaders.add("Timestamp", output);
        requestHeaders.add("InstellingsNr", "128521");
        requestHeaders.setContentType(MediaType.APPLICATION_JSON);
        requestHeaders.add("Authentication", "pubKey_WPQkP8ulx8BCmopSH2lMmCq0JRXBcj" + ":" + hmac);

        globalRequestHeaders = requestHeaders;
    };

    public List<Student> getAllStudentsByYear(){

        String url = BASE_URL + "/student";
        Connect(url);
        RestTemplate restTemplate = new RestTemplate();


        JSONObject request = new JSONObject();
        try {
            request.put("schoolYear", "2016-17");
        } catch (JSONException e) {
            e.printStackTrace();
        }

        HttpEntity<?> requestEntity = new HttpEntity(request.toString(), globalRequestHeaders);

        List<Student> students = restTemplate.postForObject(url, requestEntity, StudentInfoResponse.class).getStudents();

        return students;
    }

}
