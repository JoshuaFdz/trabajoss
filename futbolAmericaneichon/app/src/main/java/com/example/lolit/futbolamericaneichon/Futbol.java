package com.example.lolit.futbolamericaneichon;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Futbol extends AppCompatActivity {
    int x=2,xe=1;
    int z=1;
    int counter=0,counter2=0,downs=1,yfalt=10;
    TextView showvalues1,showvalues2,showvaluesop,showvaluesyfaltantes;
    Button touchdown,touchdown2,fgoal,safety,down,sw,reset,masyardas,menosyardas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_futbol);
        showvalues1=(TextView)findViewById(R.id.puntoslocal);
        showvalues2=(TextView)findViewById(R.id.puntosvisitantes);
        showvaluesop=(TextView)findViewById(R.id.oportunidad);
        showvaluesyfaltantes=(TextView)findViewById(R.id.yardasfaltantes);
        touchdown=findViewById(R.id.touchdown);
        fgoal=findViewById(R.id.fieldgoal);
        safety=findViewById(R.id.safety);
        reset=findViewById(R.id.reset);
        down=findViewById(R.id.down);
        sw=findViewById(R.id.Switch);
        masyardas=findViewById(R.id.button7);
        menosyardas=findViewById(R.id.button6);

        yfalt=10;
        downs=1;

        //revisar();

        touchdown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if (xe==1)
                {
                    if (z==1)
                    {
                        counter=counter+6;
                        z=2;
                        showvalues1.setText(Integer.toString(counter));
                        touchdown.setText("Touch extra +2");
                        fgoal.setText("Extra point +1");
                        downs=1;
                        showvaluesop.setText(Integer.toString(downs));
                        yfalt=10;
                        showvaluesyfaltantes.setText(Integer.toString(yfalt));
                        down.setEnabled(false);
                        masyardas.setEnabled(false);
                        menosyardas.setEnabled(false);
                    }
                    else
                    {
                        counter=counter+2;
                        showvalues1.setText(Integer.toString(counter));
                        touchdown.setText("touchdown +6");
                        fgoal.setText("field goal +3");
                        downs=1;
                        showvaluesop.setText(Integer.toString(downs));
                        yfalt=10;
                        showvaluesyfaltantes.setText(Integer.toString(yfalt));
                        x=2;
                        Switch();
                        down.setEnabled(true);
                        masyardas.setEnabled(true);
                        menosyardas.setEnabled(true);
                    }
                }
                else
                {
                    if (z==1)
                    {
                        counter2=counter2+6;
                        touchdown.setText("Touch extra +2");
                        fgoal.setText("Extra point +1");
                        z=2;
                        showvalues2.setText(Integer.toString(counter2));
                        downs=1;
                        showvaluesop.setText(Integer.toString(downs));
                        yfalt=10;
                        showvaluesyfaltantes.setText(Integer.toString(yfalt));
                        down.setEnabled(false);
                        masyardas.setEnabled(false);
                        menosyardas.setEnabled(false);
                    }
                    else
                    {
                        counter2=counter2+2;
                        touchdown.setText("touchdown +6");
                        fgoal.setText("field goal +3");
                        x=1;
                        showvalues2.setText(Integer.toString(counter2));
                        downs=1;
                        showvaluesop.setText(Integer.toString(downs));
                        yfalt=10;
                        showvaluesyfaltantes.setText(Integer.toString(yfalt));
                        Switch();
                        down.setEnabled(true);
                        masyardas.setEnabled(true);
                        menosyardas.setEnabled(true);
                    }


                }
            }
        });
        fgoal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if (xe==1)
                {
                    if (z==1)
                    {

                        counter=counter+3;
                        z=2;
                        showvalues1.setText(Integer.toString(counter));
                        downs=1;
                        showvaluesop.setText(Integer.toString(downs));
                        yfalt=10;
                        showvaluesyfaltantes.setText(Integer.toString(yfalt));
                        Switch();
                        down.setEnabled(true);
                        masyardas.setEnabled(true);
                        menosyardas.setEnabled(true);
                    }
                    else
                    {
                        counter=counter+1;
                        fgoal.setText("field goal +3");
                        touchdown.setText("touchdown +6");
                        showvalues1.setText(Integer.toString(counter));
                        downs=1;
                        showvaluesop.setText(Integer.toString(downs));
                        yfalt=10;
                        showvaluesyfaltantes.setText(Integer.toString(yfalt));
                        x=2;
                        Switch();
                        down.setEnabled(true);
                        masyardas.setEnabled(true);
                        menosyardas.setEnabled(true);
                    }
                }
                else
                {
                    if (z==1)
                    {
                        counter2=counter2+3;
                        z=2;
                        showvalues2.setText(Integer.toString(counter2));
                        downs=1;
                        showvaluesop.setText(Integer.toString(downs));
                        yfalt=10;
                        showvaluesyfaltantes.setText(Integer.toString(yfalt));
                        Switch();
                        down.setEnabled(true);
                        masyardas.setEnabled(true);
                        menosyardas.setEnabled(true);
                    }
                    else
                    {
                        counter2=counter2+1;
                        fgoal.setText("field goal +3");
                        touchdown.setText("touchdown +6");
                        x=1;
                        showvalues2.setText(Integer.toString(counter2));
                        downs=1;
                        showvaluesop.setText(Integer.toString(downs));
                        yfalt=10;
                        showvaluesyfaltantes.setText(Integer.toString(yfalt));
                        Switch();
                        down.setEnabled(true);
                        masyardas.setEnabled(true);
                        menosyardas.setEnabled(true);
                    }


                }
            }
        });
        safety.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if (xe==1)
                {
                    if (z==1)
                    {
                        counter=counter+2;
                        z=2;
                        Switch();
                        showvalues1.setText(Integer.toString(counter));
                        downs=1;
                        showvaluesop.setText(Integer.toString(downs));
                        yfalt=10;
                        showvaluesyfaltantes.setText(Integer.toString(yfalt));
                        down.setEnabled(true);
                        masyardas.setEnabled(true);
                        menosyardas.setEnabled(true);
                    }
                    else
                    {
                        counter=counter+2;

                        showvalues1.setText(Integer.toString(counter));
                        downs=1;
                        showvaluesop.setText(Integer.toString(downs));
                        yfalt=10;
                        showvaluesyfaltantes.setText(Integer.toString(yfalt));
                        x=2;
                        Switch();
                        down.setEnabled(true);
                        masyardas.setEnabled(true);
                        menosyardas.setEnabled(true);
                    }
                }
                else
                {
                    if (z==1)
                    {
                        counter2=counter2+2;
                        z=2;
                        Switch();
                        showvalues2.setText(Integer.toString(counter2));
                        downs=1;
                        showvaluesop.setText(Integer.toString(downs));
                        yfalt=10;
                        showvaluesyfaltantes.setText(Integer.toString(yfalt));
                        down.setEnabled(true);
                        masyardas.setEnabled(true);
                        menosyardas.setEnabled(true);
                    }
                    else
                    {
                        counter2=counter2+2;
                        x=1;
                        showvalues2.setText(Integer.toString(counter2));
                        downs=1;
                        showvaluesop.setText(Integer.toString(downs));
                        yfalt=10;
                        showvaluesyfaltantes.setText(Integer.toString(yfalt));
                        Switch();
                        down.setEnabled(true);
                        masyardas.setEnabled(true);
                        menosyardas.setEnabled(true);
                    }


                }
            }
        });
        down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if (downs>3)
                {
                    Switch();
                    downs=1;
                    showvaluesop.setText(Integer.toString(downs));
                    yfalt=10;
                    showvaluesyfaltantes.setText(Integer.toString(yfalt));
                }
                else
                {
                    downs++;
                    showvaluesop.setText(Integer.toString(downs));

                }
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                resett();
            }
        });
        sw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Switch();
            }
        });
        masyardas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {


                if (downs>3)
                {
                    Switch();
                    downs=1;
                    showvaluesop.setText(Integer.toString(downs));
                    yfalt=10;
                    showvaluesyfaltantes.setText(Integer.toString(yfalt));

                }
                else
                {
                    if (yfalt==100)
                    {
                        yfalt=100;
                        showvaluesyfaltantes.setText(Integer.toString(yfalt));
                    }
                    else
                    {
                        yfalt++;
                        showvaluesyfaltantes.setText(Integer.toString(yfalt));
                    }

                }
            }
        });
        menosyardas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                if (downs>3)
                {
                    Switch();
                    downs=1;
                    showvaluesop.setText(Integer.toString(downs));
                    yfalt=10;
                    showvaluesyfaltantes.setText(Integer.toString(yfalt));
                }
                else
                {
                    if (yfalt==1)
                    {
                        yfalt=1;
                        showvaluesyfaltantes.setText(Integer.toString(yfalt));
                    }
                    else
                    {
                        yfalt--;
                        showvaluesyfaltantes.setText(Integer.toString(yfalt));
                    }

                }
            }
        });

    }
    public void Switch()
    {
        down.setEnabled(true);
        masyardas.setEnabled(true);
        menosyardas.setEnabled(true);
        if (x==2)
        {
            downs=1;
            showvaluesop.setText(Integer.toString(downs));
            yfalt=10;
            showvaluesyfaltantes.setText(Integer.toString(yfalt));

            z=1;
            xe=2;
            x=1;
            showvalues2.setTextColor(Color.RED);
            showvalues1.setTextColor(Color.BLACK);
        }
        else
        {
            if (x==1)
            {
                downs=1;
                showvaluesop.setText(Integer.toString(downs));
                yfalt=10;
                showvaluesyfaltantes.setText(Integer.toString(yfalt));
                z=1;
                xe=1;
                x=2;
                showvalues1.setTextColor(Color.RED);
                showvalues2.setTextColor(Color.BLACK);
            }
        }

    }
    public void resett()
    {
        //turno=true;
        xe=1;
        z=1;
        x=2;
        downs=1;
        touchdown.setText("touchdown +6");
        fgoal.setText("field goal +3");
        showvaluesop.setText(Integer.toString(downs));
        yfalt=10;
        showvaluesyfaltantes.setText(Integer.toString(yfalt));
        counter=0;
        showvalues1.setText(Integer.toString(counter));
        counter2=0;
        showvalues2.setText(Integer.toString(counter2));
        showvalues1.setTextColor(Color.RED);
        showvalues2.setTextColor(Color.BLACK);
        down.setEnabled(true);
        masyardas.setEnabled(true);
        menosyardas.setEnabled(true);
    }



}
