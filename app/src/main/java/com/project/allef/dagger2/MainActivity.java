package com.project.allef.dagger2;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.project.allef.dagger2.data.Car;

public class MainActivity extends AppCompatActivity {
    private SharedPreferences sharedPreferences;
    private Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        car = new Car();
        car.increaseSpeed(199);
        Toast.makeText(this, "Speed: "+car.getSpeed(), Toast.LENGTH_LONG).show();

        sharedPreferences = getSharedPreferences("daggerPref",MODE_PRIVATE);
        sharedPreferences.edit().putInt(Car.SPEED,car.getSpeed()).apply();
        Toast.makeText(this, "Prefe: "+sharedPreferences.getInt(Car.SPEED,0) , Toast.LENGTH_LONG).show();
    }
}
