package com.silattournament.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "participant")
public class Participant extends BaseEntity{

    @Column (name = "name")
    private String name;

    @Column (name = "agency")
    private String agency;

    @Column (name = "number")
    private Integer number;

    @JoinColumn
    @ManyToOne
    private Classment classment;

    @JoinColumn
    @ManyToOne
    private Competition competition;
}
