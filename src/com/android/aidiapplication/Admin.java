package com.android.aidiapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Admin extends Activity implements OnClickListener {

	Button btnAdminDoctors;
	Button btnAdminDiseases;
	Button btnAdminSymptoms;
	Button btnAdminHospitals;
	Button btnAdminSpecialtyDoctors;
	Button btnAdminMedicines;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.admin);

		btnAdminDoctors = (Button) findViewById(R.id.btnAdminDoctors);
		btnAdminDiseases = (Button) findViewById(R.id.btnAdminDiseases);
		btnAdminSymptoms = (Button) findViewById(R.id.btnAdminSymptoms);
		btnAdminHospitals = (Button) findViewById(R.id.btnAdminHospitals);
		btnAdminSpecialtyDoctors = (Button) findViewById(R.id.btnAdminSpecialtyDoctors);
		btnAdminMedicines = (Button) findViewById(R.id.btnAdminMedicines);

		btnAdminMedicines.setOnClickListener(this);
		btnAdminHospitals.setOnClickListener(this);
		btnAdminDoctors.setOnClickListener(this);
		btnAdminSpecialtyDoctors.setOnClickListener(this);
		btnAdminDiseases.setOnClickListener(this);
		btnAdminSymptoms.setOnClickListener(this);

	}

	@Override
	public void onClick(View v) {

		switch (v.getId()) {

		case R.id.btnAdminHospitals:
			startActivity(new Intent(this, Hospitals.class));

			break;

		case R.id.btnAdminDoctors:
			startActivity(new Intent(this, DoctorsCreateProfile.class));

			break;

		case R.id.btnAdminSpecialtyDoctors:
			startActivity(new Intent(this, CreateDoctorsSpecialization.class));
			break;

		case R.id.btnAdminDiseases:
			startActivity(new Intent(this, AddDisease.class));
			break;

		case R.id.btnAdminMedicines:
			startActivity(new Intent(this, CreateMedicine.class));
			break;

		case R.id.btnAdminSymptoms:
			startActivity(new Intent(this, AddSymptoms.class));
			break;

		default:
			break;

		}

	}

}
