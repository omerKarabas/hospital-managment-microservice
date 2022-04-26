package com.hospitalmanagment.iservice.medicine;

import java.util.Optional;

import com.hospitalmanagment.aggreagate.Medicine;
import com.hospitalmanagment.valueobject.medicine.DateOfValidty;
import com.hospitalmanagment.valueobject.medicine.MedicineCompany;
import com.hospitalmanagment.valueobject.medicine.MedicineId;
import com.hospitalmanagment.valueobject.medicine.MedicineName;
import com.hospitalmanagment.valueobject.medicine.usage.Usage;

public interface IMedicineWritedable {

	Optional<Medicine> addMedicine(Medicine medicine);
	Optional<Medicine> removeMedicineById(MedicineId medicineId);
	Optional<Medicine> removeMedicineByDateOfValid();// süresi geçmiþler için
	Optional<Medicine> removeMedicineByCompany(MedicineCompany medicineCompany);
	Optional<Medicine> removeMedicineByName(MedicineName medicineName);
	Optional<Medicine> updatedMedicineByName(MedicineId medicineId, MedicineName medicineName);
	Optional<Medicine> updatedMedicineByCompany(MedicineId medicineId,MedicineName medicineName);
	Optional<Medicine> updatedMedicineByDate(MedicineId medicineId,DateOfValidty dateOfValidty );
	Optional<Medicine> updatedMedicineByUsage(MedicineId medicineId, Usage usage);
}
