package com.agencia.restagencia.database;

import com.agencia.restagencia.entity.Admin;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryAdmin extends MongoRepository<Admin, String> {

}
