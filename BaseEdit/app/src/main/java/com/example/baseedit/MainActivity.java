package com.example.baseedit;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    boolean hay=false;


    public void insertar(View view){
        EditText no_control=(EditText)findViewById(R.id.Reloj);
        EditText nombre=(EditText)findViewById(R.id.nombre);
        EditText Apaterno=(EditText)findViewById(R.id.ApellidoPaterno);
        EditText Amaterno=(EditText)findViewById(R.id.ApellidoMaterno);
        if (no_control.getText().toString().equals(""))
        {
            Toast.makeText(MainActivity.this, "llene todos los campos", Toast.LENGTH_SHORT).show();
        }else {
            Integer control = Integer.parseInt(no_control.getText().toString());
            DatabaseHelper helper = new DatabaseHelper(MainActivity.this, "Alumnos", null, 1);
            SQLiteDatabase db = helper.getWritableDatabase();

            if (db != null) {
                if (no_control.getText().toString().equals("") || nombre.getText().toString().equals("") || Apaterno.getText().toString().equals("") || Amaterno.getText().toString().equals(""))
                    Toast.makeText(MainActivity.this, "llene todos los campos", Toast.LENGTH_SHORT).show();
                else {
                    db.execSQL("INSERT INTO Alumnos(no_control,nombre,aPaterno,aMaterno)values(" + control + ",'" + nombre.getText().toString() + "','" + Apaterno.getText().toString() + "','" + Amaterno.getText().toString() + "'" + ")");
                    Toast.makeText(MainActivity.this, "Registro guardado", Toast.LENGTH_SHORT).show();
                    db.close();
                }
            }


        }
    }
    public void consulta(View view){
        EditText no_control=(EditText)findViewById(R.id.Reloj);
        EditText nombre=(EditText)findViewById(R.id.nombre);
        EditText Apaterno=(EditText)findViewById(R.id.ApellidoPaterno);
        EditText Amaterno=(EditText)findViewById(R.id.ApellidoMaterno);
        if (no_control.getText().toString().equals(""))
        {
            Toast.makeText(MainActivity.this, "llene todos los campos", Toast.LENGTH_SHORT).show();
        }else {
        Integer control = Integer.parseInt(no_control.getText().toString());
        String registros="";
        DatabaseHelper helper = new DatabaseHelper(MainActivity.this,"Alumnos", null, 1);
        SQLiteDatabase db=helper.getWritableDatabase();

        if(db!=null){

            Cursor cursor=db.rawQuery("SELECT*FROM Alumnos",null);
            if(cursor.moveToFirst()){
                do{
                    registros +=cursor.getInt(cursor.getColumnIndex("no_control"));
                    registros+=" ";
                    registros +=cursor.getString(cursor.getColumnIndex("nombre"));
                    registros+=" ";
                    registros +=cursor.getString(cursor.getColumnIndex("aPaterno"));
                    registros+=" ";
                    registros +=cursor.getString(cursor.getColumnIndex("aMaterno"));
                    registros+="\n";
                }while (cursor.moveToNext());
                hay=true;
            }
            if(registros.equals("")){
                Toast.makeText(MainActivity.this,"no hay registros",Toast.LENGTH_SHORT).show();
                hay=false;
            }
            else{
                Toast.makeText(MainActivity.this,registros,Toast.LENGTH_SHORT).show();
                db.close();
                hay=false;
            }

        }}
    }
    public void update(View view) {
        EditText no_control = (EditText) findViewById(R.id.Reloj);
        EditText nombre = (EditText) findViewById(R.id.nombre);
        EditText Apaterno = (EditText) findViewById(R.id.ApellidoPaterno);
        EditText Amaterno = (EditText) findViewById(R.id.ApellidoMaterno);
        if (no_control.getText().toString().equals("")) {
            Toast.makeText(MainActivity.this, "llene todos los campos", Toast.LENGTH_SHORT).show();
        } else {
            Integer control = Integer.parseInt(no_control.getText().toString());
            String Nombre = nombre.getText().toString();
            String ApellidoP = Apaterno.getText().toString();
            String ApellidoM = Amaterno.getText().toString();
            DatabaseHelper helper = new DatabaseHelper(MainActivity.this, "Alumnos", null, 1);
            SQLiteDatabase db = helper.getWritableDatabase();

            if (db != null) {
                if (hay == false) {
                    db.execSQL("UPDATE Alumnos set no_control=" + control + "," + "nombre='" + Nombre + "'," + "aPaterno='" + ApellidoP + "'," + "aMaterno='" + ApellidoM + "';");
                    Toast.makeText(MainActivity.this, "Registro Actualizado", Toast.LENGTH_SHORT).show();
                    db.close();
                } else {
                    Toast.makeText(MainActivity.this, "no se puede actualizar", Toast.LENGTH_SHORT).show();
                    db.close();
                }
            }
        }
    }
    public void eliminar(View view){
        EditText no_control=(EditText)findViewById(R.id.Reloj);
        Integer control = Integer.parseInt(no_control.getText().toString());
        DatabaseHelper helper = new DatabaseHelper(MainActivity.this,"Alumnos", null, 1);
        SQLiteDatabase db=helper.getWritableDatabase();

        if(db!=null){
            if(hay==false) {
                db.execSQL("delete from Alumnos  WHERE no_control=" + control + ";");
                Toast.makeText(MainActivity.this, "Registro eliminado", Toast.LENGTH_SHORT).show();
                db.close();
            }
            else
            {
                Toast.makeText(MainActivity.this,"no hay registros para eliminar",Toast.LENGTH_SHORT).show();
            }
        }
        else{
            Toast.makeText(MainActivity.this,"no hay registros para eliminar",Toast.LENGTH_SHORT).show();
        }
    }


}
