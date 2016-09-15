/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package csd207_lab3;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author ANURAG
 */
public class Sundays {

    /**
     * @param args the command line arguments
     * @throws java.text.ParseException
     */
    public static void main(String[] args) throws ParseException{
        
        int n;
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        for(int i=0;i<test;i++){
        //System.out.println("Enter the month: ");
        int m=sc.nextInt();
        String month = Integer.toString(m);
        //System.out.println("Enter the year: ");
        int y=sc.nextInt();
        String year = Integer.toString(y);
        StringBuffer sb=new StringBuffer("01/");
        sb.append(month);
        sb.append("/");
        sb.append(year);
        String input_date=sb.toString();
        
        
        
        //String input_date="01/08/2016";
        SimpleDateFormat format1=new SimpleDateFormat("dd/MM/yyyy");
        Date dt1=format1.parse(input_date);
        DateFormat format2=new SimpleDateFormat("EEEE"); 
        String finalDay=format2.format(dt1);
        //System.out.println(finalDay);
        
        String date=input_date.substring(0,2);
        int d = Integer.parseInt(date);
        if(finalDay.equals("Monday"))
        {
           n=1;
           d=d+(7-n);
        }
        else if(finalDay.equals("Tuesday"))
        {
           n=2; 
           d=d+(7-n);
        }
        else if(finalDay.equals("Wednesday"))
        {
           n=3;
           d=d+(7-n);
        }
        else if(finalDay.equals("Thursday"))
        {
           n=4;
           d=d+(7-n);
        }
        else if(finalDay.equals("Friday"))
        {
           n=5; 
           d=d+(7-n);
        }
        else if(finalDay.equals("Saturday"))
        {
           n=6;
           d=d+(7-n);
        }
        else if(finalDay.equals("Sunday"))
        {
           n=7; 
           d=d+(7-n);
        }
        
         System.out.print(d+" ");
         while(d<=31)
         {
             d=d+7;
             if(d<=31)
             System.out.print(d+" ");
         }
         System.out.println("");
    }
    }
}

