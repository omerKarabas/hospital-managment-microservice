package com.hospitalmanagment.aggreagate;

import java.util.Date;
import java.util.List;

import com.hospitalmanagment.annotaions.Aggreagate;
import com.hospitalmanagment.valueobject.Complaint;
import com.hospitalmanagment.valueobject.IdentityNo;
import com.hospitalmanagment.valueobject.appointment.ApointmentDate;
import com.hospitalmanagment.valueobject.appointment.ApointmentId;
import com.hospitalmanagment.valueobject.hospital.HospitalName;

@Aggreagate
public class Apointment {

	private ApointmentId apointmentId;
	private IdentityNo identityNo;
	private HospitalName hospitalName;
	private ApointmentDate apointmentDate;
	private List<Complaint> complaints;

	public Apointment(Builder builder) {
		this.apointmentId = builder.apointmentId;
		this.identityNo=builder.identityNo;
		this.hospitalName=builder.hospitalName;
	
		this.complaints=builder.complaints;

	}

	public ApointmentId getApointmentId() {
		return apointmentId;
	}

	public void setApointmentId(ApointmentId apointmentId) {
		this.apointmentId = apointmentId;
	}

	public IdentityNo getIdentityNo() {
		return identityNo;
	}

	public void setIdentityNo(IdentityNo identityNo) {
		this.identityNo = identityNo;
	}

	public HospitalName getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(HospitalName hospitalName) {
		this.hospitalName = hospitalName;
	}



	public ApointmentDate getApointmentDate() {
		return apointmentDate;
	}

	public void setApointmentDate(ApointmentDate apointmentDate) {
		this.apointmentDate = apointmentDate;
	}

	public List<Complaint> getComplaints() {
		return complaints;
	}

	public void setComplaints(List<Complaint> complaints) {
		this.complaints = complaints;
	}

	public static class Builder {
		private ApointmentId apointmentId;
		private IdentityNo identityNo;
		private HospitalName hospitalName;
		private ApointmentDate apointmentDate;
		private List<Complaint> complaints;
		
		public Builder apointmentId(int apointmentId) {
			this.apointmentId = ApointmentId.of(apointmentId);
			return this;
		}

		public Builder identityNo(int identityNo) {
			this.identityNo=IdentityNo.of(identityNo);
			return this;
		}
	
		public Builder hospitalName(String hospitalName) {
			this.hospitalName = HospitalName.of(hospitalName);
			return this;
		}

		public Builder apointmentDate(Date apointmentDate) {
			this.apointmentDate=ApointmentDate.of(apointmentDate);
			return this;
		}

		public Builder complaints(List<Complaint> complaints) {
			this.complaints= complaints;
			return this;
		}
		public Apointment build() {

			// validation
			// business rule
			// constraint
			// invariance
			return new Apointment(this);
		}
	}
}
