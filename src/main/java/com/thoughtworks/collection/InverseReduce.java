package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class InverseReduce {

    private Random random = new Random();

    public InverseReduce() {}

    public InverseReduce(Random random) {
        this.random = random;
    }

    public List<Integer> divideToSmaller(int number) {
        List<Integer> list=new ArrayList<>();
        int divide=random.nextInt(3);//这边mock是什么意思？
        while (number>=divide){
            int Smaller=number-divide;
            list.add(Smaller);
            number-=divide;
        }
        return list;
    }
}
