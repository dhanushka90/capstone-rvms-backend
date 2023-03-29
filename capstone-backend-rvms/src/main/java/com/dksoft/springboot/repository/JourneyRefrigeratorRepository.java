package com.dksoft.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dksoft.springboot.model.JourneyRefrigerator;

@Repository
public interface JourneyRefrigeratorRepository extends JpaRepository<JourneyRefrigerator, Long>{

}