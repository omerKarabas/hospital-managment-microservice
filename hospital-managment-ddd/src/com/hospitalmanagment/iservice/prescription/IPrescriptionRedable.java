package com.hospitalmanagment.iservice.prescription;

import java.util.List;
import java.util.Optional;

import com.hospitalmanagment.aggreagate.Prescription;
import com.hospitalmanagment.valueobject.doctor.DoctorId;
import com.hospitalmanagment.valueobject.medicine.MedicineId;
import com.hospitalmanagment.valueobject.patient.PatientId;
import com.hospitalmanagment.valueobject.prescription.PrescriptionId;

public interface IPrescriptionRedable {

	List<Prescription> findAllPrescription ();
	Optional<Prescription> findPrescriptionByPrescriptionId(PrescriptionId prescriptionId);
	List<Prescription> findPrescriptionByDoctorId(DoctorId doctorId);
	List<Prescription> findPrescriptionByPatientId(PatientId patientId);
	List<Prescription> findPrescriptionByMedicineId(MedicineId medicineId);
	Optional<Prescription> findPrescriptionByPrescriptionIdAndDoctorId(PrescriptionId prescriptionId, DoctorId doctorId);
	Optional<Prescription> findPrescriptionByPrescriptionIdAndPatientId(PrescriptionId prescriptionId,PatientId patientId);
	List<Prescription> findPrescriptionByDoctorIdAndPatientId(DoctorId doctorId,PatientId patientId);
}
