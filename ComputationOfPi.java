//************************************************************
// Astrid Manuel
// 3354122
// COP3337
// Section U04
// Assignment#1
// Semptember 1,2016
// 
// I hereby certify that this collective work is my own 
// and none of it is the work of any other person or entity
//
//
//
//************************************************************ 

import java.lang.Math;

/**
		                Computation of Pi
	The purpose of this class is to provide a computation of pi
	with six significant figure accuracy using an infinite series 
	that calculates pi over four. This program will provide the 
	number of iterations that it took for the computation of pi, 
	the calculated value of pi and the library value of pi for
	comparison.
	Solves COP3337 Assignment 1

	To compile and run:
	javac ComputationOfPi.java
	java ComputationOfPi
*/

public class ComputationOfPi{
	
	public static void main(String[] args){
		
		getPi();
		
	}

	/**
		getPi method calculates pi over four using a given infinite series. 
		It then calculates pi by multiplying this value times four.
		@param accurate accuracy of the result calculated
		@param result sum of the infinite series that caculates for pi over four
		@param i counter in while loop that is used to calculate fraction
		@param fraction calculates the next term in the infinite series for calculation
		@return result calculation of pi over four which is multiplied times 4 to return pi
	*/
	
	public static double getPi() {
		
		boolean accurate = false;
		double result = 1;
		double i = 1;
		double fraction = 0;
		final double ACCURATE_FRACTION = 0.0000001;  //provides six significant figure accuracy
		final double MULTIPLIER = 4;  //multiplies pi over four result to obtain pi
		
		while(!accurate){
			
			fraction = 1/ ((i*2)+1);
			
			if(fraction < ACCURATE_FRACTION){
				accurate = true;
			} else if(i % 2 == 0){
				result += fraction;
			} else if(i % 2 == 1){
				result -= fraction;
			}
			
			i++;
			
		}
		
		System.out.println("Number of iterations: " + i);
		System.out.println("Calculated value of pi: " + result*4);
		System.out.println("Library value of pi: " + Math.PI);
		return result*MULTIPLIER;
		
	}
	
}
				

