package com.example.rakez;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.appcompat.widget.Toolbar;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class createSize extends AppCompatActivity {

    EditText mcreatetitleofnote, mcreatecontentofnote;
    FloatingActionButton msavenote;
    FirebaseAuth firebaseAuth;
    FirebaseUser firebaseUser;
    FirebaseFirestore firebaseFirestore;
    ProgressBar mprogressBarofcreatenote;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_size);

        msavenote=findViewById(R.id.savenote);
        mcreatecontentofnote=findViewById(R.id.createcontentofnote);
        mcreatetitleofnote=findViewById(R.id.createtitleofnote);
        mprogressBarofcreatenote=findViewById(R.id.progressbarofcreatenote);
        Toolbar toolbar= findViewById(R.id.toolbarofcreatenote);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        firebaseAuth=FirebaseAuth.getInstance();
        firebaseFirestore=FirebaseFirestore.getInstance();
        firebaseUser=FirebaseAuth.getInstance().getCurrentUser();

        msavenote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String title = mcreatetitleofnote.getText().toString();
                String content =mcreatecontentofnote.getText().toString();
                if(title.isEmpty()||content.isEmpty()){
                    Toast.makeText(getApplicationContext(),"يجب تعبئة الخانتين", Toast.LENGTH_SHORT).show();
                } else{
                    mprogressBarofcreatenote.setVisibility(View.VISIBLE);
                    DocumentReference documentReference=firebaseFirestore.collection("Sizes").document(firebaseUser.getUid()).collection("mySizes").document();
                    Map<String , Object> size=new HashMap<>();
                    size.put("title",title);
                    size.put("content",content);

                    documentReference.set(size).addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void unused) {
                            Toast.makeText(getApplicationContext(),"تم حفظ المقاس بنجاح", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(createSize.this,mySize.class));
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(getApplicationContext(),"حدثت مشكلة أثناء حفظ المقاس", Toast.LENGTH_SHORT).show();
                            mprogressBarofcreatenote.setVisibility(View.INVISIBLE);
                            //startActivity(new Intent(createSize.this,mySize.class));
                        }
                    });



                }

            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==android.R.id.home){
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
}