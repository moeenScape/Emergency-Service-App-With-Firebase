package com.bayzidhimel.emergencyserviceapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;

import com.bayzidhimel.emergencyserviceapp.databinding.ActivityLoginBinding;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class login extends AppCompatActivity {

    ActivityLoginBinding binding;
    FirebaseAuth fauth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        fauth=FirebaseAuth.getInstance();
        binding.idlogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = binding.idemail.getText().toString().trim();
                String password=binding.password.getText().toString().trim();

                if(TextUtils.isEmpty(email)){
                    binding.idemail.setError("Enter Password");
                    return;
                }
                if(TextUtils.isEmpty(password)){
                    binding.password.setError("Enter Password");
                    return;
                }
                if(password.length()<6){
                    binding.password.setError("Enter 6 number");
                    return;
                }
                binding.progressbar.setVisibility(View.VISIBLE);
                fauth.signInWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful())
                        {
                            Toast.makeText(login.this, "Log in successful", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(getApplicationContext(),homepage.class));
                        }
                        else{
                            Toast.makeText(login.this, "Error"+task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                            binding.progressbar.setVisibility(View.GONE);
                        }

                    }
                });

            }
        });
        binding.signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),RegisterLogIn.class));
            }
        });
    }
}