package com.silattournament.service;

import com.silattournament.entity.Classment;

import java.util.List;

public interface ClassmentService {
    List<Classment> findAll();
    Classment save(Classment classment);
}
