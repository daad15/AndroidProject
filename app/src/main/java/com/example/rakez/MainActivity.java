package com.example.rakez;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Initialize Firebase Auth
        mAuth = FirebaseAuth.getInstance();
    }
    // register & sign user by ID
    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
        updateUI(currentUser);
    }
    private void updateUI(FirebaseUser user){
        if(user==null){
            mAuth.signInAnonymously().addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if(task.isSuccessful()){
                        FirebaseUser user = mAuth.getCurrentUser();
                        updateUI(user);
                    } else{
                        updateUI(null);
                    }
                }
            });
        }
    }

    public void go_mySize(View V){
        Intent i = new Intent(this,mySize.class);
        startActivity(i);
        finish();
    }

    public void go_men(View V){
        Intent i = new Intent(this,men.class);
        startActivity(i);
        finish();
    }

    public void go_women(View V){
        Intent i = new Intent(this,Women.class);
        startActivity(i);
        finish();
    }

    public void go_kids(View V){
        Intent i = new Intent(this,Kids.class);
        startActivity(i);
        finish();
    }

    public void go_menu(View V){
        Intent i = new Intent(this,Menu.class);
        startActivity(i);
        finish();
    }
}