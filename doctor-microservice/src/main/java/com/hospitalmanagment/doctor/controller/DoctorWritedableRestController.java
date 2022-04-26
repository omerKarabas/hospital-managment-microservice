package com.hospitalmanagment.doctor.controller;

import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

import com.hospitalmanagment.doctor.dto.DoctorRequest;
import com.hospitalmanagment.doctor.dto.DoctorResponse;
import com.hospitalmanagment.doctor.iservice.IDoctorWritedableService;
import com.hospitalmanagment.valueobject.FullName;
import com.hospitalmanagment.valueobject.Gender;
import com.hospitalmanagment.valueobject.Specialty;
import com.hospitalmanagment.valueobject.doctor.DoctorId;
import com.hospitalmanagment.valueobject.doctor.Status;

@RestController
@RequestMapping("/doctorWritedable")
@RequestScope
@CrossOrigin
public class DoctorWritedableRestController {

	private IDoctorWritedableService idoctorWritedableService;

	public DoctorWritedableRestController(IDoctorWritedableService idoctorWritedableService) {
		super();
		this.idoctorWritedableService = idoctorWritedableService;
	}
	@PostMapping("/addDoctor")
	public Optional<DoctorResponse> addDoctor(@RequestBody DoctorRequest doctorRequest){
		return idoctorWritedableService.addDoctor(doctorRequest);
	}
	@DeleteMapping("/{doctorId}")
	public Optional<DoctorResponse> removeDoctor(@PathVariable(name="doctorId")DoctorId doctorId){
		return idoctorWritedableService.removeDoctor(doctorId);
	}

	@PutMapping("/updateDoctorByName")
	public Optional<DoctorResponse> updateDoctorByName(@PathVariable(name="doctorId")DoctorId doctorId, FullName fullName){
		return idoctorWritedableService.updateDoctorByName(doctorId, fullName);
	}
	@PutMapping("/updateDoctorByGender")
	public Optional<DoctorResponse> updateDoctorByGender(@PathVariable(name="doctorId")DoctorId doctorId, Gender gender){
		return idoctorWritedableService.updateDoctorByGender(doctorId, gender);
	}
	@PutMapping("/updateDoctorByStatu")
	public Optional<DoctorResponse> updateDoctorByStatu(@PathVariable(name="doctorId")DoctorId doctorId, Status statu){
		return idoctorWritedableService.updateDoctorByStatu(doctorId, statu);
	}
	@PutMapping("/updateDoctorBySpecialty")
	public Optional<DoctorResponse> updateDoctorBySpecialty(@PathVariable(name="doctorId")DoctorId doctorId, Specialty specialty){
		return idoctorWritedableService.updateDoctorBySpecialty(doctorId, specialty);
	}
	
}
