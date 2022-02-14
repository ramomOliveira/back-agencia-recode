package com.agencia.restagencia.database;

import com.agencia.restagencia.entity.Admin;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryAdmin extends JpaRepository<Admin, Long> {

}
