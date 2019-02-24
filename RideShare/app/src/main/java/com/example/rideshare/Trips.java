package com.example.rideshare;

public class Trips {
    private double cost;
    private String start;
    private String destination;
    private String DriverName;
    private String DriverReview;

    public Trips(){
        cost=0.0;
        start="";
        destination="";
        DriverName="";
        DriverReview="";

    }

    public void setCost(double v){
        this.cost=v;

    }
    public void setStart(String s){
        this.start=s;
    }

    public  void setDestination(String s){
        destination=s;
    }

    public void setDriverName(String s){
        this.DriverName=s;
    }
    public void setDriverReview(String s){
        this.DriverReview=s;

    }
    public double getCost(){
        return cost;
    }

    public String getStart(){
        return start;
    }

    public String getDestination(){
        return destination;
    }

    public  String getDriverName(){
        return DriverName;
    }

    public  String getDriverReview(){
        return DriverReview;
    }

}
