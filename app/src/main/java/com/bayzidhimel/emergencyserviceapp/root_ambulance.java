package com.bayzidhimel.emergencyserviceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.bayzidhimel.emergencyserviceapp.databinding.ActivityRootAmbulanceBinding;

public class root_ambulance extends AppCompatActivity {

    ActivityRootAmbulanceBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityRootAmbulanceBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.iddhaka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),dhaka_devision_ambulance.class));
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
                startActivity(new Intent(getApplicationContext(),barisahal_devision_ambulance.class));
            }
        });
        binding.idrajshai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),rajsahi_devesion_ambulance.class));
            }
        });
        binding.idshylet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),shylet_devision_ambulance.class));
            }
        });
        binding.idmoymonshing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),moymonshing_devesion_ambulance.class));
            }
        });
        binding.idkhulna.setOnClickListener(new View.OnClickListener() {
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

    }
}