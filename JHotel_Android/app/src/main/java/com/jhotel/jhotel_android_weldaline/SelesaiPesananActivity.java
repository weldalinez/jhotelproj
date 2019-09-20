package com.jhotel.jhotel_android_weldaline;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SelesaiPesananActivity extends AppCompatActivity {
    private int id_cust;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selesai_pesanan);

        id_cust = getIntent().getIntExtra("ID Customer", 1);
    }
}

