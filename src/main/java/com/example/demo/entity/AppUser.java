package com.example.demo.entity;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.ManyToAny;

import com.sun.istack.NotNull;

public class AppUser {
@Id
private String username;
@NotNull
private String password;
@NotNull
private int active;
@ManyToMany()
private Collection<AppRole> roles=new ArrayList<>();
}
