package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.AppRole;

public interface AppRoleRepository extends JpaRepository<AppRole, String> {
	public AppRole findByRoleName(String roleName);

}
