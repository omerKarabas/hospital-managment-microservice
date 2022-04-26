package com.hospitalmanagment.aggreagate;

import java.util.Objects;

import com.hospitalmanagment.annotaions.Aggreagate;
import com.hospitalmanagment.valueobject.medicine.DateOfValidty;
import com.hospitalmanagment.valueobject.medicine.MedicineCompany;
import com.hospitalmanagment.valueobject.medicine.MedicineId;
import com.hospitalmanagment.valueobject.medicine.MedicineName;
import com.hospitalmanagment.valueobject.medicine.usage.Usage;

@Aggreagate
public class Medicine {

	private MedicineId medicineId;
	private MedicineName medicineName;
	private MedicineCompany medicineCompany;
	private DateOfValidty dateOfValidty;
	private Usage usage;

	public Medicine(Builder builder) {
		this.medicineId=builder.medicineId;
		this.medicineName=builder.medicineName;
		this.medicineCompany=builder.medicineCompany;
		this.dateOfValidty=builder.dateOfValidty;
		this.usage=builder.usage;
	}

	public MedicineId getMedicineId() {
		return medicineId;
	}

	public void setMedicineId(MedicineId medicineId) {
		this.medicineId = medicineId;
	}

	public MedicineName getMedicineName() {
		return medicineName;
	}

	public void setMedicineName(MedicineName medicineName) {
		this.medicineName = medicineName;
	}

	public MedicineCompany getMedicineCompany() {
		return medicineCompany;
	}

	public void setMedicineCompany(MedicineCompany medicineCompany) {
		this.medicineCompany = medicineCompany;
	}

	public DateOfValidty getDateOfValidty() {
		return dateOfValidty;
	}

	public void setDateOfValidty(DateOfValidty dateOfValidty) {
		this.dateOfValidty = dateOfValidty;
	}

	public Usage getUsage() {
		return usage;
	}

	public void setUsage(Usage usage) {
		this.usage = usage;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dateOfValidty, medicineCompany, medicineId, medicineName, usage);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Medicine other = (Medicine) obj;
		return Objects.equals(dateOfValidty, other.dateOfValidty) && medicineCompany == other.medicineCompany
				&& Objects.equals(medicineId, other.medicineId) && Objects.equals(medicineName, other.medicineName)
				&& Objects.equals(usage, other.usage);
	}

	@Override
	public String toString() {
		return "Medicine [medicineId=" + medicineId + ", medicineName=" + medicineName + ", medicineCompany="
				+ medicineCompany + ", dateOfValidty=" + dateOfValidty + ", usage=" + usage + "]";
	}
	
	public static class Builder{
		private MedicineId medicineId;
		private MedicineName medicineName;
		private MedicineCompany medicineCompany;
		private DateOfValidty dateOfValidty;
		private Usage usage;
		
		public Builder medicineId(int medicineId) {
			this.medicineId=MedicineId.of(medicineId);
			return(this);
		}
		
		public Builder medicineName(String medicineName) {
			this.medicineName=MedicineName.of(medicineName);
			return(this);
		}
		
		public Builder medicineCompany(MedicineCompany medicineCompany) {
			this.medicineCompany=medicineCompany;
			return(this);
		}
		
		public Builder dateOfValidty(DateOfValidty dateOfValidty) {
			this.dateOfValidty=dateOfValidty;
			return(this);
		}
		
		public Builder usage(Usage usage) {
			this.usage=usage;
			return(this);
		}
		
		public Medicine build() {
			// validation
			// business rule
			// constraint
			// invariance
		return new Medicine(this);
		}
	}

}
