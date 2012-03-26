package com.android.aidiapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class DoctorsCrud extends Activity implements OnClickListener {

	Button btnAddDoctors;
	 @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.doctors_crud);
	        
	        btnAddDoctors = (Button)findViewById(R.id.btnAddDoctors);
	        
	        btnAddDoctors.setOnClickListener(this);
	 }

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()){
		case R.id.btnAddDoctors:
			startActivity(new Intent(this, DoctorsCrud.class));
			break;
		}
		
	}

}
