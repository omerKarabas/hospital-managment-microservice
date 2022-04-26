package com.hospitalmanagment.service.apointment;

import java.util.Optional;

import com.hospitalmanagment.aggreagate.Apointment;
import com.hospitalmanagment.event.apointment.ApointmentSaveSuccesfulAndRemove;
import com.hospitalmanagment.infra.EventPublisher;
import com.hospitalmanagment.iservice.apointment.IApointmentWritedable;
import com.hospitalmanagment.repository.apointment.ApointmentWritedableRepository;
import com.hospitalmanagment.valueobject.appointment.ApointmentDate;
import com.hospitalmanagment.valueobject.appointment.ApointmentId;
import com.hospitalmanagment.valueobject.patient.PatientId;

public class ApointmentWritedable implements IApointmentWritedable {
	
	private ApointmentWritedableRepository apointmentWritedableRepository;
	private EventPublisher eventPublisher;
	

	public ApointmentWritedable(ApointmentWritedableRepository apointmentWritedableRepository,
			EventPublisher eventPublisher) {
		super();
		this.apointmentWritedableRepository = apointmentWritedableRepository;
		this.eventPublisher = eventPublisher;
	}

	@Override
	public Optional<Apointment> addApointment(Apointment apointment) {
		Optional<Apointment> addedApointment = apointmentWritedableRepository.addApointment(apointment);
		addedApointment.ifPresent(
				apo -> eventPublisher.publish(new ApointmentSaveSuccesfulAndRemove(apo)));
		return addedApointment;
	}

	@Override
	public Optional<Apointment> removeApointmentByApointmentId(ApointmentId apointmentId) {
		Optional<Apointment> removedApointment = apointmentWritedableRepository.removeApointmentByApointmentId(apointmentId);
		removedApointment.ifPresent(
				removeApointment -> eventPublisher.publish(new ApointmentSaveSuccesfulAndRemove(removeApointment)));
		return removedApointment;
	}

	@Override
	public Optional<Apointment> removeApointmentByPatientId(PatientId patientId) {
		Optional<Apointment> removedApointment = apointmentWritedableRepository.removeApointmentByPatientId(patientId);
		removedApointment.ifPresent(
				removeApointment -> eventPublisher.publish(new ApointmentSaveSuccesfulAndRemove(removeApointment)));
		return removedApointment;
	}

	@Override
	public Optional<Apointment> updateApointmentByDate(ApointmentId apointmentId, ApointmentDate apointmentDate) {
		var uptadedApointmentDate = apointmentWritedableRepository.updateApointmentByDate(apointmentId, apointmentDate);
		uptadedApointmentDate.ifPresent(
				uptadedApointment -> eventPublisher.publish(new ApointmentSaveSuccesfulAndRemove(uptadedApointment)));
		return uptadedApointmentDate;
	}
	
	

}
