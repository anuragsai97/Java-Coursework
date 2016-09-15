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
public class ParcelPassing {

    /**
     * @param args the command line arguments
     */
    public static int check(ArrayList<Integer> students,String lyrics,int i,int j){
        if(i>=students.size())
            {
                i=0;
            }
            if(j>=lyrics.length())
            {
                j=0;
            }
            if(lyrics.charAt(j)=='b')
            {
                students.remove(i);
                i=i-1;
            }
        if(students.size()!=1)
            check(students,lyrics,i+1,j+1);
        return (students.get(0));
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        //System.out.println("Enter the number of Students:");
        int n=sc.nextInt();
        ArrayList<Integer> students=new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {
            students.add(i+1);
        }
        //System.out.println("Enter lyrics:");
        String lyrics=sc.next();
       int k=check(students,lyrics,0,0);
        System.out.println(k);       

    }
    
}
