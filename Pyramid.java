package com.revature.cordingChallenge2;

public class Pyramid
{

	public static void main(String args[])
	{
//create object from class pyramid
		Pyramid pyramid =new Pyramid();
		pyramid.drawPyramid(4);
	}
	//create method for draw pyramid
	public void drawPyramid(int n)
	{
                
//use nested for loop to create pyramid
		for(int i=0; i<n; i++)
		{

					
			for(int j=0; j<=i; j++)
			{
				
				System.out.print("* ");
			}

			
			System.out.println(); 
		}
}

	

}
