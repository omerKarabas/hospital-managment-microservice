package com.hospitalmanagment.service.prescription;

import java.util.Optional;

import com.hospitalmanagment.aggreagate.Prescription;
import com.hospitalmanagment.iservice.prescription.IPrescriptionWritedable;
import com.hospitalmanagment.repository.prescription.PrescriptionWritedableRepository;
import com.hospitalmanagment.valueobject.prescription.PrescriptionId;

public class PrescriptionWritedable implements IPrescriptionWritedable {

	private PrescriptionWritedableRepository prescriptionWritedableRepository;

	public PrescriptionWritedable(PrescriptionWritedableRepository prescriptionWritedableRepository) {
		super();
		this.prescriptionWritedableRepository = prescriptionWritedableRepository;
	}

	@Override
	public Optional<Prescription> addPrescription(Prescription prescription) {
		var addedPrescription = prescriptionWritedableRepository.addPrescription(prescription);
		return addedPrescription;
	}

	@Override
	public Optional<Prescription> removePrescription(PrescriptionId prescriptionId) {
		var removedPrescription = prescriptionWritedableRepository.removePrescription(prescriptionId);
		return removedPrescription;
	}

}
