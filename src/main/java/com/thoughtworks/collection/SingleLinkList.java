package com.thoughtworks.collection;

 class Node<T>{
    protected Node next;
    public T data;
    public Node( T data){
        this.data=data;
    }
}

public class SingleLinkList<T> implements SingleLink<T> {
     public  Node<T> first;
     private int pos=0;
     int len=0;
    public T getHeaderData(){
        return first.data;
    }
    public T getTailData(){

    }
    public int size(){
        return 1;
    }
    public boolean isEmpty(){
        if(len==0) return true;
        return false;
    }
    public boolean deleteFirst(){
        return true;
    }
    public boolean deleteLast(){ //删除尾部元素；
        return true;
    }
    public void addHeadPointer(T item){ //添加头指针
        return;
    }

    public void addTailPointer(T item){ //添加尾指针
        return;
    }
    public T getNode(T index){
        return ;
    }
}
