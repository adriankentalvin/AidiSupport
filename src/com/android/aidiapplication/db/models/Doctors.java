package com.android.aidiapplication.db.models;

import java.util.ArrayList;
import java.util.List;

public class Doctors {

	private int doctorsId;
	private String doctorsFname;
	private String doctorsMname;
	private String doctorsLname;
	private List<Hospitals> hospitalList = new ArrayList<Hospitals>();

	public Doctors(int doctorsId, String doctorsFname, String doctorsMname,
			String doctorsLname, List<Hospitals> hospitalList) {
		super();
		this.doctorsId = doctorsId;
		this.doctorsFname = doctorsFname;
		this.doctorsMname = doctorsMname;
		this.doctorsLname = doctorsLname;
		this.hospitalList = hospitalList;
	}

	public int getDoctorsId() {
		return doctorsId;
	}

	public void setDoctorsId(int doctorsId) {
		this.doctorsId = doctorsId;
	}

	public String getDoctorsFname() {
		return doctorsFname;
	}

	public void setDoctorsFname(String doctorsFname) {
		this.doctorsFname = doctorsFname;
	}

	public String getDoctorsMname() {
		return doctorsMname;
	}

	public void setDoctorsMname(String doctorsMname) {
		this.doctorsMname = doctorsMname;
	}

	public String getDoctorsLname() {
		return doctorsLname;
	}

	public void setDoctorsLname(String doctorsLname) {
		this.doctorsLname = doctorsLname;
	}

	public List<Hospitals> getHospitalList() {
		return hospitalList;
	}

	public void setHospitalList(List<Hospitals> hospitalList) {
		this.hospitalList = hospitalList;
	}

}
