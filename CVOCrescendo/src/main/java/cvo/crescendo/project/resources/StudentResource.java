package cvo.crescendo.project.resources;

import cvo.crescendo.project.models.Student;
import cvo.crescendo.project.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**z
 * Created by Alexander on 28/04/2017.
 */
@RestController
public class StudentResource {

    private StudentRepository studentRepository;

    @Autowired
    public StudentResource(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    @RequestMapping(value = "/students", method = RequestMethod.GET)
    public Iterable<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
