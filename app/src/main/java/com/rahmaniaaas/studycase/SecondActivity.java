package com.rahmaniaaas.studycase;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    TextView warung;
    TextView makanan;
    TextView porsi;
    TextView nominal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();

        String mWarung = intent.getStringExtra("warung");
        String mMakanan = intent.getStringExtra(MainActivity.menu);
        String mPorsi = intent.getStringExtra(MainActivity.jumlah);
        String mHarga = intent.getStringExtra("nominal");
        int mHargatot = Integer.valueOf(mPorsi)*Integer.valueOf(mHarga);

        warung = (TextView) findViewById(R.id.nWarung);
        warung.setText(mWarung);

        makanan = (TextView) findViewById(R.id.nMakanan);
        makanan.setText(mMakanan);

        porsi = (TextView) findViewById(R.id.nJumlah) ;
        porsi.setText(mHarga);

        nominal = (TextView) findViewById(R.id.nNominal);
        nominal.setText(String.valueOf(mHargatot));

        if (mHargatot > 65000){ //logika
            Context context = getApplicationContext();
            Toast toast = Toast.makeText(context, "Uang kamu tidak cukup untuk makan malam disini! Mahal", Toast.LENGTH_LONG);
            toast.show();
        }else {
            Context context =getApplicationContext();
            Toast toast = Toast.makeText(context, "Uang kamu cukup untuk makan malam disini! Mantap", Toast.LENGTH_LONG);
            toast.show();
        }

    }
}