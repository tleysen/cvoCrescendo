package cvo.crescendo.project.repositories;

/**
 * Created by Liam on 25-4-2017.
 */

import cvo.crescendo.project.models.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student, String> {

}