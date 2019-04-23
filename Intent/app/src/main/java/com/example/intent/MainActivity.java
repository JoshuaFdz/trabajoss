package com.example.intent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void correo(View view) {
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra(Intent.EXTRA_EMAIL, "m_cervantes@hotcakes.com");
        intent.putExtra(Intent.EXTRA_SUBJECT, "HOLA MUNDO");
        intent.putExtra(Intent.EXTRA_TEXT, "Este es mi mensaje");
        if(intent.resolveActivity(getPackageManager())!=null);
        startActivity(intent);
    }
}