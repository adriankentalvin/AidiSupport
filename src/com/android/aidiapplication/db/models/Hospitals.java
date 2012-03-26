package com.android.aidiapplication.db.models;

import java.util.ArrayList;
import java.util.List;

import com.j256.ormlite.table.DatabaseTable;


@DatabaseTable(tableName = "hospitals")

public class Hospitals {

	private int hospitalId;
	private String hospitalName;
	private String hospitalAddress;
	private List<Doctors> doctorList = new ArrayList<Doctors>();

	public Hospitals(int hospitalId, String hospitalName,
			String hospitalAddress, List<Doctors> doctorList) {
		super();
		this.hospitalId = hospitalId;
		this.hospitalName = hospitalName;
		this.hospitalAddress = hospitalAddress;
		this.doctorList = doctorList;
	}

	public int getHospitalId() {
		return hospitalId;
	}

	public void setHospitalId(int hospitalId) {
		this.hospitalId = hospitalId;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getHospitalAddress() {
		return hospitalAddress;
	}

	public void setHospitalAddress(String hospitalAddress) {
		this.hospitalAddress = hospitalAddress;
	}

	public List<Doctors> getDoctorList() {
		return doctorList;
	}

	public void setDoctorList(List<Doctors> doctorList) {
		this.doctorList = doctorList;
	}

}
