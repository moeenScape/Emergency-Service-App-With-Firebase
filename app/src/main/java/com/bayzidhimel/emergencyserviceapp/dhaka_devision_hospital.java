package com.bayzidhimel.emergencyserviceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.bayzidhimel.emergencyserviceapp.databinding.ActivityDhakaDevisionHospitalBinding;

public class dhaka_devision_hospital extends AppCompatActivity {

    ActivityDhakaDevisionHospitalBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding =ActivityDhakaDevisionHospitalBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.iddhaka.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Hospitalinformation.class));
            }
        });
        binding.idnarayanganj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),narayanjong_Hospital.class));
            }
        });
        binding.idgazipur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),gazipur_hospital.class));
            }
        });
        binding.idkisorgonj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),kisorgonj_hospital.class));

            }
        });
        binding.idtangile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),tangile_foridpur_gopalgonz.class));
            }
        });
        binding.idgopalgonj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),tangile_foridpur_gopalgonz.class));
            }
        });
        binding.idforidpur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),tangile_foridpur_gopalgonz.class));
            }
        });
        binding.idmadaripur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),common_information.class));
            }
        });
        binding.idnorsindi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),common_information.class));
            }
        });
        binding.idsoriatpur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),common_information.class));
            }
        });
        binding.idmunsigonj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),common_information.class));
            }
        });
        binding.idrajbari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),common_information.class));
            }
        });
        binding.idmanikgong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),common_information.class));
            }
        });

    }
}