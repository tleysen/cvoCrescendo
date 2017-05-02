package cvo.crescendo.project.models;

import java.util.List;

/**
 * Created by Alexander on 24/04/2017.
 */
public class StudentInfoResponse {

    private List<Student> students;

    public StudentInfoResponse() {
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "StudentInfoResponse{" +
                "students=" + students +
                '}';
    }

}
