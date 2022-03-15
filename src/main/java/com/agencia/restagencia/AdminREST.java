package com.agencia.restagencia;

import java.util.List;
import java.util.Optional;

import com.agencia.restagencia.database.RepositoryAdmin;
import com.agencia.restagencia.entity.Admin;

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
@RequestMapping("/admin")
public class AdminREST {
    @Autowired
    private RepositoryAdmin repositoryAdmin;

    @GetMapping
    public List<Admin> consult() {
        return repositoryAdmin.findAll();
    }

    @GetMapping("{id}")
    public Optional<Admin> findById(@PathVariable String id) {
        return repositoryAdmin.findById(id);
    }

    @PostMapping
    public void toSave(@RequestBody Admin admin) {
        repositoryAdmin.save(admin);
    }

    @PutMapping("{id}")
    public void changeAdmin(@RequestBody Admin admin, @PathVariable String id) {
        admin.setId(id);
        repositoryAdmin.save(admin);

    }

    @DeleteMapping("{id}")
    public void toDelete(@PathVariable String id) {
        repositoryAdmin.deleteById(id);
    }

}
