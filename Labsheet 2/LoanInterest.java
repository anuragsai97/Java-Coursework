//package csd207_lab2;

import java.util.Scanner;

public class LoanInterest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);//calling scanner class
        System.out.println("Enter the amount of loan required: ");//asking the user for amount of loan
        int p=sc.nextInt();//scanning the amount of loan entered
        System.out.println("Enter the number of years: ");//asking the user for number of years to pay back the loan
        float years=sc.nextFloat();// scanning the number of years entered
        float t=years*12; //converting years to months
        System.out.println("Enter the Annual Rate of Interest: ");//asking the user for the annual rate of interest
        float i=sc.nextFloat();//scanning the annual rate of interest entered
        float roi=(i/(12*100)); //converting annual rate of interest to monthly rate of interest
        float mp=(float) ((float) (p*roi*(Math.pow(1+roi,t)))/(Math.pow(1+roi,t)-1)); //calculating monthly payment
        System.out.printf("The monthly payment is %.2f\n",mp);//for printing monthly payment
        float tp=mp*t; //calculating the total amount to be paid
        System.out.printf("The total payment of loan is %.2f\n",tp);//for printing total payment of loan
        float li=(mp*t)-p; //calculating the extra amount to be paid (i.e Loan Interest)
        System.out.printf("The total loan interest is %.2f\n",li);//for printing loan interest
    }
}