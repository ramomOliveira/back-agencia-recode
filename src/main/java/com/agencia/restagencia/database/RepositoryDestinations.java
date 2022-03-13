package com.agencia.restagencia.database;

import com.agencia.restagencia.entity.Destinations;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryDestinations extends MongoRepository<Destinations, String> {

}
