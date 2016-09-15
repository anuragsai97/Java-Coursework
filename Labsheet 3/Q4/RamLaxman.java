/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package csd207_lab3;

import java.util.Scanner;

/**
 *
 * @author ANURAG
 */
public class RamLaxman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        for(int i=0;i<test;i++){
            int p=sc.nextInt();
            int k=sc.nextInt();
            for(int j=1;j<=p;j++){
                System.out.print((k+1)*j+" ");
            }
            System.out.println("");
        }
    }
    
}
