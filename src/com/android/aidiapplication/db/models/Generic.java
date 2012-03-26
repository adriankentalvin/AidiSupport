package com.android.aidiapplication.db.models;

import java.util.ArrayList;
import java.util.List;

import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "generic")
public class Generic {

	private int genericId;
	private String genericName;
	private String genericDescription;
	private List<Medicines> medicineList = new ArrayList<Medicines>();

	public Generic(int genericId, String genericName,
			String genericDescription, List<Medicines> medicineList) {
		super();
		this.genericId = genericId;
		this.genericName = genericName;
		this.genericDescription = genericDescription;
		this.medicineList = medicineList;
	}

	public int getGenericId() {
		return genericId;
	}

	public void setGenericId(int genericId) {
		this.genericId = genericId;
	}

	public String getGenericName() {
		return genericName;
	}

	public void setGenericName(String genericName) {
		this.genericName = genericName;
	}

	public String getGenericDescription() {
		return genericDescription;
	}

	public void setGenericDescription(String genericDescription) {
		this.genericDescription = genericDescription;
	}

	public List<Medicines> getMedicineList() {
		return medicineList;
	}

	public void setMedicineList(List<Medicines> medicineList) {
		this.medicineList = medicineList;
	}

}
