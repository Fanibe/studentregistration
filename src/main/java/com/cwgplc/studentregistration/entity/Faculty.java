package com.cwgplc.studentregistration.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "faculty")
@Data
public class Faculty {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
}
