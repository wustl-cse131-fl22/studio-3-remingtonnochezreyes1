package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub

	Scanner in = new Scanner(System.in);
	
	System.out.println("Enter number you want to check for primes up to");
	int number = in.nextInt();
	
	boolean[] primeChecker = new boolean[number+1];
	
	for(int i = 2; i < primeChecker.length; i++)
	{
		primeChecker[i] = true;
	}	
		
	for(int i = 2; i < primeChecker.length; i++)
	{
		for(int j = i; j <= number/i; j++)
		{
			primeChecker[i*j] = false;
		}
	}
	
	
	for(int i = 2; i < primeChecker.length; i++)
	{
		if(primeChecker[i] == true)
		{
			System.out.println(i);
		}
	}
		
		
	}
	
	
	
	
	
	}

