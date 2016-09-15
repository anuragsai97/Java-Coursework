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
public class Knockout {

    /**
     * @param args the command line arguments
     */
    public static int check(ArrayList<Integer> result,int better_player[][],int i){
        
            int l=result.get(i-1);
            int m=result.get(i);
            int z=better_player[m][l];
            if(z==1){
                result.remove(result.indexOf(l));
            }
            if(z==0){
                result.remove(result.indexOf(m));
            }
        
        if(result.size()!=1)
        {
        if(i>=result.size()){
            check(result,better_player,1);
        }
            else
             check(result,better_player,i+1);
        
        }
        return result.get(0);
        
    }
    public static void main(String[] args) {
        // TODO code application logic 
        Scanner sc=new Scanner(System.in);
        //System.out.println("Enter n: ");
        int n=sc.nextInt();
        
        int num=(int) Math.pow(2,n);
        
        ArrayList<Integer> result=new ArrayList<Integer>();
        for(int i=0;i<num;i++){
            result.add(i+1);
        }
        int l=num-1;
        int [][] better_player=new int[num+1][num+1];
        for(int i=2;i<num+1;i++){
            for(int j=1;j<=i-1;j++){
                int a=sc.nextInt();
                better_player[i][j]=a;
            }
        }
        
        int k=check(result,better_player,1);
        System.out.println(k);
    }
    
}
