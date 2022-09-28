package com.bayzidhimel.emergencyserviceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.bayzidhimel.emergencyserviceapp.databinding.ActivityRootFireserviceBinding;

public class root_fireservice extends AppCompatActivity {

    ActivityRootFireserviceBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityRootFireserviceBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.iddhaka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),FireStaionInfo.class));
            }
        });
        binding.idchottogram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),chotto_raj_bari_firestation.class));
            }
        });

        binding.idbarisahal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),chotto_raj_bari_firestation.class));
            }
        });
        binding.idrajshai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),chotto_raj_bari_firestation.class));
            }
        });
        binding.idshylet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),chotto_raj_bari_firestation.class));
            }
        });
        binding.idmoymonshing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),chotto_raj_bari_firestation.class));
            }
        });
        binding.idkhulna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),chotto_raj_bari_firestation.class));
            }
        });
        binding.idrongpur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),chotto_raj_bari_firestation.class));
            }
        });

    }
}