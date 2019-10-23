package com.juaracoding.juaracodingandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FormTambahDua extends AppCompatActivity {
    public static int RESULT_CODE = 333;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_tambah_dua);

        Button btnTest = (Button)findViewById(R.id.button);

        btnTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("nama","test");
                intent.putExtra("alamat","test");
                intent.putExtra("telepon","test");

                setResult(RESULT_CODE,intent);
                finish();
            }
        });
    }
}
