package com.klu.model;

import org.springframework.stereotype.Component;

@Component
public class Certification {

    private int id;
    private String course;
    private String date_Of_Completion;

    public Certification() {
        this.id = 301;
        this.course = "Spring Core";
        this.date_Of_Completion = "25-Jan-2026";
    }

    @Override
    public String toString() {
        return "Course [id = " + id +
               ", course = " + course +
               ", date_Of_Completion = " + date_Of_Completion + "]";
    }
}