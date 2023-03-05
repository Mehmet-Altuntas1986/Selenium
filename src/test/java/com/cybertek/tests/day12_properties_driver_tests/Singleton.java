package com.cybertek.tests.day12_properties_driver_tests;

public class Singleton {  //using the same object everywhere in the application        //Bu class Driver class ini anlamamiz icin olusturuldu.Driver classinda singleton pattern i kullaniyoruz

     // singleton class will have private constructor
    //  it means other classes cannot create object of this class

    private Singleton(){} //constructor

    private static String str;

    public static String getInstance(){   //Diger class larda bu class ile object olusturulamaz, cunku constructor private
                                          //ama bu class in ismiyle bu methodu herhangi bir yerde cagirabiliriz ,cunku static bir method

        //if str has no value, initialize it and return it
        if(str==null){
            System.out.println("str is null. assigning value it");
            str="somevalue";
        }else{
            //if it has value just return it
            System.out.println("it has value, just returning it");
        }

        return str;
    }

}

//son 30 dk tum day12 de ne yapti acikladi
//configuration.properties e bak
//bu class singleton u anlamak icin  , buna benzer bir class olarak Driver class i olusturduk