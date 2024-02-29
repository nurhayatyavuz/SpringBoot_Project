package com.example.springboot2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "kullanici")
public class Kullanici {
    @Id
    private long id;
    private String ad;
    private  String soyad;
}
