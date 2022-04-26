package com.hospitalmanagment.valueobject.prescription;

import java.util.Objects;

import com.hospitalmanagment.annotaions.ValueObject;

@ValueObject
public final class PrescriptionId {

	private int prescriptionId;

	public static PrescriptionId of(int prescriptionId){
		return new PrescriptionId(prescriptionId);
	}
	
	private PrescriptionId(int prescriptionId) {
		super();
		this.prescriptionId = prescriptionId;
	}

	public int getPrescriptionId() {
		return prescriptionId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(prescriptionId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PrescriptionId other = (PrescriptionId) obj;
		return prescriptionId == other.prescriptionId;
	}

	@Override
	public String toString() {
		return "PrescriptionId [prescriptionId=" + prescriptionId + "]";
	}
	
}
