package com.agencia.restagencia;

import java.util.List;
import java.util.Optional;

import com.agencia.restagencia.database.RepositoryClient;
import com.agencia.restagencia.entity.Client;

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
@RequestMapping("/client")
public class ClientREST {
    @Autowired
    private RepositoryClient repositoryClient;

    @GetMapping
    public List<Client> consult() {
        return repositoryClient.findAll();
    }

    @GetMapping("{id}")
    public Optional<Client> findById(@PathVariable String id) {
        return repositoryClient.findById(id);
    }

    @PostMapping
    public void toSave(@RequestBody Client client) {
        repositoryClient.save(client);
    }

    @PutMapping("{id}")
    public void changeClient(@RequestBody Client client, @PathVariable String id) {
        client.setId(id);
        repositoryClient.save(client);
    }

    @DeleteMapping("{id}")
    public void deleteClient(@PathVariable String id) {
        repositoryClient.deleteById(id);
    }

}
