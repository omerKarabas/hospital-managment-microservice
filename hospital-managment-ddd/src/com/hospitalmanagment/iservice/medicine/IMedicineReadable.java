package com.hospitalmanagment.iservice.medicine;

import java.util.List;
import java.util.Optional;

import com.hospitalmanagment.aggreagate.Medicine;
import com.hospitalmanagment.valueobject.medicine.DateOfValidty;
import com.hospitalmanagment.valueobject.medicine.MedicineCompany;
import com.hospitalmanagment.valueobject.medicine.MedicineId;
import com.hospitalmanagment.valueobject.medicine.MedicineName;
import com.hospitalmanagment.valueobject.medicine.usage.Usage;

public interface IMedicineReadable {

	List<Medicine> findAllMedicine();
	Optional<Medicine> findMedicineByMedicineId(MedicineId MedicineId);
	Optional<Medicine> findMedicineByName(MedicineName medicineName);
	Optional<Medicine> findMedicineByCompany(MedicineCompany medicineCompany);
	Optional<Medicine> findMedicineByDateOfValidty(DateOfValidty dateOfValidty);
	List<Medicine> findMedicineByCompanyAndDateOfValidty(MedicineCompany medicineCompany,DateOfValidty dateOfValidty);
	List<Medicine> findMedicineByUsage(Usage usage);
	
}
