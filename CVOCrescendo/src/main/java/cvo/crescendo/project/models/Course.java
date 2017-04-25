package cvo.crescendo.project.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Date;
import java.util.List;
//import org.codehaus.jackson.annotate.JsonIgnoreProperties;
//import jackson-databind-master;

import org.springframework.data.annotation.Id;


/**
 * Created by Alexander on 21/04/2017.
 */
public class Course {

    @Id
    private String id;

    private String name;
    private int nrOfRegistrations;
    private int maxRegistrations;
    private Date startDate;
    private Date registrationDate;
    private Date endDate;
    private int semester;
    private float registrationCost;
    private float extraCosts;
    private String type;
    private List<String> exchangeCodes;
    private String departmentName;
    private Department department;
    private boolean hasRightToEducationalLeave;
    private int officialCourseDuration;
    private String thirdPartyRef;
    private String remarks;
    private Teacher mainTeacher;
    private Teacher otherTeachers;
    private List<Modules> modules;

    public Course() {

    }

    public Course(String name) {
        this.name = name;
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

    public int getNrOfRegistrations() {
        return nrOfRegistrations;
    }

    public void setNrOfRegistrations(int nrOfRegistrations) {
        this.nrOfRegistrations = nrOfRegistrations;
    }

    public int getMaxRegistrations() {
        return maxRegistrations;
    }

    public void setMaxRegistrations(int maxRegistrations) {
        this.maxRegistrations = maxRegistrations;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public float getRegistrationCost() {
        return registrationCost;
    }

    public void setRegistrationCost(float registrationCost) {
        this.registrationCost = registrationCost;
    }

    public float getExtraCosts() {
        return extraCosts;
    }

    public void setExtraCosts(float extraCosts) {
        this.extraCosts = extraCosts;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getExchangeCodes() {
        return exchangeCodes;
    }

    public void setExchangeCodes(List<String> exchangeCodes) {
        this.exchangeCodes = exchangeCodes;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public boolean isHasRightToEducationalLeave() {
        return hasRightToEducationalLeave;
    }

    public void setHasRightToEducationalLeave(boolean hasRightToEducationalLeave) {
        this.hasRightToEducationalLeave = hasRightToEducationalLeave;
    }

    public int getOfficialCourseDuration() {
        return officialCourseDuration;
    }

    public void setOfficialCourseDuration(int officialCourseDuration) {
        this.officialCourseDuration = officialCourseDuration;
    }

    public String getThirdPartyRef() {
        return thirdPartyRef;
    }

    public void setThirdPartyRef(String thirdPartyRef) {
        this.thirdPartyRef = thirdPartyRef;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Teacher getMainTeacher() {
        return mainTeacher;
    }

    public void setMainTeacher(Teacher mainTeacher) {
        this.mainTeacher = mainTeacher;
    }

    public Teacher getOtherTeachers() {
        return otherTeachers;
    }

    public void setOtherTeachers(Teacher otherTeachers) {
        this.otherTeachers = otherTeachers;
    }

    public List<Modules> getModules() {
        return modules;
    }

    public void setModules(List<Modules> modules) {
        this.modules = modules;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", nrOfRegistrations=" + nrOfRegistrations +
                ", maxRegistrations=" + maxRegistrations +
                ", startDate=" + startDate +
                ", registrationDate=" + registrationDate +
                ", endDate=" + endDate +
                ", semester=" + semester +
                ", registrationCost=" + registrationCost +
                ", extraCosts=" + extraCosts +
                ", type='" + type + '\'' +
                ", exchangeCodes=" + exchangeCodes +
                ", departmentName='" + departmentName + '\'' +
                ", department=" + department +
                ", hasRightToEducationalLeave=" + hasRightToEducationalLeave +
                ", officialCourseDuration=" + officialCourseDuration +
                ", thirdPartyRef='" + thirdPartyRef + '\'' +
                ", remarks='" + remarks + '\'' +
                ", mainTeacher=" + mainTeacher +
                ", otherTeachers=" + otherTeachers +
                ", modules=" + modules +
                '}';
    }
}
