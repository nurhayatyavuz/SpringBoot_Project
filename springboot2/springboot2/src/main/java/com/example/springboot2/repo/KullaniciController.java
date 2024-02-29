package com.example.springboot2.repo;

import com.example.springboot2.model.Kullanici;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KullaniciController {
    @Autowired
    KullaniciRepo repo;

    @PostMapping("/addPerson")
    public void addPerson(@RequestBody Kullanici person){
        repo.save(person);

    }
}
