package com.silattournament.service;

import com.silattournament.entity.Participant;

import java.util.List;

public interface ParticipantService {

    List<Participant> findAll();

    Participant save(Participant participant);
}
