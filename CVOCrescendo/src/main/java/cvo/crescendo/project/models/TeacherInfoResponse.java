package cvo.crescendo.project.models;

import java.util.List;

/**
 * Created by Alexander on 24/04/2017.
 */
public class TeacherInfoResponse {

    private List<Teacher> teachers;

    public TeacherInfoResponse() {
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    @Override
    public String toString() {
        return "TeacherInfoResponse{" +
                "teachers=" + teachers +
                '}';
    }

}
