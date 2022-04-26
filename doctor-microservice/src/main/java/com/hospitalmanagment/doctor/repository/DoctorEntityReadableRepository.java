package com.hospitalmanagment.doctor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospitalmanagment.doctor.entity.DoctorEntity;


public interface DoctorEntityReadableRepository extends JpaRepository<DoctorEntity,Integer> {

}
