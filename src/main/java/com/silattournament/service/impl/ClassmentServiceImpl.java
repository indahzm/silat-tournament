package com.silattournament.service.impl;

import com.silattournament.entity.Classment;
import com.silattournament.repository.ClassmentRepository;
import com.silattournament.service.ClassmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class ClassmentServiceImpl implements ClassmentService {

    @Autowired
    private ClassmentRepository classmentRepository;

    @Override
    public List<Classment> findAll() {
        return classmentRepository.findAll();
    }

    @Override
    public Classment save(Classment classment) {
        return classmentRepository.save(classment);
    }



}
