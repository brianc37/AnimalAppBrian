package com.gapestation.animalappbrian;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private TextView output;
    ArrayList<Animal> animals;
    Duck duck = new Duck();
    Fish fish = new Fish();
    Seal seal = new Seal();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        output = (TextView)findViewById(R.id.output);
        animals.add(fish);
        animals.add(duck);
        animals.add(seal);

        int i;
        for(i=0; animals.size() > i; i++){
            this.output.append("\n" + animals.get(i) + " goes: " + animals.get(i));
        }

    }
}
