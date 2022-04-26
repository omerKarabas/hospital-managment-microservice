package com.hospitalmanagment.patient.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospitalmanagment.patient.entity.PatientEntity;

public interface PatientEntityReadableRepository extends JpaRepository<PatientEntity, Integer> {

}
