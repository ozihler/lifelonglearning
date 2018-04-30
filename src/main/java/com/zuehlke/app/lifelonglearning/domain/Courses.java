package com.zuehlke.app.lifelonglearning.domain;

import java.util.ArrayList;
import java.util.List;

public class Courses {
    private List<Course> courses;


    public static Courses create(List<Course> courses) {
        return new Courses(courses);
    }

    public static Courses create(String... courseNames) {
        List<Course> courses = new ArrayList<>();
        for (String courseName : courseNames) {
            courses.add(new Course(courseName));
        }
        return create(courses);
    }

    private Courses(List<Course> courses) {
        this.courses = courses;
    }

    public List<Course> getCourses() {
        return courses;
    }
}
