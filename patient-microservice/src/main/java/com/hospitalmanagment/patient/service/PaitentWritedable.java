package com.hospitalmanagment.patient.service;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.hospitalmanagment.patient.dto.PatientRequest;
import com.hospitalmanagment.patient.dto.PatientResponse;
import com.hospitalmanagment.patient.exception.RestExceptionBase;
import com.hospitalmanagment.patient.iservice.IPatientWritedable;
import com.hospitalmanagment.valueobject.IdentityNo;

@Service
public class PaitentWritedable implements IPatientWritedable {

	private IPatientWritedable iPatientWritedable;
	private ModelMapper modelMapper;

	public PaitentWritedable(ModelMapper modelMapper) {
		super();
		this.modelMapper = modelMapper;
	}

	@Override
	public Optional<PatientResponse> addPatient(PatientRequest patientRequest) {
		try {
			var addPatient = iPatientWritedable.addPatient(patientRequest);
			var result = modelMapper.map(addPatient, PatientResponse.class);
			return Optional.of(result);

		} catch (Exception e) {
			throw new RestExceptionBase("Something is wrong.", 0);
		}
	}

	@Override
	public Optional<PatientResponse> updatePatientInformationByIdentityNo(IdentityNo identityNo,
			PatientRequest patientRequest) {
		try {
			var findPatient = iPatientWritedable.updatePatientInformationByIdentityNo(identityNo, patientRequest);
			var result = modelMapper.map(findPatient, PatientResponse.class);

			return Optional.of(result);

		} catch (Exception e) {
			throw new RestExceptionBase("Something is wrong.", 0);
		}
	}


	@Override
	public Optional<PatientResponse> removePatient(IdentityNo identityNo) {
		try {
			var removedPatient = iPatientWritedable.removePatient(identityNo);
			var result = modelMapper.map(removedPatient, PatientResponse.class);

			return Optional.of(result);

		} catch (Exception e) {
			throw new RestExceptionBase("Something is wrong.", 0);
		}
	}

}
