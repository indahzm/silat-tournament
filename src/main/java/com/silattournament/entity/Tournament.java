package com.silattournament.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "tournament")
public class Tournament extends BaseEntity {

    @Column(name = "part")
    private Integer part;

    @JoinColumn
    @ManyToOne
    private Participant red;

    @JoinColumn
    @ManyToOne
    private Participant blue;

    @JoinColumn
    @ManyToOne
    private Participant winner;
}
