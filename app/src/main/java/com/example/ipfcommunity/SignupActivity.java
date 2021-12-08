package com.example.ipfcommunity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class SignupActivity extends AppCompatActivity {
    private EditText username;
    private EditText password;
    private Button signup;
    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        username=(EditText) findViewById(R.id.editTextTextEmailAddress);
        password=(EditText) findViewById(R.id.editTextTextPassword);
        signup=(Button) findViewById(R.id.proceed_btn);
        auth= FirebaseAuth.getInstance();

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = username.getText().toString();
                String pass = password.getText().toString();
                if(user.isEmpty()||pass.isEmpty()){
                    Toast.makeText(SignupActivity.this, "please enter valid details", Toast.LENGTH_SHORT).show();
                }else if(pass.length()<6){
                    Toast.makeText(SignupActivity.this, "password too short", Toast.LENGTH_SHORT).show();
                }else{
                    signUpUser(user, pass);
                }
            }
        });
    }

    private void signUpUser(String user, String pass) {
        auth.createUserWithEmailAndPassword(user, pass).addOnCompleteListener(SignupActivity.this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    Toast.makeText(SignupActivity.this, "Welcome to IPF Community", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(SignupActivity.this, FeedActivity.class));
                    finish();
                }else{
                    Toast.makeText(SignupActivity.this, "sorry, account not created", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}