 	 package com.android.aidiapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class AidisupportActivity extends Activity implements OnClickListener{
	
	Button doctors;
	Button diseases;
	Button medicines;
	Button admin;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        doctors = (Button)findViewById(R.id.btnMainDoctors);
        medicines = (Button)findViewById(R.id.btnMainMedicines);
        diseases = (Button)findViewById(R.id.btnMainDiseases);
        admin = (Button)findViewById(R.id.btnAdmin);
        
        doctors.setOnClickListener(this);
        diseases.setOnClickListener(this);
        medicines.setOnClickListener(this);
        admin.setOnClickListener(this);
        
        
    }

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()){
		case R.id.btnMainDoctors:
			startActivity(new Intent(this,Doctors.class));
			break;
		case R.id.btnMainDiseases:
			startActivity(new Intent(this,Disease.class));
			break;
		case R.id.btnMainMedicines:
			startActivity(new Intent(this,Medicines.class));
			break;
		case R.id.btnAdmin:
			startActivity(new Intent(this,Admin.class));
			
			default:
			break;
			
		}
		
	}
}