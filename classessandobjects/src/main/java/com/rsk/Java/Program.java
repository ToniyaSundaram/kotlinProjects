package com.rsk.Java;

import com.rsk.kotlin.Meeting;

import static com.rsk.kotlin.Meeting.APP_VERSION;

public class Program {
    public static void main(String args[]) {
        Meeting m= new Meeting("Hi");
        m.setLocation("London");
        System.out.println("The meeting is in "+m.getLocation());
        m.desc = "It is a board meeting";
        System.out.println(""+m.desc);
        int appVersion = APP_VERSION;
        System.out.println("the version is "+appVersion);



    }
}
