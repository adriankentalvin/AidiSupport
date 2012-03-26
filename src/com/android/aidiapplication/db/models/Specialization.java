package com.android.aidiapplication.db.models;

import java.util.ArrayList;
import java.util.List;

import com.j256.ormlite.table.DatabaseTable;


@DatabaseTable(tableName = "specialization" )
public class Specialization {

	private int specializationId;
	private String specializationName;
	private List<Doctors> doctorList = new ArrayList<Doctors>();

	public Specialization(int specializationId, String specializationName,
			List<Doctors> doctorList) {
		super();
		this.specializationId = specializationId;
		this.specializationName = specializationName;
		this.doctorList = doctorList;
	}

	public int getSpecializationId() {
		return specializationId;
	}

	public void setSpecializationId(int specializationId) {
		this.specializationId = specializationId;
	}

	public String getSpecializationName() {
		return specializationName;
	}

	public void setSpecializationName(String specializationName) {
		this.specializationName = specializationName;
	}

	public List<Doctors> getDoctorList() {
		return doctorList;
	}

	public void setDoctorList(List<Doctors> doctorList) {
		this.doctorList = doctorList;
	}

}
