//package csd207_lab2;

import java.util.Scanner;

class Denominations2 
{
    public static int counter=0;
    public static void main(String[] args)
    {
        int [] notes={5,10,20,50,100,500,1000};//the set of possible notes in indian currency
	int[] count = new int[notes.length];//declaring the count array
        Scanner sc=new Scanner(System.in);//calling scanner class
        System.out.println("Enter the amount to be denominated: ");//asking the user for the total amount to be denominated
        int amt=sc.nextInt();//scanning the amount entered
        if(amt%5!=0)//checking if amount given is a multiple of 5 and rounding of
        {
            if(amt%10<5) //checks if the the units place of the number has a digit from 1 to 4
            amt=amt-(amt%10);//rounds off the number to a 10 multiple encountered right before it
            else if(amt%10>5)//checks if the the units place of the number has a digit from 6 to 9
            amt=amt+(10-(amt%10));//rounds off the number to a 10 multiple encountered right after it
           
            System.out.println("Since the given number cannot be directly denominated it is rounded off to "+amt);
        }
	System.out.println("All possible denominations for "+amt+" rupees are: ");
	Combinations(notes, count, 0, amt);//the start is set to index 0
        System.out.println("The total number of possible denominations are: "+counter);
        //System.out.println(" "+counter);
    }
    
    public static void Combinations(int[] notes, int[] count, int start, int amount)
    {
        //notes are the set of notes possible in indian currency
        //count is used to record the number of notes for a particular note
        //start is used to decide from which note we start processing after choosing the first note
        //amount is the total amount left for processing
        if(start>=notes.length)//we have processed all notes
	{
            //to print the denominations
            for(int i=0; i<notes.length; i++)
            {
		System.out.print(""+count[i]+"*"+notes[i]+"+ "); 
            }
            //for new line
            System.out.print("\n");
            counter++;
            return;                        
	}
                
	if(start!=notes.length-1)
        {
            for(int i=0; i<=amount/notes[start]; i++)
            {
                count[start] = i;
                Combinations(notes, count, start+1, amount-notes[start]*i);
                //update the remaining amount
            }
        }        
        else
	{
            if(amount%notes[start]==0)
            {
                //assigning the count of notes at start
                count[start] = amount/notes[start];
                Combinations(notes, count, start+1, 0);
            }
        }
    }
}
