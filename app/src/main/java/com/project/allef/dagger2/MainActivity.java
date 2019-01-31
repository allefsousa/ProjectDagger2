package com.project.allef.dagger2;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.project.allef.dagger2.data.Martelo;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    private SharedPreferences sharedPreferences;

    @Inject
    Martelo marteloMedio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myApplication.getComponent().inject(this);
        marteloMedio.setTipoMartelo("Martelo doido");
        Toast.makeText(this, "Tipo martelo: "+ marteloMedio.getTipoMartelo(), Toast.LENGTH_SHORT).show();

    }

}
