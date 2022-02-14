package com.agencia.restagencia;

import java.util.List;

import com.agencia.restagencia.database.RepositoryClient;
import com.agencia.restagencia.entity.Client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class ClientREST {
    @Autowired
    private RepositoryClient repositoryClient;

    @GetMapping
    public List<Client> consult() {
        return repositoryClient.findAll();
    }

    @PostMapping
    public void toSave(@RequestBody Client client) {
        repositoryClient.save(client);
    }

    @PutMapping
    public void toAlter(@RequestBody Client client) {
        if (client.getCpf() != "")
            repositoryClient.save(client);
    }

    @DeleteMapping
    public void toDelete(@RequestBody Client client) {
        repositoryClient.delete(client);
    }

}
