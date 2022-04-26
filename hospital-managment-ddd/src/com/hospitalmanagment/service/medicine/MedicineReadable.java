package com.hospitalmanagment.service.medicine;

import java.util.List;
import java.util.Optional;

import com.hospitalmanagment.aggreagate.Medicine;
import com.hospitalmanagment.iservice.medicine.IMedicineReadable;
import com.hospitalmanagment.repository.medicine.MedicineReadableRepository;
import com.hospitalmanagment.valueobject.medicine.DateOfValidty;
import com.hospitalmanagment.valueobject.medicine.MedicineCompany;
import com.hospitalmanagment.valueobject.medicine.MedicineId;
import com.hospitalmanagment.valueobject.medicine.MedicineName;
import com.hospitalmanagment.valueobject.medicine.usage.Usage;

public class MedicineReadable implements IMedicineReadable {

	private MedicineReadableRepository medicineReadableRepository;

	public MedicineReadable(MedicineReadableRepository medicineReadableRepository) {
		super();
		this.medicineReadableRepository = medicineReadableRepository;
	}

	@Override
	public List<Medicine> findAllMedicine() {
		var medicines = medicineReadableRepository.findAllMedicine();
		return medicines;
	}

	@Override
	public Optional<Medicine> findMedicineByMedicineId(MedicineId MedicineId) {
		var medicine = medicineReadableRepository.findMedicineByMedicineId(MedicineId);
		return medicine;
	}

	@Override
	public Optional<Medicine> findMedicineByName(MedicineName medicineName) {
		var medicine = medicineReadableRepository.findMedicineByName(medicineName);
		return medicine;
	}

	@Override
	public Optional<Medicine> findMedicineByCompany(MedicineCompany medicineCompany) {
		var medicine = medicineReadableRepository.findMedicineByCompany(medicineCompany);
		return medicine;
	}

	@Override
	public Optional<Medicine> findMedicineByDateOfValidty(DateOfValidty dateOfValidty) {
		var medicine = medicineReadableRepository.findMedicineByDateOfValidty(dateOfValidty);
		return medicine;
	}

	@Override
	public List<Medicine> findMedicineByCompanyAndDateOfValidty(MedicineCompany medicineCompany,
			DateOfValidty dateOfValidty) {
		var medicines = findMedicineByCompanyAndDateOfValidty(medicineCompany, dateOfValidty);
		return medicines;
	}

	@Override
	public List<Medicine> findMedicineByUsage(Usage usage) {
		var medicines = medicineReadableRepository.findMedicineByUsage(usage);
		return medicines;
	}

}
