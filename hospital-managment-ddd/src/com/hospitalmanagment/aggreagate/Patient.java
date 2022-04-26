package com.hospitalmanagment.aggreagate;

import java.util.Date;
import java.util.Objects;

import com.hospitalmanagment.annotaions.Aggreagate;
import com.hospitalmanagment.valueobject.BirthYear;
import com.hospitalmanagment.valueobject.FullName;
import com.hospitalmanagment.valueobject.Gender;
import com.hospitalmanagment.valueobject.IdentityNo;
import com.hospitalmanagment.valueobject.patient.PatientId;

@Aggreagate
public class Patient {

	private PatientId patientId;
	private IdentityNo identityNo;
	private FullName fullName;
	private BirthYear birthYear;
	private Gender gender;

	public Patient(Builder builder) {
		this.patientId = builder.patientId;
		this.identityNo = builder.identityNo;
		this.fullName = builder.fullName;
		this.birthYear = builder.birthYear;
		this.gender = builder.gender;
	}

	public PatientId getPatientId() {
		return patientId;
	}

	public void setPatientId(PatientId patientId) {
		this.patientId = patientId;
	}

	public FullName getFullName() {
		return fullName;
	}

	public void setFullName(FullName fullName) {
		this.fullName = fullName;
	}

	public IdentityNo getIdentityNo() {
		return identityNo;
	}

	public void setIdentityNo(IdentityNo identityNo) {
		this.identityNo = identityNo;
	}

	public BirthYear getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(BirthYear birthYear) {
		this.birthYear = birthYear;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	@Override
	public int hashCode() {
		return Objects.hash(birthYear, fullName, gender, identityNo, patientId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Patient other = (Patient) obj;
		return Objects.equals(birthYear, other.birthYear) && Objects.equals(fullName, other.fullName)
				&& gender == other.gender && Objects.equals(identityNo, other.identityNo)
				&& Objects.equals(patientId, other.patientId);
	}

	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", identityNo=" + identityNo + ", fullName=" + fullName
				+ ", birthYear=" + birthYear + ", gender=" + gender + "]";
	}

	public static class Builder {
		private PatientId patientId;
		private IdentityNo identityNo;
		private FullName fullName;
		private BirthYear birthYear;
		private Gender gender;

		public Builder patientId(int patientId) {
			this.patientId = PatientId.of(patientId);
			return this;
		}

		public Builder identityNo(int identityNo) {
			this.identityNo = IdentityNo.of(identityNo);
			return this;
		}

		public Builder fullName(String firstName, String lastName) {
			this.fullName = FullName.of(firstName, lastName);
			return this;
		}

		public Builder birthYear(Date birthYear) {
			this.birthYear = BirthYear.of(birthYear);
			return this;
		}

		public Builder gender(Gender gender) {
			this.gender = gender;
			return this;
		}

		public Patient build() {
			// validation
			// business rule
			// constraint
			// invariance
			return new Patient(this);
		}
	}
}
