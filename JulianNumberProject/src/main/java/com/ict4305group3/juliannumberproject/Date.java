/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ict4305group3.juliannumberproject;

/**
 *
 * @author ipiesh
 */
public class Date {
    
    private int myJulianNumber;
    
    public Date(){
    
    }; // If no arguments were provided then default date to epoch time, which January 1st, 1970. 

    public Date( Date date){
    
    };  

    public Date( int day, int month, int year){
    
    };  

    public int getDay(){
    
    }; 

    public int getMonth(){
    
    }; 

    public int getYear(){
    
    }; 

    public static boolean isLeapYear( int year ){
        if (year % 400 == 0) {
        return true;
    } 
        else if (year % 100 == 0) {
        return false;
    } 
        else return year % 4 == 0;
    }; 

    public static int getLastDayOfMonth( int month, int year ){

    }; 

    private int toJulianNumber(int day, int month, int year){
    
    }; 

    private int[] fromJulianNumber(){
        
    }; 

}
