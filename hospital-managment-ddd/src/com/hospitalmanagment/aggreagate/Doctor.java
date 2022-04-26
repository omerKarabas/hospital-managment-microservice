package com.hospitalmanagment.aggreagate;

import java.util.Date;
import java.util.Objects;

import com.hospitalmanagment.annotaions.Aggreagate;
import com.hospitalmanagment.valueobject.BirthYear;
import com.hospitalmanagment.valueobject.FullName;
import com.hospitalmanagment.valueobject.Gender;
import com.hospitalmanagment.valueobject.IdentityNo;
import com.hospitalmanagment.valueobject.Specialty;
import com.hospitalmanagment.valueobject.doctor.DoctorId;
import com.hospitalmanagment.valueobject.doctor.Status;

@Aggreagate
public class Doctor {

	private DoctorId doctorId;
	private IdentityNo identityNo;
	private FullName fullName;
	private BirthYear birthYear;
	private Gender gender;
	private Status statu;
	private Specialty specialty;

	public Doctor(Builder builder) {
		this.doctorId = builder.doctorId;
		this.identityNo = builder.identityNo;
		this.fullName = builder.fullName;
		this.birthYear = builder.birthYear;
		this.gender = builder.gender;
		this.statu = builder.statu;
		this.specialty = builder.specialty;
	}

	public DoctorId getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(DoctorId doctorId) {
		this.doctorId = doctorId;
	}

	public IdentityNo getIdentityNo() {
		return identityNo;
	}

	public void setIdentityNo(IdentityNo identityNo) {
		this.identityNo = identityNo;
	}

	public FullName getFullName() {
		return fullName;
	}

	public void setFullName(FullName fullName) {
		this.fullName = fullName;
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

	public Status getStatu() {
		return statu;
	}

	public void setStatu(Status statu) {
		this.statu = statu;
	}

	public Specialty getSpecialty() {
		return specialty;
	}

	public void setSpecialty(Specialty specialty) {
		this.specialty = specialty;
	}

	@Override
	public int hashCode() {
		return Objects.hash(birthYear, doctorId, fullName, gender, identityNo, specialty, statu);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Doctor other = (Doctor) obj;
		return Objects.equals(birthYear, other.birthYear) && Objects.equals(doctorId, other.doctorId)
				&& Objects.equals(fullName, other.fullName) && gender == other.gender
				&& Objects.equals(identityNo, other.identityNo) && specialty == other.specialty && statu == other.statu;
	}

	@Override
	public String toString() {
		return "Doctor [doctorId=" + doctorId + ", identityNo=" + identityNo + ", fullName=" + fullName + ", birthYear="
				+ birthYear + ", gender=" + gender + ", statu=" + statu + ", specialty=" + specialty + "]";
	}

	public static class Builder {

		private DoctorId doctorId;
		private FullName fullName;
		private IdentityNo identityNo;
		private BirthYear birthYear;
		private Gender gender;
		private Status statu;
		private Specialty specialty;

		public Builder doctorId(int doctorId) {
			this.doctorId = DoctorId.of(doctorId);
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

		public Builder statu(Status statu) {
			this.statu = statu;
			return this;
		}

		public Builder specialty(Specialty specialty) {
			this.specialty = specialty;
			return this;
		}

		public Doctor build() {
			// validation
			// business rule
			// constraint
			// invariance
			return new Doctor(this);
		}
	}

}
