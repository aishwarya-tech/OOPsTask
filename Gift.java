import java.util.Scanner;
import java.util.*;
import java.lang.*;


public class Gift {
	

	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		int choice;
		int flag=1;
		
		do
		{
			System.out.println("What do you want to do? ");
			System.out.println("1.Buy Gifts 2.Total weight 3.Sort Chocolates 4.Find Candies 5.Exit");
			choice = ss.nextInt();
			switch(choice)
			{
			case 1:
				Gift g = new Gift();
				g.ask();
				break;
				
			case 2:
				ChildGifts cg = new ChildGifts();
				cg.CalWeight();
				break;
				
			case 3:
				Chocolates c = new Chocolates();
				c.SortChoco();
				break;
				
			case 4:
				Sweets sw = new Sweets();
				sw.FindCandy();
				break;
				
			case 5:
				flag=0;
				break;
			}
		
		}while(flag>0);
		
		ss.close();
	}
	

	void ask()
	{
		
		int ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("What do you want to gift? 1.Chocolates 2.Sweets");
		ch = sc.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("Gifting Chocolates");
			ChildGifts cgc = new ChildGifts();
			cgc.takeChoco();
			break;
			
		case 2:
			System.out.println("Gifting Sweets");
			ChildGifts cgs = new ChildGifts();
			cgs.takeSweet();
			break;
		
		}
		sc.close();
	}
	
}

class ChildGifts{
	String Cadbury,Kitkat,Candies;
	String result;
	String[] arr = new String[50];
	int counter = 0;
	Scanner sc1 = new Scanner(System.in);
	
	void takeChoco()
	{
		System.out.println("What do you want: Cadbury, Kitkat, Candies");
		arr[counter]=sc1.nextLine();
		counter++;
		sc1.close();
	}
	
	String Ladoo,Barfi;
	String result1;
	Scanner sc2 = new Scanner(System.in);
	void takeSweet(){
		
		System.out.println("What do you want to gift: Ladoo, Barfi");
		result1 = sc2.nextLine();
		arr[counter]=result1;
		counter++;
		sc2.close();
	}
	
	void  CalWeight()
	{
		int sum = 0;
		int i=0;
		while(arr[i]!=null && i<arr.length)
		{
			sum++;
			i++;
		}
		System.out.println("The total weight is: "+ sum);
	}
	
	
}

class Chocolates extends ChildGifts{
	
	void SortChoco()
	{
		String[] sorted = new String[50];
		int j=0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]=="Chadbury" || arr[i]=="Kitkat" || arr[i]=="Candies")
			{
				sorted[j]=arr[i];
				j++;
			}
		}
		
		System.out.println("The sorted list is: ");
		for(j=0; j<sorted.length; j++)
		{
			System.out.println(sorted[j]);
		}
	}
	
	
}

class Sweets extends ChildGifts{
	
	void FindCandy()
	{
		int i;
		int candy=0;
		for(i=0; i<arr.length; i++)
		{
			if(arr[i]=="Candies" || arr[i]=="candies")
			{
				candy++;
			}
		}
		System.out.println("There are total " + candy + " Candies in the gift");
	}
	
}
