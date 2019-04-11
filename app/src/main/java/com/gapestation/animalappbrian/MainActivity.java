package com.gapestation.animalappbrian;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private TextView output;
    ArrayList<Animal> animals = new ArrayList<>();
    Duck duck = new Duck();
    Fish fish = new Fish();
    Seal seal = new Seal();
    Fox fox = new Fox();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        output = (TextView)findViewById(R.id.output);
        animals.add(fish);
        animals.add(duck);
        animals.add(seal);
        animals.add(fox);

        //int i;
        //for(i=0; animals.size() > i; i++){
        //    this.output.append("\n" + animals.get(i) + " goes " + animals.get(i).say());
        //}

        for(Animal printanimals : animals){
            this.output.append("\n" + printanimals.getClass().getSimpleName() + " goes " + printanimals.say());
            if (printanimals instanceof Seal) {
                this.output.append("\n" + ((Seal)printanimals).play());
            }
            if (printanimals instanceof Fox) {
                this.output.append("\n" + ((Fox)printanimals).play());
            }
        }
    }
}
