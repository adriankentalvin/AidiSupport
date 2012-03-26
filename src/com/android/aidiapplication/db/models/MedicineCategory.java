package com.android.aidiapplication.db.models;

import java.util.ArrayList;
import java.util.List;

import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "medicineCategory")
public class MedicineCategory {

	private int medicineCategoryId;
	private String medicineCategoryName;
	private List<Medicines> medicineList = new ArrayList<Medicines>();

	public MedicineCategory(int medicineCategoryId,
			String medicineCategoryName, List<Medicines> medicineList) {
		super();
		this.medicineCategoryId = medicineCategoryId;
		this.medicineCategoryName = medicineCategoryName;
		this.medicineList = medicineList;
	}

	public int getMedicineCategoryId() {
		return medicineCategoryId;
	}

	public void setMedicineCategoryId(int medicineCategoryId) {
		this.medicineCategoryId = medicineCategoryId;
	}

	public String getMedicineCategoryName() {
		return medicineCategoryName;
	}

	public void setMedicineCategoryName(String medicineCategoryName) {
		this.medicineCategoryName = medicineCategoryName;
	}

	public List<Medicines> getMedicineList() {
		return medicineList;
	}

	public void setMedicineList(List<Medicines> medicineList) {
		this.medicineList = medicineList;
	}

}
