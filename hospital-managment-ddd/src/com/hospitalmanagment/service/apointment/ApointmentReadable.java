package com.hospitalmanagment.service.apointment;

import java.util.List;
import java.util.Optional;

import com.hospitalmanagment.aggreagate.Apointment;
import com.hospitalmanagment.iservice.apointment.IApointmentReadable;
import com.hospitalmanagment.repository.apointment.ApointmentReadableRepository;
import com.hospitalmanagment.valueobject.appointment.ApointmentDate;
import com.hospitalmanagment.valueobject.appointment.ApointmentId;
import com.hospitalmanagment.valueobject.hospital.HospitalName;
import com.hospitalmanagment.valueobject.patient.PatientId;

public class ApointmentReadable implements IApointmentReadable {

	private ApointmentReadableRepository apointmentReadableRepository;

	public ApointmentReadable(ApointmentReadableRepository apointmentReadableRepository) {
		super();
		this.apointmentReadableRepository = apointmentReadableRepository;
	}

	@Override
	public List<Apointment> findAll() {
		var apointments = apointmentReadableRepository.findAll();
		return apointments;
	}

	@Override
	public Optional<Apointment> findApointmentByApointmentId(ApointmentId apointmentId) {
		var apointment =apointmentReadableRepository.findApointmentByApointmentId(apointmentId);
		return apointment;
	}

	@Override
	public Optional<Apointment> findApointmentByPatientId(PatientId patientId) {
		var apointment = apointmentReadableRepository.findApointmentByPatientId(patientId);
		return apointment;
	}

	@Override
	public List<Apointment> findApointmentByDate(ApointmentDate apointmentDate) {
		var apointment = apointmentReadableRepository.findApointmentByDate(apointmentDate);
		return apointment;
	}

	@Override
	public List<Apointment> findApointmentByPatientIdAndDate(PatientId patientId, ApointmentDate apointmentDate) {
		var apointments = apointmentReadableRepository.findApointmentByPatientIdAndDate(patientId, apointmentDate);
		return apointments;
	}

	@Override
	public List<Apointment> findAllHospitalApointment(HospitalName hospitalName) {
		var apointments = apointmentReadableRepository.findAllHospitalApointment(hospitalName);
		return apointments;
	}

	

}
