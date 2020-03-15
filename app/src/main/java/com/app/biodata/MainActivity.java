package com.app.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edtNama;
    private EditText edtNPM;
    private EditText edtProdi;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNama = findViewById(R.id.edtName);
        edtNPM = findViewById(R.id.edtNpm);
        edtProdi = findViewById(R.id.edtProdi);
    }

    public void clikSimpan(View view)  {
        String nama = edtNama.getText().toString();
        String NPM = edtNPM.getText().toString();
        String prodi = edtProdi.getText().toString();
        Log.d("Tombol di klik ",nama+" dan "+NPM+" dan "+prodi);
        Toast.makeText(this, "nama: " + nama + "\nNPM: " + NPM +"\nprodi " + prodi, Toast.LENGTH_SHORT).show();



    }


}
