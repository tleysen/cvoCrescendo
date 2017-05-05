package cvo.crescendo.project.resources;

import cvo.crescendo.project.models.Teacher;
import cvo.crescendo.project.repositories.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Alexander on 28/04/2017.
 */
@RestController
public class TeacherResource {

    private TeacherRepository teacherRepository;

    @Autowired
    public TeacherResource(TeacherRepository teacherRepository){
        this.teacherRepository = teacherRepository;
    }

    @RequestMapping(value = "/teachers", method = RequestMethod.GET)
    public Iterable<Teacher> getAllTeachers(){
        return teacherRepository.findAll();
    }
}
