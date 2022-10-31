package com.example.parking.fines.demo.repository;

import com.example.parking.fines.demo.model.Citizen;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CitizenRepository extends JpaRepository<Citizen, Integer>{
}
