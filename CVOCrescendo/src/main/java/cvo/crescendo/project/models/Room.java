package cvo.crescendo.project.models;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Alexander on 21/04/2017.
 */
public class Room {

    private String id;
    private String code;
    private String naam;

    public Room() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id='" + id + '\'' +
                ", code='" + code + '\'' +
                ", naam='" + naam + '\'' +
                '}';
    }
}
