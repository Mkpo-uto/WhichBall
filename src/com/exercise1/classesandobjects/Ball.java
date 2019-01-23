package com.exercise1.classesandobjects;

public class Ball {

    public String name;
    public String league;
    public int noOfTeams;
    public boolean isGlobal;

    public String nameOfBal() { return name;}
    public boolean isGlobal() {
        if (isGlobal == true) {
            return isGlobal;
        } else {
            return false;
        }
    }
    public int numOfTeams() { return noOfTeams;}
    public String championshipName () { return league; }
}
