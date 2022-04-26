package com.hospitalmanagment.service.prescription;

import java.util.List;
import java.util.Optional;

import com.hospitalmanagment.aggreagate.Prescription;
import com.hospitalmanagment.iservice.prescription.IPrescriptionRedable;
import com.hospitalmanagment.repository.prescription.PrescriptionReadableRepository;
import com.hospitalmanagment.valueobject.doctor.DoctorId;
import com.hospitalmanagment.valueobject.medicine.MedicineId;
import com.hospitalmanagment.valueobject.patient.PatientId;
import com.hospitalmanagment.valueobject.prescription.PrescriptionId;

public class PrescriptionReadable implements IPrescriptionRedable{

	private PrescriptionReadableRepository prescriptionReadableRepository;

	public PrescriptionReadable(PrescriptionReadableRepository prescriptionReadableRepository) {
		super();
		this.prescriptionReadableRepository = prescriptionReadableRepository;
	}

	@Override
	public List<Prescription> findAllPrescription() {
		var prescriptions = prescriptionReadableRepository.findAllPrescription();
		return prescriptions;
	}

	@Override
	public Optional<Prescription> findPrescriptionByPrescriptionId(PrescriptionId prescriptionId) {
		var prescription = prescriptionReadableRepository.findPrescriptionByPrescriptionId(prescriptionId);
		return prescription;
	}

	@Override
	public List<Prescription> findPrescriptionByDoctorId(DoctorId doctorId) {
		var prescriptons = prescriptionReadableRepository.findPrescriptionByDoctorId(doctorId);
		return prescriptons;
	}

	@Override
	public List<Prescription> findPrescriptionByPatientId(PatientId patientId) {
		var prescriptions = prescriptionReadableRepository.findPrescriptionByPatientId(patientId);
		return prescriptions;
	}

	@Override
	public List<Prescription> findPrescriptionByMedicineId(MedicineId medicineId) {
		var prescriptions = prescriptionReadableRepository.findPrescriptionByMedicineId(medicineId);
		return prescriptions;
	}

	@Override
	public Optional<Prescription> findPrescriptionByPrescriptionIdAndDoctorId(PrescriptionId prescriptionId,
			DoctorId doctorId) {
		var prescriptions = prescriptionReadableRepository.findPrescriptionByPrescriptionIdAndDoctorId(prescriptionId, doctorId);
		return prescriptions;
	}

	@Override
	public Optional<Prescription> findPrescriptionByPrescriptionIdAndPatientId(PrescriptionId prescriptionId,
			PatientId patientId) {
		var prescription = prescriptionReadableRepository.findPrescriptionByPrescriptionIdAndPatientId(prescriptionId, patientId);
		return prescription;
	}

	@Override
	public List<Prescription> findPrescriptionByDoctorIdAndPatientId(DoctorId doctorId, PatientId patientId) {
		var prescriptions = prescriptionReadableRepository.findPrescriptionByDoctorIdAndPatientId(doctorId, patientId);
		return prescriptions;
	}
	
	
}
