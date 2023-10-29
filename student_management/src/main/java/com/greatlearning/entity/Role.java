package com.greatlearning.entity;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "roles")
@Data
public class Role {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id", nullable = true)
    private int Id;

    @Column(name = "name")
    private String name;




}
