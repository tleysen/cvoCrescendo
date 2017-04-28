package cvo.crescendo.project.resources;

import cvo.crescendo.project.models.Course;
import cvo.crescendo.project.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Alexander on 28/04/2017.
 */
@RestController
public class CourseResource {

    private CourseRepository courseRepository;

    @Autowired
    public CourseResource(CourseRepository courseRepository){
        this.courseRepository = courseRepository;
    }

    @RequestMapping(value = "/courses", method = RequestMethod.GET)
    public Iterable<Course> getAllCourses(){
        return courseRepository.findAll();
    }

}
