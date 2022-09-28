package com.bayzidhimel.emergencyserviceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.bayzidhimel.emergencyserviceapp.databinding.ActivityFireStaionInfoBinding;

public class FireStaionInfo extends AppCompatActivity {

    ActivityFireStaionInfoBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityFireStaionInfoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.idcmmon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String number = (String) binding.idcmmon.getText();
                String s="tel:"+number;
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse(s));
                startActivity(intent);
            }
        });
        binding.mirpur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String number = (String) binding.mirpur.getText();
                String s="tel:"+number;
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse(s));
                startActivity(intent);
            }
        });
    }
}