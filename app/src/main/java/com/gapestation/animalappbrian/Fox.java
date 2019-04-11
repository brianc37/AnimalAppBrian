package com.gapestation.animalappbrian;

public class Fox extends Animal implements Animal.Fun {
    @Override
    public String say() {
        return("Ring-ding-ding-ding-dingeringeding");
    }

    public Fox(){

    }


    @Override
    public String play() {
        return("The fox chases mice and digs holes!");
    }
}
