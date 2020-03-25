package com.Main;

import java.util.LinkedList;
import java.util.List;

public class Pila<T> {

    private List<T> list;

    public Pila(){
        setList(new LinkedList<T>());
    }

    public void push(T element){
        getList().add(element);
    }

    public T pop(){
        if(getList().isEmpty() || getList() == null){
            return null;
        }else {
            return getList().get(getList().size()-1);
        }
    }

    public int size(){
        if(getList().isEmpty() || getList() == null){
            return 0;
        }else {
            return getList().size();
        }
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return ""+ list ;
    }
}
