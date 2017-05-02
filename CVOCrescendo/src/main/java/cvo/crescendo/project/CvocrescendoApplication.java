package cvo.crescendo.project;

import cvo.crescendo.project.models.Course;
import cvo.crescendo.project.models.Student;
import cvo.crescendo.project.repositories.CourseRepository;
import cvo.crescendo.project.repositories.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class CvocrescendoApplication {

    //private static final Logger log = LoggerFactory.getLogger(CvocrescendoApplication.class);

    public static void main(String[] args) {
        new SpringApplicationBuilder(CvocrescendoApplication.class).run(args);
    }


    @Bean
    CommandLineRunner runOnStartup(CourseRepository courseRepository, StudentRepository studentRepository) {
        return (args) -> {

            //for (Course c : InformatConnector.Connect()) {
            //    courseRepository.save(c);
            //}

            for (Student s : InformatConnector.Connect()) {
                studentRepository.save(s);
            }
            SmartschoolConnector.Connect();
        };
    }
}
