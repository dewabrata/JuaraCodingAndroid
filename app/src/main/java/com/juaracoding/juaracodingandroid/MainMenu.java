package com.juaracoding.juaracodingandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;



public class MainMenu extends AppCompatActivity {

    public static int REQUEST_CODE = 111;

    Button btnTambah,btnEdit;
    String username="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainmenu);

        username = getIntent().getStringExtra("username");

        Toast.makeText(MainMenu.this,"Selamat datang " +username, Toast.LENGTH_LONG).show();
        btnTambah = (Button)findViewById(R.id.btnTambah);
        btnEdit = (Button)findViewById(R.id.btnEdit);

        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(new Intent(MainMenu.this,FormTambah.class),REQUEST_CODE);
              //  startActivity(new Intent(MainMenu.this,FormTambah.class));
            }
        });

        btnEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivityForResult(new Intent(MainMenu.this,FormTambahDua.class),REQUEST_CODE);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
      if(requestCode == MainMenu.REQUEST_CODE && resultCode == FormTambah.RESULT_CODE){
          String nama = data.getStringExtra("nama");
          String alamat = data.getStringExtra("alamat");
          String phone = data.getStringExtra("telepon");

          Toast.makeText(MainMenu.this,"Hasil datanya adalah" + nama +" "+ alamat +" "+phone, Toast.LENGTH_LONG).show();
      }

        if(requestCode == MainMenu.REQUEST_CODE && resultCode == FormTambahDua.RESULT_CODE){


            Toast.makeText(MainMenu.this,"Ini dari form TambahDua", Toast.LENGTH_LONG).show();
        }
    }
}