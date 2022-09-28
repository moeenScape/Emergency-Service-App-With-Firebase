package com.bayzidhimel.emergencyserviceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.bayzidhimel.emergencyserviceapp.databinding.ActivityNarayanjongHospitalBinding;

public class narayanjong_Hospital extends AppCompatActivity {

    ActivityNarayanjongHospitalBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityNarayanjongHospitalBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.idhospitalcll2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = (String) binding.idhospitalcll2.getText();
                String s="tel:"+number;
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse(s));
                startActivity(intent);
            }
        });
        binding.callhospital1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = (String) binding.callhospital1.getText();
                String s="tel:"+number;
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse(s));
                startActivity(intent);
            }
        });
        binding.callhospital3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = (String) binding.callhospital3.getText();
                String s="tel:"+number;
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse(s));
                startActivity(intent);
            }
        });


    }
}