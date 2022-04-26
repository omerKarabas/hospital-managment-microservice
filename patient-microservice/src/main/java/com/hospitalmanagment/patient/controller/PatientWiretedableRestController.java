package com.hospitalmanagment.patient.controller;

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

import com.hospitalmanagment.patient.iservice.IPatientWritedable;
import com.hospitalmanagment.patient.dto.PatientRequest;
import com.hospitalmanagment.patient.dto.PatientResponse;
import com.hospitalmanagment.valueobject.IdentityNo;

@RestController
@RequestMapping("/patientWiretedable")
@RequestScope
@CrossOrigin
public class PatientWiretedableRestController {

	private IPatientWritedable iPatientWritedable;

	public PatientWiretedableRestController(IPatientWritedable iPatientWritedable) {
		super();
		this.iPatientWritedable = iPatientWritedable;
	} 
	@PostMapping("/addPatient")
	Optional<PatientResponse> addPatient(@RequestBody PatientRequest patientRequest){
		return iPatientWritedable.addPatient(patientRequest);
	}
	@DeleteMapping("/removePatient")
	Optional<PatientResponse> removePatient(@PathVariable(name="identityNo") IdentityNo identityNo){
		return iPatientWritedable.removePatient(identityNo);
	}
	@PutMapping("/updatePatientInformationByIdentityNo")
	Optional<PatientResponse> updatePatientInformationByIdentityNo(IdentityNo identityNo, @RequestBody PatientRequest patientRequest){
		return iPatientWritedable.updatePatientInformationByIdentityNo(identityNo, patientRequest);
	}
	

}
