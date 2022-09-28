package com.bayzidhimel.emergencyserviceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.bayzidhimel.emergencyserviceapp.databinding.ActivityDhakaDevisionAmbulanceBinding;

public class dhaka_devision_ambulance extends AppCompatActivity {
    ActivityDhakaDevisionAmbulanceBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityDhakaDevisionAmbulanceBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.idamdhaka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = (String) binding.idamdhaka.getText();
                String s="tel:"+number;
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse(s));
                startActivity(intent);
            }
        });
        binding.idcallambulance2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = (String) binding.idcallambulance2.getText();
                String s="tel:"+number;
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse(s));
                startActivity(intent);
            }
        });
        binding.idcallambulance3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = (String) binding.idcallambulance3.getText();
                String s="tel:"+number;
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse(s));
                startActivity(intent);
            }
        });
        binding.idcallambulance4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = (String) binding.idcallambulance4.getText();
                String s="tel:"+number;
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse(s));
                startActivity(intent);
            }
        });
        binding.idcallambulance5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = (String) binding.idcallambulance5.getText();
                String s="tel:"+number;
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse(s));
                startActivity(intent);
            }
        });
        binding.idcallambulance7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = (String) binding.idcallambulance7.getText();
                String s="tel:"+number;
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse(s));
                startActivity(intent);
            }
        });
        binding.idcallambulance8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = (String) binding.idcallambulance8.getText();
                String s="tel:"+number;
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse(s));
                startActivity(intent);
            }
        });
        binding.idcallambulance9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = (String) binding.idcallambulance9.getText();
                String s="tel:"+number;
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse(s));
                startActivity(intent);
            }
        });
        binding.idcallambulance10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = (String) binding.idcallambulance10.getText();
                String s="tel:"+number;
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse(s));
                startActivity(intent);
            }
        });
        binding.idcallambulance11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = (String) binding.idcallambulance11.getText();
                String s="tel:"+number;
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse(s));
                startActivity(intent);
            }
        });
        binding.idcallambulance12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = (String) binding.idcallambulance12.getText();
                String s="tel:"+number;
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse(s));
                startActivity(intent);
            }
        });
    }
}