package com.juaracoding.juaracodingandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    Button btnSignIn,btnSignUp;
    EditText txtUsername,txtPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtUsername = (EditText)findViewById(R.id.txtUsername);
        txtPassword = (EditText)findViewById(R.id.txtPassword);
        btnSignIn = (Button)findViewById(R.id.btnSignIn);
        btnSignUp = (Button)findViewById(R.id.btnSignUp);

        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(txtUsername.getText().toString().equalsIgnoreCase("dewa") && txtPassword.getText().toString().equalsIgnoreCase("1234")) {
                    Intent intent = new Intent(LoginActivity.this, MainMenu.class);
                    intent.putExtra("username",txtUsername.getText().toString());
                    startActivity(intent);
                }else{
                    Toast.makeText(LoginActivity.this,"Maaf password salah",Toast.LENGTH_LONG).show();
                }
            }
        });

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri telepon = Uri.parse("http://juaracoding.com");
                Intent it = new Intent(Intent.ACTION_VIEW, telepon);
                startActivity(it);

            }
        });

    }
}
