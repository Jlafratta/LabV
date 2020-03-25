package com.Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Generic<T extends Comparable> implements Comparable{

    private List<T> gArray;

    public Generic(){
        setgArray(new ArrayList<T>());
    }

    public boolean exists(T element){
        return getgArray().contains(element);
    }

    public T getMax(){
        T max = getgArray().get(0);

        if(getgArray().isEmpty() || getgArray() == null){
            return null;
        }else {
            for (T node : getgArray())
            {
                if(max.compareTo(node)<0){
                    max = node;
                }
            }
        }
        return max;
    }

    public T getMin(){
        T min = getgArray().get(0);

        if(getgArray().isEmpty() || getgArray() == null){
            return null;
        }else {
            for (T node : getgArray())
            {
                if(min.compareTo(node)>0){
                    min = node;
                }
            }
        }
        return min;
    }

    public T deleteLast(){

        T last = getgArray().get(getgArray().size()-1);

        if(getgArray().isEmpty() || getgArray() == null){
            return null;
        }else {
            getgArray().remove(getgArray().size()-1);
        }
        return last;
    }

    public List<T> getgArray() {
        return gArray;
    }

    public void setgArray(List<T> gArray) {
        this.gArray = gArray;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Generic)) return false;
        Generic<?> generic = (Generic<?>) o;
        return Objects.equals(getgArray(), generic.getgArray());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getgArray());
    }
}