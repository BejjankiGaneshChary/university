package com.example.university.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examole.university.model.*;

@Repository
public interface ProfessorJpaRepository extends JpaRepository<Professor, Integer> {

}