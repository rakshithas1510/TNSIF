package com.example.demo;

import jakarta.persistence.*;

@Entity
@Table(name = "placement")
public class Placement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Long collegeId;
    private String collegeName;
    private String date;       // stored as String now
    private String qualification;
    private Integer year;

    public Placement() {
        super();
    }

    public Placement(Long id, String name, Long collegeId, String collegeName,
                     String date, String qualification, Integer year) {
        super();
        this.id = id;
        this.name = name;
        this.collegeId = collegeId;
        this.collegeName = collegeName;
        this.date = date;
        this.qualification = qualification;
        this.year = year;
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(Long collegeId) {
        this.collegeId = collegeId;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Placement [id=" + id + ", name=" + name + ", collegeId=" + collegeId
                + ", collegeName=" + collegeName + ", date=" + date
                + ", qualification=" + qualification + ", year=" + year + "]";
    }
}
