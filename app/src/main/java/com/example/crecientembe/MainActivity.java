package com.example.crecientembe;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {


    private Button jugar;
    private Button config;
    private Button acercade;
    private Button finalizar;

    boolean actividadIniciadaAhora;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show();
        if (savedInstanceState != null) {
            actividadIniciadaAhora= savedInstanceState.getBoolean("chivatoInicializacion");
        } else {
            actividadIniciadaAhora=true;
        }
        Toast.makeText(this, "IniciadaAhora"+ actividadIniciadaAhora, Toast.LENGTH_SHORT).show();
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public void onResume(){
        super.onResume();

        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show();

            /*
            acercade = (Button) findViewById(R.id.AcercaDe) ;
            acercade.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //ahora hay que crear la nueva actividdad
                    //Intent intent1 = new Intent(this, AcercaDeActivity.class );
                    //startActivity(intent1);
                }
            });


            jugar = (Button) findViewById(R.id.Jugar) ;
            jugar.setOnClickListener(this);

            config = (Button) findViewById(R.id.Config) ;
            config.setOnClickListener(this);

            finalizar = (Button) findViewById(R.id.Finalizar) ;
            finalizar.setOnClickListener(this);
            */



    }



    public void mostrar_acercade(View view) {
        Intent intent1 = new Intent(this, AcercaDeActivity.class );
        startActivity(intent1);
    }

    public void cerrarApp(View view){
        finish();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "onRestart", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "BYE BYE", Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onSaveInstanceState(@NonNull Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putBoolean("chivatoInicializacion", false);
    }
}