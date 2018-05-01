package com.zuehlke.app.lifelonglearning.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Module {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @OneToMany(mappedBy = "module")
    private Set<Course> courses = new HashSet<>();

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable
    private Set<Account> accounts = new HashSet<>();

    private Module() {
        //JPA only
    }

    public Module(String name, Set<Account> accounts) {
        this.name = name;
        this.accounts = accounts;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Set<Course> getCourses() {
        return courses;
    }

    public Set<Account> getAccounts() {
        return accounts;
    }
}
