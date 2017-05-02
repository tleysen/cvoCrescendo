package cvo.crescendo.project;

import V3.V3BindingStub;
import V3.V3Port;
import V3.V3PortProxy;
import V3.V3Service;
import cvo.crescendo.project.models.Course;
import cvo.crescendo.project.models.CourseInfoResponse;
import cvo.crescendo.project.repositories.CourseRepository;
import cvo.crescendo.project.InformatConnector;
import cvo.crescendo.project.hmacDigest;
import cvo.crescendo.project.SmartschoolConnector;
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
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Base64;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;


@SpringBootApplication
public class CvocrescendoApplication {

    //private static final Logger log = LoggerFactory.getLogger(CvocrescendoApplication.class);

    public static void main(String[] args) {
        new SpringApplicationBuilder(CvocrescendoApplication.class).run(args);
    }


    @Bean
    CommandLineRunner runOnStartup(CourseRepository courseRepository) {
        return (args) -> {

            for (Course c : InformatConnector.Connect()) {
                courseRepository.save(c);
            }
            SmartschoolConnector.Connect();
        };
    }
}
