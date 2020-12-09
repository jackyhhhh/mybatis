package com.tarena.entity;

import java.io.Serializable;

public class Page implements Serializable {
    private int begin;
    private int size;

    public Page(){}

    public Page(int begin, int size){
        super();
        this.begin = begin;
        this.size = size;
    }
    public int getBegin() {
        return begin;
    }

    public void setBegin(int begin) {
        this.begin = begin;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
