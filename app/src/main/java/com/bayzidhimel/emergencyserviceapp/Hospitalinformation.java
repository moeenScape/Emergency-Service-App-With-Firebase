package com.bayzidhimel.emergencyserviceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.bayzidhimel.emergencyserviceapp.databinding.ActivityHospitalinformationBinding;

public class Hospitalinformation extends AppCompatActivity {

    ActivityHospitalinformationBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHospitalinformationBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}