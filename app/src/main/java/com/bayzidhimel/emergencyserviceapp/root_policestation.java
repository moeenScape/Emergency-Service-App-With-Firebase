package com.bayzidhimel.emergencyserviceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.bayzidhimel.emergencyserviceapp.databinding.ActivityRootPolicestationBinding;

public class root_policestation extends AppCompatActivity {
    ActivityRootPolicestationBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityRootPolicestationBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.iddhaka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),policeStaioninfo.class));
            }
        });
        binding.idchottogram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),dhaka_police.class));
            }
        });
        binding.idrajshai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),dhaka_police.class));
            }
        });
        binding.idbarisahal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),dhaka_police.class));
            }
        });
        binding.idkhulna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),dhaka_police.class));
            }
        });
        binding.idshylet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),dhaka_police.class));
            }
        });
        binding.idrongpur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),dhaka_police.class));
            }
        });
        binding.idmoymonshing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),dhaka_police.class));
            }
        });
    }
}