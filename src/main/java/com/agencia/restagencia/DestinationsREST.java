package com.agencia.restagencia;

import java.util.List;

import com.agencia.restagencia.database.RepositoryDestinations;
import com.agencia.restagencia.entity.Destinations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/destinations")
public class DestinationsREST {
    @Autowired
    private RepositoryDestinations repositoryDestinations;

    @GetMapping
    public List<Destinations> consult() {
        return repositoryDestinations.findAll();
    }

    @PostMapping
    public void toSave(@RequestBody Destinations destinations) {
        repositoryDestinations.save(destinations);
    }

    @PutMapping
    public void toAlter(@RequestBody Destinations destinations) {
        if (destinations.getId() > 0)
            repositoryDestinations.save(destinations);
    }

    @DeleteMapping
    public void toDelete(@RequestBody Destinations destinations) {
        repositoryDestinations.delete(destinations);
    }
}
