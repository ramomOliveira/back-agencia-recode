package com.agencia.restagencia;

import java.util.List;
import java.util.Optional;

import com.agencia.restagencia.database.RepositoryPackages;
import com.agencia.restagencia.entity.Packages;

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
@RequestMapping("/packages")
public class PackagesREST {
    @Autowired
    private RepositoryPackages repositoryPackages;

    @GetMapping
    public List<Packages> consult() {
        return repositoryPackages.findAll();
    }

    @GetMapping("{id}")
    public Optional<Packages> findById(@PathVariable String id) {
        return repositoryPackages.findById(id);
    }

    @PostMapping
    public void toSave(@RequestBody Packages packages) {
        repositoryPackages.save(packages);
    }

    @PutMapping("{id}")
    public void toAlter(@RequestBody Packages packages, @PathVariable String id) {
        packages.setId(id);
        repositoryPackages.save(packages);
    }

    @DeleteMapping("{id}")
    public void toDelete(@PathVariable String id) {
        repositoryPackages.deleteById(id);
    }
}
