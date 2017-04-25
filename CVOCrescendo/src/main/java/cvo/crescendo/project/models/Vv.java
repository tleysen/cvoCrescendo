package cvo.crescendo.project.models;

/**
 * Created by Maarten on 25/04/2017.
 */
public class Vv {
    private String description;
    private String value;

    public Vv(){
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Vv{" +
                "description='" + description + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}

