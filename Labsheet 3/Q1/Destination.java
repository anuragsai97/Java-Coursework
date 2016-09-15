/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csd207_lab3;

import static java.lang.System.console;
import java.util.Scanner;

/**
 *
 * @author ANURAG
 */
public class Destination {

    public static void main(String[] args) {
        int x=0;
        int y=0;
        Scanner sc=new Scanner(System.in);
        //System.out.println("Enter the directions: ");
        String d = sc.nextLine();
        for(int i=0;i<d.length();i++)
        {
            char a=d.charAt(i);
            if(a=='L')
                x=x-1;
            if(a=='R')
                x=x+1;
            if(a=='D')
                y=y-1;
            if(a=='T')
                y=y+1;
        }
        System.out.println(x+" "+y);
    }
    
}
