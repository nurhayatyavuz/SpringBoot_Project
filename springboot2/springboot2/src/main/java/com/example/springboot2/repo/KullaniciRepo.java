package com.example.springboot2.repo;

import com.example.springboot2.model.Kullanici;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface KullaniciRepo extends JpaRepository<Kullanici,Long> {
}
