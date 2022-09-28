package com.bayzidhimel.emergencyserviceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.bayzidhimel.emergencyserviceapp.databinding.ActivityPoliceStaioninfoBinding;

public class policeStaioninfo extends AppCompatActivity {
    ActivityPoliceStaioninfoBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding =ActivityPoliceStaioninfoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.polDan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String number = (String) binding.polDan.getText();
                String s="tel:"+number;
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse(s));
                startActivity(intent);
            }
        });
        binding.polpolton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String number = (String) binding.polpolton.getText();
                String s="tel:"+number;
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse(s));
                startActivity(intent);
            }
        });
        binding.warithana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = (String) binding.warithana.getText();
                String s="tel:"+number;
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse(s));
                startActivity(intent);
            }
        });
    }
}