package com.gapestation.animalappbrian;

import java.util.ArrayList;
import java.util.Random;

public class Fox extends Animal implements Animal.Fun {
    @Override
    public String say() {
        ArrayList<String> sayings = new ArrayList<>();
        sayings.add("Ring-ding-ding-ding-dingeringeding!");
        sayings.add("Jacha-chacha-chacha-chow!");
        sayings.add("Wa-pa-pa-pa-pa-pa-pow!");
        sayings.add("Hatee-hatee-hatee-ho!");
        sayings.add("Joff-tchoff-tchoffo-tchoffo-tchoff!");
        sayings.add("Fraka-kaka-kaka-kaka-kow!");
        sayings.add("A-hee-ahee ha-hee!");
        Random x = new Random();
        int y = x.nextInt(7);
        return(sayings.get(y));
    }

    public Fox(){

    }


    @Override
    public String play() {
        return("The fox chases mice and digs holes!");
    }
}
