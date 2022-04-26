package com.hospitalmanagment.repository.prescription;

import java.util.Optional;

import com.hospitalmanagment.aggreagate.Prescription;
import com.hospitalmanagment.valueobject.prescription.PrescriptionId;

public interface PrescriptionWritedableRepository {

	Optional<Prescription> addPrescription(Prescription prescription);
	Optional<Prescription> removePrescription(PrescriptionId prescriptionId);
}
