package com.silattournament.service;

import com.silattournament.entity.Competition;

import java.util.List;

public interface CompetitionService {
    List<Competition> findAll();
    Competition save(Competition competition);

    Competition findById(String id);

}
