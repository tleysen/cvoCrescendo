package cvo.crescendo.project;

import cvo.crescendo.project.models.Course;
import cvo.crescendo.project.models.Student;
import cvo.crescendo.project.models.Teacher;
import cvo.crescendo.project.repositories.CourseRepository;
import cvo.crescendo.project.repositories.StudentRepository;
import cvo.crescendo.project.repositories.TeacherRepository;
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
    CommandLineRunner runOnStartup(CourseRepository courseRepository, StudentRepository studentRepository, TeacherRepository teacherRepository) {
        return (args) -> {

            InformatConnector informatConnector = new InformatConnector();

            //year formatting is very important:

            for (Student s : informatConnector.getAllStudentsByYear("2014-15")) {
                studentRepository.save(s);
            }

            for (Course c : informatConnector.getAllCoursesByYear("2014-15")) {
                courseRepository.save(c);
            }

            for (Teacher t : informatConnector.getAllTeachersByYear("2014-15")) {
                teacherRepository.save(t);
            }

            //SmartschoolConnector.Connect();
        };
    }
}
