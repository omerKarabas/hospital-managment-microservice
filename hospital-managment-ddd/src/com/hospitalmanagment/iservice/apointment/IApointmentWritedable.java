package com.hospitalmanagment.iservice.apointment;

import java.util.Optional;

import com.hospitalmanagment.aggreagate.Apointment;
import com.hospitalmanagment.valueobject.appointment.ApointmentDate;
import com.hospitalmanagment.valueobject.appointment.ApointmentId;
import com.hospitalmanagment.valueobject.patient.PatientId;

public interface IApointmentWritedable {

	Optional<Apointment> addApointment(Apointment apointment);
	Optional<Apointment> removeApointmentByApointmentId( ApointmentId apointmentId);
	Optional<Apointment> removeApointmentByPatientId(PatientId patientId);
	Optional<Apointment> updateApointmentByDate(ApointmentId apointmentId, ApointmentDate apointmentDate);
	
}
