package com.hospitalmanagment.patient.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

import com.hospitalmanagment.patient.dto.PatientResponse;
import com.hospitalmanagment.patient.iservice.IPatientReadable;
import com.hospitalmanagment.valueobject.BirthYear;
import com.hospitalmanagment.valueobject.FullName;
import com.hospitalmanagment.valueobject.Gender;
import com.hospitalmanagment.valueobject.IdentityNo;
import com.hospitalmanagment.valueobject.patient.PatientId;

@RestController
@RequestMapping("/patientReadable")
@RequestScope
@CrossOrigin
public class PatientReadableRestController {

	private IPatientReadable iPatientReadable;
	
	public PatientReadableRestController(IPatientReadable iPatientReadable) {
		super();
		this.iPatientReadable = iPatientReadable;
	}

	@GetMapping("/findAllPatient")
	List<PatientResponse> findAllPatient(){
		return iPatientReadable.findAllPatient();
	}
	@GetMapping("/{patientId}")
	Optional<PatientResponse> findPatietByPatientId(@PathVariable(name="patientId") PatientId patientId){
		return iPatientReadable.findPatietByPatientId(patientId);
	}
	@GetMapping("/{identityNo}")
	Optional<PatientResponse> findPatientByIdentityNo(@PathVariable(name="identityNo")IdentityNo identityNo){
		return iPatientReadable.findPatientByIdentityNo(identityNo);
	}
	@GetMapping("/{fullName}")
	List<PatientResponse> findPatientByFullName(@PathVariable(name="identityNo") FullName fullName){
		return iPatientReadable.findPatientByFullName(fullName);
	}
	@GetMapping("/{firstName}")
	List<PatientResponse> findPatientByFirstName(@PathVariable(name="firstName")String firstName){
		return iPatientReadable.findPatientByFirstName(firstName);
	}
	@GetMapping("/{lastName}")
	List<PatientResponse> findPatientByLastName(@PathVariable(name="lastName")String lastName){
		return iPatientReadable.findPatientByLastName(lastName);
	}
	@GetMapping("/{birthYear}")
	List<PatientResponse> findPatientByBirthYear(@PathVariable(name="birthYear")BirthYear birthYear){
		return iPatientReadable.findPatientByBirthYear(birthYear);
	}
	@GetMapping("/{gender}")
	List<PatientResponse> findPatientByGender(@PathVariable(name="gender")Gender gender){
		return iPatientReadable.findPatientByGender(gender);
	}
	@GetMapping("/{birthYear}/{gender}")
	List<PatientResponse> findPatientByBirthYearAndGender(@PathVariable(name="birthYear")BirthYear birthYear,
														  @PathVariable(name="gender") Gender gender){
		return iPatientReadable.findPatientByBirthYearAndGender(birthYear, gender);
	}
}
