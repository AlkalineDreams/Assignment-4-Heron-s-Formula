/****************************************************************************
 *
 * Created by: Craig
 * Created on: Oct 2016
 * This program calculates the area and type of a triangle.
 * 
 ****************************************************************************/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StubProgram {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Let's start by creating a triangle.");
		
		double sideA = 0;
		double sideB = 0;
		double sideC = 0;
		
		InputStreamReader r = new InputStreamReader(System.in);
	    BufferedReader br = new BufferedReader(r);
		
		System.out.println("Enter a length for side A:");
		sideA = CreateSide(br.readLine());
		
		System.out.println("Enter a length for side B:");
		sideB = CreateSide(br.readLine());
		
		System.out.println("Enter a length for side C:");
		sideC = CreateSide(br.readLine());

		Triangle triangle = new Triangle(sideA, sideB, sideC);
		
		boolean valid = triangle.IsTriangleValid();
		
		if (valid == true){
			
			System.out.println("New Valid triangle has been created. Its area, according to Heron's formula, is " + triangle.GetArea() + " and it is a(n) " + triangle.GetName() + " triangle.");
			
		} else {
			
			System.out.println("I'm not even sure how you could ever end up here. Your triangle is invalid.");
			
		}

	}
	
	public static double CreateSide(String side) throws NumberFormatException, IOException {
		
		//so somehow i came to the conclusion
		//that recursion was the fastest way to make sure the user didn't mess up
		//anyway even if it isn't the LEAST wordy method, it's still good recursion practice!
		
		//initialize new input stream because this function can't use the old one
		InputStreamReader r2 = new InputStreamReader(System.in);
	    BufferedReader br2 = new BufferedReader(r2);
		
		boolean valid = false; //will be set to true once the user enters a valid number
		double sideLength = 0; //the user's input as a double
		
		try {
			
			sideLength = Double.parseDouble(side);
			
		} catch (NumberFormatException e){
			
			System.out.println("Invalid input. Please enter a valid number greater than 0:");
			sideLength = CreateSide(br2.readLine());
			
		}
		
		while(valid == false){
			
			if (sideLength > 0){
				
				valid = true;
				
			} else {
				
				System.out.println("Invalid input. Please enter a valid number greater than 0:");
				sideLength = CreateSide(br2.readLine());
				
			}
			
		}
		
		return sideLength;
		
	}

}
