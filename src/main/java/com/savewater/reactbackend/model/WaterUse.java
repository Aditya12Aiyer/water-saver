package com.savewater.reactbackend.model;

public class WaterUse
{

    public static double washingCar(double minutes){
        return minutes * 10;
    }
    public static double washingPatio(double minutes){
        return minutes * 12.5;
    }
    public static double hose(double minutes){
        return minutes * 9;
    }
    public static double washingMachine(double minutes){
        return minutes * 4.5;
    }
    public static double shower(double minutes){
        return minutes * 2.1;
    }
    public static double handDishes(double minutes){
        return minutes * 2.5;
    }
    public static double brushingTeeth(double minutes){
        return minutes * 1.5;
    }
    public static double Handwashing(double minutes){
        return minutes * 1.5;
    }
    public static double wateringPlants(double minutes){
        return minutes * .75;
    }
    public static double toilet(){
        return 1.5;
    }
    public static double bath(){
        return 40;
    }
    public static double cooking(){
        return 5;
    }
    public static double cleaning(){
        return 3;
    }
    public static double pool(){
        return 20000;
    }
    public static double dishwasher(){
        return 4;
    }
}