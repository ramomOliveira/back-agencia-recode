package com.agencia.restagencia;

import java.util.List;
import java.util.Optional;

import com.agencia.restagencia.database.RepositoryDestinations;
import com.agencia.restagencia.entity.Destinations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/destinations")
public class DestinationsREST {
    @Autowired
    private RepositoryDestinations repositoryDestinations;

    @GetMapping
    public List<Destinations> consult() {
        return repositoryDestinations.findAll();
    }

    @GetMapping("{id}")
    public Optional<Destinations> findById(@PathVariable String id) {
        return repositoryDestinations.findById(id);
    }

    @PostMapping
    public void toSave(@RequestBody Destinations destinations) {
        repositoryDestinations.save(destinations);
    }

    @PutMapping("{id}")
    public void changeDestination(@RequestBody Destinations destinations, @PathVariable String id) {
        destinations.setId(id);
        repositoryDestinations.save(destinations);
    }

    @DeleteMapping("{id}")
    public void toDelete(@PathVariable String id) {
        repositoryDestinations.deleteById(id);
    }
}
