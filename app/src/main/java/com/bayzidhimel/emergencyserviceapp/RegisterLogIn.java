package com.bayzidhimel.emergencyserviceapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.bayzidhimel.emergencyserviceapp.databinding.ActivityRegisterLogInBinding;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class RegisterLogIn extends AppCompatActivity {

    ActivityRegisterLogInBinding binding;
    FirebaseAuth fauth;
    FirebaseFirestore fstore;
    String userID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityRegisterLogInBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        fauth=FirebaseAuth.getInstance();
        fstore=FirebaseFirestore.getInstance();

        binding.idsignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = binding.idemail.getText().toString().trim();
                String password=binding.password.getText().toString().trim();
                String fullname=binding.idname.getText().toString();
                String Phone=binding.idphone.getText().toString();

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
                fauth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful())
                        {
                            Toast.makeText(RegisterLogIn.this, "User Create", Toast.LENGTH_SHORT).show();
                            userID=fauth.getCurrentUser().getUid();
                            DocumentReference documentReference =fstore.collection("users").document(userID);
                            Map<String,Object> user =new HashMap<>();
                            user.put("fname",fullname);
                            user.put("email",email);
                            user.put("number",Phone);
                            documentReference.set(user).addOnSuccessListener(new OnSuccessListener<Void>() {
                                @Override
                                public void onSuccess(Void unused) {
                                    Log.d("TAG","onSucess: user profile created"+userID);
                                }
                            });
                            startActivity(new Intent(getApplicationContext(),login.class));
                        }
                        else{
                            Toast.makeText(RegisterLogIn.this, "Error"+task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                            binding.progressbar.setVisibility(View.GONE);
                        }

                    }
                });

            }
        });
        binding.idslogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),login.class));
            }
        });
    }
}