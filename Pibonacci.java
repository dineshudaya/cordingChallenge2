package com.revature.cordingChallenge2;

public class Pibonacci {
public static void main(String args[]) {
	//make instance from class Pibonacci
Pibonacci p= new Pibonacci();
p.calculatePibonacci(10,1,3,5,8,15,34,6);
}
//define method with number array
public void calculatePibonacci(int...number) {
	//use for loop to go through all elements of array
	for(int j=0;j<number.length-1;j++) {
		//calculate two array elements next to each
	System.out.println(number[j]+number[j+1]);
	}
}
}