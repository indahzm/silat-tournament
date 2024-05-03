package com.silattournament.service.impl;

import com.silattournament.entity.Participant;
import com.silattournament.repository.ParticipantRepository;
import com.silattournament.service.ParticipantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class ParticipantServiceImpl implements ParticipantService {

    @Autowired
    private ParticipantRepository participantRepository;

    @Override
    public List<Participant> findAll() {
        return participantRepository.findAll();
    }
}
