package com.juaracoding.juaracodingandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

public class FormTambah extends AppCompatActivity {
public static int RESULT_CODE = 222;

ImageButton btnTambah;
    EditText txtNama,txtAlamat,txtPhone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_tambah);
        txtNama = (EditText) findViewById(R.id.txtNama);
        txtAlamat = findViewById(R.id.txtAlamat);
        txtPhone = findViewById(R.id.txtPhone);

        btnTambah = findViewById(R.id.btnTambah);

        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("nama",txtNama.getText().toString());
                intent.putExtra("alamat",txtAlamat.getText().toString());
                intent.putExtra("telepon",txtPhone.getText().toString());

                setResult(RESULT_CODE,intent);
                finish();

            }
        });


    }
}
