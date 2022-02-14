package com.agencia.restagencia.database;

import com.agencia.restagencia.entity.Client;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryClient extends JpaRepository<Client, String> {

}
