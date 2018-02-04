package com.rahmaniaaas.studycase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName(); //konstanta variabel LOG_TAG

    static final String menu ="com.rahmaniaaas.studycase.extra.menu"; //
    static final String jumlah ="com.rahmaniaaas.studycase.extra.porsi";


    EditText makanan;
    EditText porsi;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        makanan = (EditText) findViewById(R.id.editMakanan); //menggunakan findViewById untuk mendapatkan referensi ke instance EditText dan menetapkan
        porsi = (EditText) findViewById(R.id.editPorsi);
    }

    public void EATBUS(View view) { //apabila diklik tombol EATBUS maka akan muncul tampilan ini
        Log.d(LOG_TAG, "Button clicked!"); //cek tombol bisa berfungsi pada log


        Intent intent = new Intent(this, SecondActivity.class); //memindahkan/berpindah ke aktivitas 2

        intent.putExtra("warung","Eatbus");

        String nMenu = makanan.getText().toString(); //mendapatkan teks dari EditText sebagai string
        intent.putExtra(menu, nMenu); //Menambahkan string yang dengan maksud sebagai tambahan dengan EXTRA_MESSAGE konstan sebagai kunci dan string sebagai nilai

        String nJumlah = porsi.getText().toString();
        intent.putExtra(jumlah,nJumlah);

        intent.putExtra("nominal","50000");

        startActivity(intent); //memanggil method intent
    }

    public void ABNORMAL(View view) { ////apabila diklik tombol ABNORMAL maka akan muncul tampilan ini
        Log.d(LOG_TAG, "Button clicked!"); //cek tombol bisa berfungsi pada log


        Intent intent = new Intent(this, SecondActivity.class);

        intent.putExtra("warung","Abnormal");

        String nmenu = makanan.getText().toString();
        intent.putExtra(menu, nmenu);

        String nJumlah = porsi.getText().toString();
        intent.putExtra(jumlah,nJumlah);

        intent.putExtra("nominal","30000");

        startActivity(intent); //memanggil method intent
    }
}