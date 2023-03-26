package com.dksoft.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dksoft.springboot.model.Device;

@Repository
public interface DeviceRepository extends JpaRepository<Device, Long>{

}
