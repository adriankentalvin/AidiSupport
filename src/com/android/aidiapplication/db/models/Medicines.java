package com.android.aidiapplication.db.models;

import java.util.ArrayList;
import java.util.List;

import com.j256.ormlite.table.DatabaseTable;


@DatabaseTable(tableName="medicines")
public class Medicines {

	private int medicineId;
	private String medicineName;
	private int medicineDozage;
	private String medicineDescription;
	private List<Diseases> diseaseList = new ArrayList<Diseases>();

	public Medicines(int medicineId, String medicineName, int medicineDozage,
			String medicineDescription, List<Diseases> diseaseList) {
		super();
		this.medicineId = medicineId;
		this.medicineName = medicineName;
		this.medicineDozage = medicineDozage;
		this.medicineDescription = medicineDescription;
		this.diseaseList = diseaseList;
	}

	public int getMedicineId() {
		return medicineId;
	}

	public void setMedicineId(int medicineId) {
		this.medicineId = medicineId;
	}

	public String getMedicineName() {
		return medicineName;
	}

	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}

	public int getMedicineDozage() {
		return medicineDozage;
	}

	public void setMedicineDozage(int medicineDozage) {
		this.medicineDozage = medicineDozage;
	}

	public String getMedicineDescription() {
		return medicineDescription;
	}

	public void setMedicineDescription(String medicineDescription) {
		this.medicineDescription = medicineDescription;
	}

	public List<Diseases> getDiseaseList() {
		return diseaseList;
	}

	public void setDiseaseList(List<Diseases> diseaseList) {
		this.diseaseList = diseaseList;
	}

}
