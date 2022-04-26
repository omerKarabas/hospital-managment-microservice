package com.hospitalmanagment.service.medicine;

import java.util.Optional;

import com.hospitalmanagment.aggreagate.Medicine;
import com.hospitalmanagment.iservice.medicine.IMedicineWritedable;
import com.hospitalmanagment.repository.medicine.MedicineWritedableRepository;
import com.hospitalmanagment.valueobject.medicine.DateOfValidty;
import com.hospitalmanagment.valueobject.medicine.MedicineCompany;
import com.hospitalmanagment.valueobject.medicine.MedicineId;
import com.hospitalmanagment.valueobject.medicine.MedicineName;
import com.hospitalmanagment.valueobject.medicine.usage.Usage;

public class MedicineWritedable implements IMedicineWritedable {

	private MedicineWritedableRepository medicineWritedableRepository;

	public MedicineWritedable(MedicineWritedableRepository medicineWritedableRepository) {
		super();
		this.medicineWritedableRepository = medicineWritedableRepository;
	}

	@Override
	public Optional<Medicine> addMedicine(Medicine medicine) {
		var addedMedicine = medicineWritedableRepository.addMedicine(medicine);
		return addedMedicine;
	}

	@Override
	public Optional<Medicine> removeMedicineById(MedicineId medicineId) {
		var removeMedicine = medicineWritedableRepository.removeMedicineById(medicineId);
		return removeMedicine;
	}

	@Override
	public Optional<Medicine> removeMedicineByDateOfValid() {
		var removeMedicine = medicineWritedableRepository.removeMedicineByDateOfValid();
		return removeMedicine;
	}

	@Override
	public Optional<Medicine> removeMedicineByCompany(MedicineCompany medicineCompany) {
		var removeMedicine = medicineWritedableRepository.removeMedicineByCompany(medicineCompany);
		return removeMedicine;
	}

	@Override
	public Optional<Medicine> removeMedicineByName(MedicineName medicineName) {
		var removeMedicine = medicineWritedableRepository.removeMedicineByName(medicineName);
		return removeMedicine;
	}

	@Override
	public Optional<Medicine> updatedMedicineByName(MedicineId medicineId, MedicineName medicineName) {
		var updatedMedicine = medicineWritedableRepository.updatedMedicineByName(medicineId, medicineName);
		return updatedMedicine;
	}

	@Override
	public Optional<Medicine> updatedMedicineByCompany(MedicineId medicineId, MedicineName medicineName) {
		var updatedMedicine = medicineWritedableRepository.updatedMedicineByCompany(medicineId, medicineName);
		return updatedMedicine;
	}

	@Override
	public Optional<Medicine> updatedMedicineByDate(MedicineId medicineId, DateOfValidty dateOfValidty) {
		var updatedMedicine = medicineWritedableRepository.updatedMedicineByDate(medicineId, dateOfValidty);
		return updatedMedicine;
	}

	@Override
	public Optional<Medicine> updatedMedicineByUsage(MedicineId medicineId, Usage usage) {
		var updatedMedicine = medicineWritedableRepository.updatedMedicineByUsage(medicineId, usage);
		return updatedMedicine;
	}

}
