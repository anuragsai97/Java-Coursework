//package csd207_lab2;

import java.util.Scanner;

public class SalesTax {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);//calling scanner class
      int count=1;//intiating count to 1
      float sum=0f;//intiating sum to 0
      System.out.println("Enter the number of items");//asking user for number of items
      short num=sc.nextShort(); //scanning the number of items
      for(short i=0;i<num;i++)//for taking the costs of the items
      {
          System.out.println("Enter the cost of item "+count+": ");//asking user for cost of each item
          float cost=sc.nextFloat();//scanning the cost
          sum+=cost;//adding the costs
          count++;//increasing count
      }
      
      System.out.println("Enter the tax percentage: ");//asking the user for the sales tax percentage
      float tax=sc.nextFloat();//scannning the sales tax percentage entered
      float st=(float) ((sum*tax)/100);//calculating the sales tax
      float tp=(float) (sum+st);//calculating the total price
      System.out.printf("The total base price is %.2f\n",sum);//printing the total base price
      System.out.printf("The sales tax is %.2f\n",st);//printing the sales tax
      System.out.printf("The total price is %.2f\n",tp);//printing the total price
    }
}