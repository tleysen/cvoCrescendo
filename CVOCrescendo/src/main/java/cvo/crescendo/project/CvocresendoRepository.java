package cvo.crescendo.project;

/**
 * Created by Liam on 25-4-2017.
 */
import java.util.List;

import cvo.crescendo.project.models.Course;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CvocresendoRepository extends MongoRepository<Course, String> {

    public Course findByName(String name);

}
