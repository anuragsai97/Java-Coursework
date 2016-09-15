/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package csd207_lab3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ANURAG
 */
public class Coins {
    /**
     * @param args the command line arguments
     */
public static int count=0;
    public static void Check(ArrayList<String> substrings,byte n){
        for(String obj:substrings){
            String temp="";
            for(int i=0;i<obj.length();i++){
                if(temp.indexOf(obj.charAt(i))==-1)
                    temp=temp+obj.charAt(i);
            }
            if(temp.length()==n)
            {
                //System.out.println(obj);
                count++;
            }
            
        }
        System.out.println(count);
    }         
              
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> substrings=new ArrayList<String>();
         //System.out.println("Enter number of distinct coins:");
        byte distinct=sc.nextByte();
        sc.nextLine();
        //System.out.println("Enter the string:");
        String string=sc.nextLine();
       
        
        for(int i=0;i<=string.length();i++){
            for(int j=i+3;j<=string.length();j++)
            {
                substrings.add(string.substring(i,j));
            }
        }
        
        Check(substrings,distinct);
        
    }
}