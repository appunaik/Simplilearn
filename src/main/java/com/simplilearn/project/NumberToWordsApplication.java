package com.simplilearn.project;

import java.text.NumberFormat;
import java.util.Scanner;

public class NumberToWordsApplication {
	NumberToWords numberWords;
	
	public NumberToWordsApplication(){
		numberWords= new NumberToWords();
	}
	public void execute(){
		int n;		
		System.out.println("Enter only integers");
		Scanner sc = new Scanner(System.in);
		
		for(;;){
			
			if(!sc.hasNextInt()){				
				sc.next();
				continue;
			}
			n = sc.nextInt();
			if(n==0){
				System.out.println("You entered 0; exiting\n");
			}
			System.out.println(NumberFormat.getInstance().format(n) + "='" + numberWords.convert(n) + "'\n");
			System.out.println("Enter only integers");
		}
	}
	public static void main(final String[] args) {		
		new NumberToWordsApplication().execute();
	}
}
