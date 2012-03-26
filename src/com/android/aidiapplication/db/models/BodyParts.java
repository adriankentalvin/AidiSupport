package com.android.aidiapplication.db.models;

import java.util.ArrayList;
import java.util.List;

import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "bodyParts")
public class BodyParts {

	private int bodyPartsId;
	private String bodyPartsName;
	private List<Diseases> diseaseList = new ArrayList<Diseases>();

	public BodyParts(int bodyPartsId, String bodyPartsName,
			List<Diseases> diseaseList) {
		super();
		this.bodyPartsId = bodyPartsId;
		this.bodyPartsName = bodyPartsName;
		this.diseaseList = diseaseList;
	}

	public int getBodyPartsId() {
		return bodyPartsId;
	}

	public void setBodyPartsId(int bodyPartsId) {
		this.bodyPartsId = bodyPartsId;
	}

	public String getBodyPartsName() {
		return bodyPartsName;
	}

	public void setBodyPartsName(String bodyPartsName) {
		this.bodyPartsName = bodyPartsName;
	}

	public List<Diseases> getDiseaseList() {
		return diseaseList;
	}

	public void setDiseaseList(List<Diseases> diseaseList) {
		this.diseaseList = diseaseList;
	}

}
