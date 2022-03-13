package com.agencia.restagencia.database;

import com.agencia.restagencia.entity.Client;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryClient extends MongoRepository<Client, String> {

}
