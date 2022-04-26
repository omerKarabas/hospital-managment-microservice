package com.hospitalmanagment.repository.apointment;

import java.util.List;
import java.util.Optional;

import com.hospitalmanagment.aggreagate.Apointment;
import com.hospitalmanagment.valueobject.appointment.ApointmentDate;
import com.hospitalmanagment.valueobject.appointment.ApointmentId;
import com.hospitalmanagment.valueobject.hospital.HospitalName;
import com.hospitalmanagment.valueobject.patient.PatientId;

public interface ApointmentReadableRepository {

	List<Apointment> findAll();

	Optional<Apointment> findApointmentByApointmentId(ApointmentId apointmentId);

	Optional<Apointment> findApointmentByPatientId(PatientId patientId);

	List<Apointment> findApointmentByDate(ApointmentDate apointmentDate);

	List<Apointment> findApointmentByPatientIdAndDate(PatientId patientId, ApointmentDate apointmentDate);

	List<Apointment> findAllHospitalApointment(HospitalName hospitalName);
}
