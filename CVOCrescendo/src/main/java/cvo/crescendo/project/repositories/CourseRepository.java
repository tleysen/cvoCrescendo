package cvo.crescendo.project.repositories;

/**
 * Created by Liam on 25-4-2017.
 */

import cvo.crescendo.project.models.Course;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CourseRepository extends MongoRepository<Course, String> {

}