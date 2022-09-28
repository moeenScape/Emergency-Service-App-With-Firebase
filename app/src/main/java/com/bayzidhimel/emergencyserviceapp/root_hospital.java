package com.bayzidhimel.emergencyserviceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.bayzidhimel.emergencyserviceapp.databinding.ActivityRootHospitalBinding;

public class root_hospital extends AppCompatActivity {

    ActivityRootHospitalBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityRootHospitalBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.iddhaka.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),dhaka_devision_hospital.class));
            }
        });
        binding.idchottogram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),chotttogram_devision_ambulance.class));
            }
        });
        binding.idbarisahal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),common_information.class));
            }
        });
        binding.idshylet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),common_information.class));
            }
        });
        binding.idrongpur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),common_information.class));
            }
        });
        binding.idrajshai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),common_information.class));
            }
        });

        binding.idkhulna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),common_information.class));
            }
        });
        binding.idmoymonshing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),mymensingh_hospital.class));
            }
        });

    }
}