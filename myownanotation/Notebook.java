package com.epam.lab5.myownanotation;

public class Notebook {
@MyAnotation(os = "IOS",year = 2016)
    private String mark;
    private String model;
    @MyAnotation(year = 2013)
    private  int hdd;
    private boolean isCD;
    private int ram;

    public Notebook() {
    }

    public String getMarkPlusModel(String mark,String model) {
        return mark+" "+model;
    }
    public void clearDisc( ){
        System.out.println("CD clear");
    }
    public double converprice(int ram){
        return ram*0.3;
    }

}
