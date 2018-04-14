package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        int sunofevens=0;
        int min=Math.min(leftBorder,rightBorder);
        int max=Math.max(leftBorder,rightBorder);
        while (min<=max){
            if(min%2==0){
                sunofevens+=min;
                min+=2;
            }
            else min++;
        }
        return sunofevens;
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        int sumofodd=0;
        int min=Math.min(leftBorder,rightBorder);
        int max=Math.max(leftBorder,rightBorder);
        while (min<=max){
            if(min%2==1){
                sumofodd+=min;
                min+=2;
            }
            else min++;
        }
        return sumofodd;
    }
    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
       int suntripleandtwo=0;
        for(Integer i:arrayList){
            suntripleandtwo+=(i.intValue()*3+2);
        }
        return suntripleandtwo;
    }
    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        List<Integer> tripleofoddandtwo=new ArrayList<>();
        for (Integer num:arrayList){
            int i=num.intValue();
            if(i%2==1){
                tripleofoddandtwo.add(i*3+2);
            }
            else tripleofoddandtwo.add(i);
        }
        return tripleofoddandtwo;
    }
    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        int sumofprocessedodds=0;
        for (Integer num:arrayList){
            if(num%2==1){
                sumofprocessedodds+=(num*3+5);
            }
        }
        return sumofprocessedodds;
    }
    public List<Integer> getEvenofArray(List<Integer> arrayList){
        List<Integer> median=new ArrayList<>();
        for(Integer num:arrayList){
            if(num.intValue()%2==0){
                median.add(num);
            }
        }
        return median;
    }
    public double getMedianOfEvenIndex(List<Integer> arrayList) {
        double medianofeven=0;
        Add add=new Add();
        List<Integer> median=add.getEvenofArray(arrayList);
        int evennum=median.size();
        int Index=evennum/2;
        if(evennum%2==0){
            medianofeven=(median.get(Index)+median.get(Index-1))/2;
        }
        else medianofeven=median.get(Index);
        return medianofeven;
    }

    public double getAverageOfEvenIndex(List<Integer> arrayList) {
        double medianofeven=0;
        Add add=new Add();
        List<Integer> median=add.getEvenofArray(arrayList);
        int evennum=median.size();
        for( Integer i:median)
            medianofeven+=i.intValue();
        if(evennum==0) return 0;
        return medianofeven/evennum;
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        Add add=new Add();
        List<Integer> evenelement=add.getEvenofArray(arrayList);
        boolean SpElement=evenelement.contains(specialElment);
        return SpElement;
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        List<Integer> processedlist=new ArrayList<>();
        for(int i=0;i<arrayList.size()-1;i++){
            int sum=arrayList.get(i).intValue()+arrayList.get(i+1).intValue();
            processedlist.add(sum*3);
        }
        return processedlist;
    }
}
