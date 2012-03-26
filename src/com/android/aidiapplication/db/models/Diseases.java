package com.android.aidiapplication.db.models;

import java.util.ArrayList;
import java.util.List;

import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName= "disease")
public class Diseases {

	private int diseaseId;
	private String diseaseName;
	private String diseaseSymptoms;
	private String diseaseTreatment;
	private String diseaseDescription;
	private List<Generic> genericList = new ArrayList<Generic>();

	public Diseases(int diseaseId, String diseaseName, String diseaseSymptoms,
			String diseaseTreatment, String diseaseDescription,
			List<Generic> genericList) {
		super();
		this.diseaseId = diseaseId;
		this.diseaseName = diseaseName;
		this.diseaseSymptoms = diseaseSymptoms;
		this.diseaseTreatment = diseaseTreatment;
		this.diseaseDescription = diseaseDescription;
		this.genericList = genericList;
	}

	public int getDiseaseId() {
		return diseaseId;
	}

	public void setDiseaseId(int diseaseId) {
		this.diseaseId = diseaseId;
	}

	public String getDiseaseName() {
		return diseaseName;
	}

	public void setDiseaseName(String diseaseName) {
		this.diseaseName = diseaseName;
	}

	public String getDiseaseSymptoms() {
		return diseaseSymptoms;
	}

	public void setDiseaseSymptoms(String diseaseSymptoms) {
		this.diseaseSymptoms = diseaseSymptoms;
	}

	public String getDiseaseTreatment() {
		return diseaseTreatment;
	}

	public void setDiseaseTreatment(String diseaseTreatment) {
		this.diseaseTreatment = diseaseTreatment;
	}

	public String getDiseaseDescription() {
		return diseaseDescription;
	}

	public void setDiseaseDescription(String diseaseDescription) {
		this.diseaseDescription = diseaseDescription;
	}

	public List<Generic> getGenericList() {
		return genericList;
	}

	public void setGenericList(List<Generic> genericList) {
		this.genericList = genericList;
	}

}
