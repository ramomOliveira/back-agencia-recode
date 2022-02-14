package com.agencia.restagencia;

import java.util.List;

import com.agencia.restagencia.database.RepositoryAdmin;
import com.agencia.restagencia.entity.Admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminREST {
    @Autowired
    private RepositoryAdmin repositoryAdmin;

    @GetMapping
    public List<Admin> consult() {
        return repositoryAdmin.findAll();
    }

    @PostMapping
    public void toSave(@RequestBody Admin admin) {
        repositoryAdmin.save(admin);
    }

    @PutMapping
    public void toAlter(@RequestBody Admin admin) {
        if (admin.getId() > 0) {
            repositoryAdmin.save(admin);
        }
    }

    @DeleteMapping
    public void toDelete(@RequestBody Admin admin) {
        repositoryAdmin.delete(admin);
    }

}
