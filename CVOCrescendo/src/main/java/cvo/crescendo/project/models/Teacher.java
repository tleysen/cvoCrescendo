package cvo.crescendo.project.models;

import org.springframework.data.annotation.Id;
import java.util.Date;
import java.util.List;

/**
 * Created by Alexander on 21/04/2017.
 */
public class Teacher {

    @Id
    private String id;

    private String firstName;
    private String lastName;
    private String nickname;
    private Date dateOfBirth;
    private String sex;
    private String stamNr;
    private String rijksRegisterNr;
    private Address address;
    private List<String> email;
    private List<String> phone;


    public Teacher() {
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getStamNr() {
        return stamNr;
    }

    public void setStamNr(String stamNr) {
        this.stamNr = stamNr;
    }

    public String getRijksRegisterNr() {
        return rijksRegisterNr;
    }

    public void setRijksRegisterNr(String rijksRegisterNr) {
        this.rijksRegisterNr = rijksRegisterNr;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<String> getEmail() {
        return email;
    }

    public void setEmail(List<String> email) {
        this.email = email;
    }

    public List<String> getPhone() {
        return phone;
    }

    public void setPhone(List<String> phone) {
        this.phone = phone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", nickname='" + nickname + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", sex='" + sex + '\'' +
                ", stamNr='" + stamNr + '\'' +
                ", rijksRegisterNr='" + rijksRegisterNr + '\'' +
                ", address=" + address +
                ", email=" + email +
                ", phone=" + phone +
                '}';
    }
}
