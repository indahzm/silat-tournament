package com.silattournament.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "classment")
public class Classment extends BaseEntity{

    @Column(name = "starting_age")
    private Integer startingAge;

    @Column(name = "ending_age")
    private Integer endingAge;

    @Column(name = "classment_name")
    private String classmentName;

    @Column (name = "gender")
    private String gender;

}
