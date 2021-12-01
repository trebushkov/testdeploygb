package com.example.deploydemo.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Data
@Entity
public class Test {
    @Id
    @GeneratedValue
    private UUID id;

    private String name;
}
