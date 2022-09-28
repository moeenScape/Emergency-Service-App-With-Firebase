package com.bayzidhimel.emergencyserviceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.bayzidhimel.emergencyserviceapp.databinding.ActivityInformationmainBinding;

public class informationmain extends AppCompatActivity {

    ActivityInformationmainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityInformationmainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.idfirestation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),root_fireservice.class));

            }
        });
        binding.idbloodbank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),root_blood_bank.class));
            }
        });
        binding.idhospital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),root_hospital.class));
            }
        });
        binding.idAmbulamce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), root_ambulance.class));
            }
        });
        binding.idpoliceSation.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                startActivity(new Intent(getApplicationContext(),root_policestation.class));
            }
        });
    }
}