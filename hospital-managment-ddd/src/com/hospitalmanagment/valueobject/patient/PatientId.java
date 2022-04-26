package com.hospitalmanagment.valueobject.patient;

import java.util.Objects;

import com.hospitalmanagment.annotaions.ValueObject;

@ValueObject
public final class PatientId {

	private int patientId;

	public static PatientId of(int patientId) {
		return new PatientId(patientId);
	}
	private PatientId(int patientId) {
		super();
		this.patientId = patientId;
	}

	public int getPatientId() {
		return patientId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(patientId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PatientId other = (PatientId) obj;
		return patientId == other.patientId;
	}

	@Override
	public String toString() {
		return "PatientId [patientId=" + patientId + "]";
	}

	
}
