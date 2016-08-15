//package csd207_lab2;

import java.util.Scanner;

public class Denominations {
    public static void main(String[] args) {
        int count=0;//initiating count to 0
        Scanner sc=new Scanner(System.in);//calling scanner class
        System.out.println("Enter the amount to be denominated: ");//asking the user for the total amount to be denominated
        int amt=sc.nextInt();//scanning the amount entered
        if(amt%5!=0)//checking if amount given is a multiple of 5 and rounding of
        {
           if(amt%10<5) //checks if the the units place of the number has a digit from 1 to 4
                amt=amt-(amt%10);//rounds off the number to a 10 multiple encountered right before it
           else if(amt%10>5)//checks if the the units place of the number has a digit from 6 to 9
                amt=amt+(10-(amt%10));//rounds off the number to a 10 multiple encountered right after it
           
           System.out.println("Since the given number cannot be directly denominated it is rounded off to "+amt+" and the denominations of it are: \n");
        }
        System.out.println("Note: The number of notes of possible denomintions are printed below\n");
        System.out.println("     5 | 10 | 20 | 50 | 100 | 500 | 1000");//Denominations
        System.out.println("---------------------------------------------");
        for(int a=0;a<=amt/5;a++) //for counting number of Rs 5 notes
            for(int b=0;b<=amt/10;b++) //for counting number of Rs 10 notes
                for(int c=0;c<=amt/20;c++) //for counting number of Rs 20 notes
                    for(int d=0;d<=amt/50;d++) //for counting number of Rs 50 notes
                        for(int e=0;e<=amt/100;e++) //for counting number of Rs 100 notes
                            for(int f=0;f<=amt/500;f++) //for counting number of Rs 500 notes
                                for(int g=0;g<=amt/1000;g++) //for counting number of Rs 1000 notes
                                    {
                                        if((5*a)+(10*b)+(20*c)+(50*d)+(100*e)+(500*f)+(1000*g)==amt)
                                        {
                                            System.out.print(count+1+")"+"   ");//for printing serial number
                                            System.out.println(a+" |  "+b+" |  "+c+" |  "+d+" |  "+e+"  |  "+f+"  |   "+g);
                                            //above line is for printing the number of notes of the possible denominations
                                            count++;//counting the number of possible denominations
                                        }
                                    }
            System.out.println("\nThe total number of combinations possible are "+count);//for printing the number of possible denominations
        }
}