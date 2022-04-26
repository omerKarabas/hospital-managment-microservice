package com.hospitalmanagment.aggreagate;

import java.util.List;
import java.util.Objects;

import com.hospitalmanagment.annotaions.Aggreagate;
import com.hospitalmanagment.valueobject.doctor.DoctorId;
import com.hospitalmanagment.valueobject.medicine.MedicineId;
import com.hospitalmanagment.valueobject.patient.PatientId;
import com.hospitalmanagment.valueobject.prescription.PrescriptionId;

@Aggreagate
public class Prescription {

	private PrescriptionId prescriptionId;
	private DoctorId doctorId;
	private PatientId patientId;
	private List<MedicineId> medicineId;

	public Prescription(Builder builder) {
		this.prescriptionId = builder.prescriptionId;
		this.doctorId = builder.doctorId;
		this.patientId = builder.patientId;
		this.medicineId = builder.medicineId;
	}

	public PrescriptionId getPrescriptionId() {
		return prescriptionId;
	}

	public void setPrescriptionId(PrescriptionId prescriptionId) {
		this.prescriptionId = prescriptionId;
	}

	public DoctorId getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(DoctorId doctorId) {
		this.doctorId = doctorId;
	}

	public PatientId getPatientId() {
		return patientId;
	}

	public void setPatientId(PatientId patientId) {
		this.patientId = patientId;
	}

	public List<MedicineId> getMedicineId() {
		return medicineId;
	}

	public void setMedicineId(List<MedicineId> medicineId) {
		this.medicineId = medicineId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(doctorId, medicineId, patientId, prescriptionId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Prescription other = (Prescription) obj;
		return Objects.equals(doctorId, other.doctorId) && Objects.equals(medicineId, other.medicineId)
				&& Objects.equals(patientId, other.patientId) && Objects.equals(prescriptionId, other.prescriptionId);
	}

	@Override
	public String toString() {
		return "Prescription [prescriptionId=" + prescriptionId + ", doctorId=" + doctorId + ", patientId=" + patientId
				+ ", medicineId=" + medicineId + "]";
	}

	public static class Builder {

		private PrescriptionId prescriptionId;
		private DoctorId doctorId;
		private PatientId patientId;
		private List<MedicineId> medicineId;

		public Builder prescriptionId(int prescriptionId) {
			this.prescriptionId = PrescriptionId.of(prescriptionId);
			return (this);
		}

		public Builder doctorId(int doctorId) {
			this.doctorId = DoctorId.of(doctorId);
			return (this);
		}

		public Builder patientId(int patientId) {
			this.patientId = PatientId.of(patientId);
			return (this);
		}

		public Builder medicineId(List<MedicineId> medicineId) {
			this.medicineId = medicineId;
			return (this);
		}

		public Prescription build() {
			// validation
			// business rule
			// constraint
			// invariance
			return new Prescription(this);
		}
	}
}
