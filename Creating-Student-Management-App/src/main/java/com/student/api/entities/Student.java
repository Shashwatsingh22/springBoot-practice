package com.student.api.entities;

public class Student {
    private long stdID;
    private String name;
    private String city;
    private long phoneNum;
    private String standard;
    private String section;

    //Default Constructor

    public Student() {
        super();
    }

    //Parameter Constructor
    public Student(long stdID, String name, String city, long phoneNum, String standard, String section) {
        this.stdID = stdID;
        this.name = name;
        this.city = city;
        this.phoneNum = phoneNum;
        this.standard = standard;
        this.section = section;
    }

    public long getStdID() {
        return stdID;
    }

    public void setStdID(long stdID) {
        this.stdID = stdID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public long getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(long phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stdID=" + stdID +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", phoneNum=" + phoneNum +
                ", standard='" + standard + '\'' +
                ", section='" + section + '\'' +
                '}';
    }
}
