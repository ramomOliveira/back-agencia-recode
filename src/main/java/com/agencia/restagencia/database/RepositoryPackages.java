package com.agencia.restagencia.database;

import com.agencia.restagencia.entity.Packages;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryPackages extends MongoRepository<Packages, String> {

}
