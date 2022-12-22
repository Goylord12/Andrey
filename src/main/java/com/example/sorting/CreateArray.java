package com.example.sorting;

public class CreateArray {
    private Float[] array;
    public CreateArray(String stringArray){
        String[] as = stringArray.split(", |,");
        this.array = new Float[as.length];
        for(int i = 0; i < as.length; i++){
            this.array[i] = Float.parseFloat(as[i]);
        }

    }

    public Float[] getArray(){
        return this.array;
    }
}

