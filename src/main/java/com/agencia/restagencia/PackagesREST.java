package com.agencia.restagencia;

import java.util.List;

import com.agencia.restagencia.database.RepositoryPackages;
import com.agencia.restagencia.entity.Packages;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
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

    @PostMapping
    public void toSave(@RequestBody Packages packages) {
        repositoryPackages.save(packages);
    }

    @PutMapping
    public void toAlter(@RequestBody Packages packages) {

        repositoryPackages.save(packages);
    }

    @DeleteMapping
    public void toDelete(@RequestBody Packages packages) {
        repositoryPackages.delete(packages);
    }
}
