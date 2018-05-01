package com.zuehlke.app.lifelonglearning.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Account {

    @Id
    @GeneratedValue
    private Long id;
    private String username;
    @JsonIgnore
    private String password;

    @ManyToMany(mappedBy = "accounts")
    private Set<Module> modules = new HashSet<>();

    private Account() {
    } // JPA only

    public Account(final String username, final String password) {
        this.username = username;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Set<Module> getModules() {
        return modules;
    }
}