package com.example.intentcalendario;

import android.content.Intent;
import android.provider.CalendarContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void agregar(View view) {
        EditText evento= (EditText) findViewById(R.id.evento) ;
        EditText anoo= (EditText) findViewById(R.id.an) ;
        EditText mess= (EditText) findViewById(R.id.mes) ;
        EditText diaa= (EditText) findViewById(R.id.dia) ;
        EditText NOTA= (EditText) findViewById(R.id.nota) ;

        String eventotext= evento.getText().toString();
        int dia=Integer.parseInt(diaa.getText().toString());
        int mes=Integer.parseInt(mess.getText().toString());
        int ano=Integer.parseInt(anoo.getText().toString());

        Intent intent = new Intent(Intent.ACTION_INSERT);
        intent.setData(CalendarContract.Events.CONTENT_URI);
        intent.putExtra(CalendarContract.Events.TITLE, eventotext );

        GregorianCalendar calDate = new GregorianCalendar(ano,mes-1,dia);
        intent.putExtra(CalendarContract.EXTRA_EVENT_ALL_DAY, true);
        intent.putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME,calDate.getTimeInMillis());
        intent.putExtra(CalendarContract.EXTRA_EVENT_END_TIME, calDate.getTimeInMillis());
        ///Calendar cal = Calendar.getInstance();
        //cal.set(Calendar.DAY_OF_MONTH, dia);
        //cal.set(Calendar.MONTH,mes);
        //cal.set(Calendar.YEAR,ano);
        intent.putExtra(CalendarContract.Events.DESCRIPTION, NOTA.getText().toString());
        if(intent.resolveActivity(getPackageManager())!=null);
        startActivity(intent);
    }
}
