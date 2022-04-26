package com.hospitalmanagment.valueobject.medicine;

import java.util.Objects;

import com.hospitalmanagment.annotaions.ValueObject;

@ValueObject
public final class MedicineId {

	private int medicineId;

	public static MedicineId of(int medicineId) {
		return new MedicineId(medicineId);
	}
	private MedicineId(int medicineId) {
		super();
		this.medicineId = medicineId;
	}

	public int getMedicineId() {
		return medicineId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(medicineId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MedicineId other = (MedicineId) obj;
		return medicineId == other.medicineId;
	}

	@Override
	public String toString() {
		return "MedicineId [medicineId=" + medicineId + "]";
	}
	
	
}
