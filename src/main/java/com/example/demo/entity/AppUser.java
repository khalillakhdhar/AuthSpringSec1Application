package com.example.demo.entity;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


import com.sun.istack.NotNull;
@Entity
public class AppUser {
@Id
private String username;
@NotNull
private String password;
@NotNull
private int active;
@ManyToMany(fetch= FetchType.EAGER)
private Collection<AppRole> roles=new ArrayList<>();
public AppUser() {
}
public AppUser(String username, String password, int active, Collection<AppRole> roles) {
	this.username = username;
	this.password = password;
	this.active = active;
	this.roles = roles;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public int getActive() {
	return active;
}
public void setActive(int active) {
	this.active = active;
}
public Collection<AppRole> getRoles() {
	return roles;
}
public void setRoles(Collection<AppRole> roles) {
	this.roles = roles;
}

}
