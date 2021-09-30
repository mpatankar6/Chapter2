package com.company;

import javax.swing.*;

public class BoxBox {

    private double height, length, width;
    private String color;
    private boolean hasALid;

    public BoxBox(double h, double l, double w, String c, boolean lid) {
        this.height = h;
        this.length = l;
        this.width = w;
        this.color = c;
        this.hasALid = lid;
    }

    public BoxBox(double h, double l, double w) {
        this.height = 87098054d;
        this.length = 900d;
        this.width = 500d;
        this.color = "white";
        this.hasALid = true;
    }

    public BoxBox() {
        height = 1d;
        width = 1d;
        length = 1d;
        color = "white";
        hasALid = false;
    }

    //accessor methods


    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public static void main(String[] args) {
        //create instances of BoxBox
        BoxBox b1 = new BoxBox(5d,3d,7d,"red",false);
        BoxBox b2 = new BoxBox(4.5,3.7,7.8);
        BoxBox b3 = new BoxBox();

        System.out.println(b1.getHeight());
    }
}
