package com.bayzidhimel.emergencyserviceapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.bayzidhimel.emergencyserviceapp.databinding.ActivityHomepageBinding;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;

import java.util.HashMap;
import java.util.Map;

public class homepage extends AppCompatActivity {
    ActivityHomepageBinding binding;
    FirebaseFirestore fstore;
    FirebaseAuth fauth;
    String userID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityHomepageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        fstore=FirebaseFirestore.getInstance();
        fauth=FirebaseAuth.getInstance();

        userID=fauth.getCurrentUser().getUid();
        DocumentReference documentReference = fstore.collection("enumbers").document(userID);
        documentReference.addSnapshotListener(this, new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot value, @Nullable FirebaseFirestoreException error) {
                binding.idnumbershow.setText(value.getString("number"));
            }
        });

        binding.idaddnumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.layout1.setVisibility(View.VISIBLE);

            }
        });
        binding.idfirstnumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number=binding.identernumber.getText().toString().trim();
                userID=fauth.getCurrentUser().getUid();
                DocumentReference documentReference =fstore.collection("enumbers").document(userID);
                Map<String,Object> user =new HashMap<>();
                user.put("number",number);
                documentReference.set(user).addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void unused) {
                        Log.d("TAG","onSucess: user profile created"+userID);
                    }
                });
                documentReference.set(user).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Log.d("TAG","onSucess: fail"+userID);

                    }
                });
            }
        });
        binding.iddelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Number Delete From Database",Toast.LENGTH_LONG).show();
            }
        });
        binding.idnumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                binding.idnumbershow.setVisibility(View.VISIBLE);
            }
        });
        binding.newspaper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),newnews.class));
            }
        });


        binding.idlastNumber.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Number Added",Toast.LENGTH_LONG).show();
            }
        });
        binding.number3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Number Added",Toast.LENGTH_LONG).show();
            }
        });
        binding.home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
            }
        });
    }
}