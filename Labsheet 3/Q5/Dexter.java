/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csd207_lab3;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ANURAG
 */

public class Dexter {
     /**
     * @param args the command line arguments
     */
    
    public static int Voltages(int n,int m){
        int combinations=0;
        if(n<=m){
            for(int i=n;i<=m;i++){
                if(Prime(i))
                    combinations++;
            }
            combinations=(m-n)+1-combinations;
        }
        return combinations;
    }

   public static boolean Prime(int n) {
    for(int i=2;i<n;i++) {
        if(n%i==0)
            return false;
    }
    return true;
}
   
   public static int[] sort_decreasing(int [] vol,int n){
       for(int i=0;i<n;i++){
                for(int j=0;j<n-1;j++){
                    if(vol[j]<vol[j+1]){
                        int temp=vol[j];
                        vol[j]=vol[j+1];
                        vol[j+1]=temp;
                    }
                }
            }
       return vol;
   }


    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int tests=sc.nextInt();
        for(int t=0;t<tests;t++){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int vol[]=new int[n];
            for(int i=0;i<n;i++){
                vol[i]=sc.nextInt();
            }
            Arrays.sort(vol);
            int []vol2=sort_decreasing(vol,n);


            int possibilities[]=new int[n];
            possibilities[0]=Voltages(vol2[0], m);

            for(int i=1;i<n;i++){
                possibilities[i]=possibilities[i-1]+Voltages(vol2[i],vol2[i-1]-1);
            }


            int combinations=1;
            for(int i=0;i<n;i++){
                combinations*=possibilities[i];
                for(int j=i+1;j<n;j++){
                    possibilities[j]--;
                }
            }

            System.out.println(combinations);
        }
    }

}