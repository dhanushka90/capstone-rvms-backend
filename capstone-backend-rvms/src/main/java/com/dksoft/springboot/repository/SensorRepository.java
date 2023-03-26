package com.dksoft.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dksoft.springboot.model.Sensor;

@Repository
public interface SensorRepository extends JpaRepository<Sensor, Long>{

}
