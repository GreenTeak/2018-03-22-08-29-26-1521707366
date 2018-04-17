package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;

public class Reduce {

    List<Integer> arrayList;

    public Reduce(List<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public int getMaximum() {
        Add add=new Add();
        List<Integer> list=new ArrayList<>();
        list=add.decendofList(arrayList);
        return list.get(0);
    }

    public double getMinimum() {
        Add add=new Add();
        List<Integer> list=new ArrayList<>();
        list=add.ascendofList(arrayList);
        return list.get(0);
    }

    public double getAverage() {
        Add add=new Add();
        double average=add.getAverageofIndex(arrayList);
        return  average;
    }

    public double getOrderedMedian() {
        Add add=new Add();
        double median=add.getMedianofIndex(arrayList);
        return  median;
    }

    public int getFirstEven() {
        Add add=new Add();
        List<Integer> list=add.getEvenofArray(arrayList);
        return list.get(0);
    }

    public int getIndexOfFirstEven() {
      int firstEven=getFirstEven();
      int index=arrayList.indexOf(firstEven);
      return index;
    }

    public boolean isEqual(List<Integer> arraylist) {
        int lenA=arraylist.size();
        int lenB=arrayList.size();
        if(lenA!=lenB) return false;
        for(Integer i:arrayList)
            if(!arraylist.contains(i))
                return false;
        return true;
    }

    //实现接口SingleLink，然后再此函数内使用
    public Double getMedianInLinkList(SingleLink singleLink) {

        throw new NotImplementedException();
    }

    public int getLastOdd() {
        Add add=new Add();
        List<Integer> list=add.getOddofArray(arrayList);
        int len=list.size()-1;
        return list.get(len);
    }

    public int getIndexOfLastOdd() {
        int lastOdd=getLastOdd();
        int index=arrayList.indexOf(lastOdd);
        return index;
    }
}
