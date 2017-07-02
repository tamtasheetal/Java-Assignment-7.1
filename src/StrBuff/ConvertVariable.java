package StrBuff;

import java.util.*;      

public class ConvertVariable
{
	public static void main(String[] args)
	{
		int inputNumber;
		String convertedString;
		
		System.out.println("Enter the Integer that you want to convert into String :-");
		Scanner sc=new Scanner(System.in);
		
		inputNumber=sc.nextInt();      
//Initialized the int variable by user input.
		convertedString=String.valueOf(inputNumber);        
//Passing inputNumber in the valueOf function.
		
		System.out.println("int Variable Converted into String is :-"+convertedString);  
		sc.close();
		}    
}   
