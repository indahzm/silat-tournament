package com.silattournament.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table (name = "competition")
public class Competition extends BaseEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "boundaries")
    private String boundaries; //tingkat kota dll

    @Column(name = "description")
    private String description;

}
