package com.silattournament.service.impl;

import com.silattournament.entity.Competition;
import com.silattournament.repository.CompetitionRepository;
import com.silattournament.service.CompetitionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Transactional
@Service
public class CompetitionServiceImpl implements CompetitionService {

    @Autowired
    private CompetitionRepository competitionRepository;
    @Override
    public List<Competition> findAll() {
        return competitionRepository.findAll();
    }

    @Override
    public Competition save(Competition competition) {
        if(competition.getId().isEmpty()) {
            competition.setCreatedAt(new Date());
            competition.setId(UUID.randomUUID().toString());
            competition.setCreatedById("1");
        } else {
            Competition competitionExit = findById(competition.getId());
            competition.setCreatedAt(competitionExit.getCreatedAt());
            competition.setCreatedById(competitionExit.getCreatedById());
        }
        competition.setUpdatedAt(new Date());
        competition.setUpdatedById("1");
        return competitionRepository.save(competition);
    }

    @Override
    public Competition findById(String id) {
        Optional<Competition> competitionOpt = competitionRepository.findById(id);
        return competitionOpt.isPresent() ? competitionOpt.get() : new Competition();
    }
}
