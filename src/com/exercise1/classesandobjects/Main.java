package com.exercise1.classesandobjects;

public class Main {

    public static void main(String [] args){

        Ball football = new Ball();
        football.noOfTeams = 32;
        football.isGlobal = true;
        football.league = "NFL";
        football.name = "SuperBowl";

        System.out.println( football.numOfTeams() + " " + football.isGlobal() + " " + football.nameOfBal() + " " + football.championshipName());

        Ball soccer = new Ball();
        soccer.noOfTeams = 32;
        soccer.isGlobal = true;
        soccer.league = "FIFA";
        soccer.name = "FIFA World Cup";

        System.out.println( soccer.numOfTeams() + " " + soccer.isGlobal() + " " + soccer.nameOfBal() + " " + soccer.championshipName());

        Ball baseball = new Ball();
        baseball.noOfTeams = 30;
        baseball.isGlobal = true;
        baseball.league = "MLB";
        baseball.name = "World Series";

        System.out.println( baseball.numOfTeams() + " " + baseball.isGlobal() + " " + baseball.nameOfBal() + " " + baseball.championshipName());








    }
}
