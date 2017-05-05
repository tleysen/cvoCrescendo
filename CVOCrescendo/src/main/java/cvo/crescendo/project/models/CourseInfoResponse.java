package cvo.crescendo.project.models;

import java.util.List;

/**
 * Created by Alexander on 24/04/2017.
 */
public class CourseInfoResponse {

    private List<Course> courses;

    public CourseInfoResponse() {
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "CourseInfoResponse{" +
                "courses=" + courses +
                '}';
    }

}
