package com.bayzidhimel.emergencyserviceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Toast;

import com.bayzidhimel.emergencyserviceapp.databinding.ActivityAmbulaceInfoBinding;

public class ambulace_info extends AppCompatActivity {
    ActivityAmbulaceInfoBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityAmbulaceInfoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.idamdhaka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                    String number = (String) binding.idamdhaka.getText();
                    String s="tel:"+number;
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse(s));
                    startActivity(intent);
            }
        });
        binding.ambari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String number = (String) binding.ambari.getText();
                String s="tel:"+number;
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse(s));
                startActivity(intent);
            }
        });
        binding.amchi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String number = (String) binding.amchi.getText();
                String s="tel:"+number;
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse(s));
                startActivity(intent);
            }
        });
        binding.amkul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String number = (String) binding.amkul.getText();
                String s="tel:"+number;
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse(s));
                startActivity(intent);
            }
        });
        binding.amraj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String number = (String) binding.amraj.getText();
                String s="tel:"+number;
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse(s));
                startActivity(intent);
            }
        });
        binding.amshy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String number = (String) binding.amshy.getText();
                String s="tel:"+number;
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse(s));
                startActivity(intent);
            }
        });
    }
}