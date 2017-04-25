package cvo.crescendo.project.models;

import org.springframework.data.annotation.Id;

/**
 * Created by Alexander on 21/04/2017.
 */
public class Location {

    @Id
    private String id;
    private String name;

    public Location() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Location{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
