package com.revature.cordingChallenge2;

public class Palindrom {
	
public static void main(String args[]) {
	//make object from class Palindrom
	Palindrom testPalindrom= new Palindrom();
	//call method to check palindrom
	//testPalindrom.isPalindrom("madam");
}
//defind method with string variable
	public  boolean  isPalindrom(String word) {
	//defind local varibale for reverse word	
	String reverseWord = "";
	// use for loop to reverse word
	for(int i=word.length()-1;i>=0;i--) {
		reverseWord+=word.charAt(i);
	}
	boolean ispalendrum =true;
	//use for loop to compare word and reverse word
	for(int i=0;i<word.length();i++) {
	if(word.charAt(i)!=reverseWord.charAt(i)){
		ispalendrum=false;
	}
	return true;
}
	/*if(ispalendrum) {
		System.out.println("Palindrome");
	}
	else 
		System.out.println("not a Palindrome");
	}*/
}
}