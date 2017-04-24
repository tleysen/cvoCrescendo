package cvo.crescendo.project.models;

/**
 * Created by Alexander on 21/04/2017.
 */
public class Department {

    private String id;
    private String code;
    private String name;
    private String nrAdmgrp;
    private String admgrp;
    private String eduCode;
    private String eduName;
    private String area;

    public Department() {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNrAdmgrp() {
        return nrAdmgrp;
    }

    public void setNrAdmgrp(String nrAdmgrp) {
        this.nrAdmgrp = nrAdmgrp;
    }

    public String getAdmgrp() {
        return admgrp;
    }

    public void setAdmgrp(String admgrp) {
        this.admgrp = admgrp;
    }

    public String getEduCode() {
        return eduCode;
    }

    public void setEduCode(String eduCode) {
        this.eduCode = eduCode;
    }

    public String getEduName() {
        return eduName;
    }

    public void setEduName(String eduName) {
        this.eduName = eduName;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id='" + id + '\'' +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", nrAdmgrp='" + nrAdmgrp + '\'' +
                ", admgrp='" + admgrp + '\'' +
                ", eduCode='" + eduCode + '\'' +
                ", eduName='" + eduName + '\'' +
                ", area='" + area + '\'' +
                '}';
    }
}
