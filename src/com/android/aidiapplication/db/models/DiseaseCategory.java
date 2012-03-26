package com.android.aidiapplication.db.models;

import java.util.ArrayList;
import java.util.List;

import com.j256.ormlite.table.DatabaseTable;


@DatabaseTable (tableName = "diseaseCategory")
public class DiseaseCategory {

	private int diseaseCategoryId;
	private String diseaseCategoryName;
	private List<Diseases> diseaseList = new ArrayList<Diseases>();

	public DiseaseCategory(int diseaseCategoryId, String diseaseCategoryName) {
		super();
		this.diseaseCategoryId = diseaseCategoryId;
		this.diseaseCategoryName = diseaseCategoryName;
	}

	public int getDiseaseCategoryId() {
		return diseaseCategoryId;
	}

	public void setDiseaseCategoryId(int diseaseCategoryId) {
		this.diseaseCategoryId = diseaseCategoryId;
	}

	public String getDiseaseCategoryName() {
		return diseaseCategoryName;
	}

	public void setDiseaseCategoryName(String diseaseCategoryName) {
		this.diseaseCategoryName = diseaseCategoryName;
	}

}
