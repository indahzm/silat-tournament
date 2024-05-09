package com.silattournament.service;

import com.silattournament.entity.Tournament;

import java.util.List;

public interface TournamentService {
    List<Tournament> findAll();
    Tournament save(Tournament tournament);
}
