package com.zuehlke.app.lifelonglearning.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class Course {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @JsonIgnore
    @ManyToOne
    private Module module;

    private Course() {
        //JPA only
    }

    public Course(final Module module, final String name) {
        this.module = module;
        this.name = name;

    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Module getModule() {
        return module;
    }


}
