package com.bayzidhimel.emergencyserviceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.bayzidhimel.emergencyserviceapp.databinding.ActivityRootBloodBankBinding;

public class root_blood_bank extends AppCompatActivity {

    ActivityRootBloodBankBinding binding;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRootBloodBankBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.numbermamun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = (String) binding.numbermamun.getText();
                String s="tel:"+number;
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse(s));
                startActivity(intent);
            }
        });
        binding.number1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = (String) binding.number1.getText();
                String s="tel:"+number;
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse(s));
                startActivity(intent);
            }
        });
        binding.numberAkash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = (String) binding.numberAkash.getText();
                String s="tel:"+number;
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse(s));
                startActivity(intent);
            }
        });
        binding.numbernaeem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = (String) binding.numbernaeem.getText();
                String s="tel:"+number;
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse(s));
                startActivity(intent);
            }
        });


    }
}