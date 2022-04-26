package com.hospitalmanagment.valueobject.medicine;

import java.util.Objects;

import com.hospitalmanagment.annotaions.ValueObject;

@ValueObject
public final class MedicineName {

	private String medicineName;

	public static MedicineName of(String medicineName) {
		return new MedicineName(medicineName);
	}
	private MedicineName(String medicineName) {
		super();
		this.medicineName = medicineName;
	}

	public String getMedicineName() {
		return medicineName;
	}

	@Override
	public int hashCode() {
		return Objects.hash(medicineName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MedicineName other = (MedicineName) obj;
		return Objects.equals(medicineName, other.medicineName);
	}

	@Override
	public String toString() {
		return "MedicineName [medicineName=" + medicineName + "]";
	}
	
	
}
