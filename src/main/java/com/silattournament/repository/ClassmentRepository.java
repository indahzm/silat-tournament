package com.silattournament.repository;

import com.silattournament.entity.Classment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassmentRepository extends JpaRepository<Classment, String> {
}
