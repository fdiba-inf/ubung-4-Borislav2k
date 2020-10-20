package exercise4;


import java.util.Scanner;      
import java.util.Arrays; 

public class MaxElement { 
	public static void main(String[] args){ 
		double arr[] = {-7,8,1}; 
		double max = Arrays.stream(arr).max().getAsDouble(); 
		System.out.println("Largest array is " +max); 
	} 

} 

      
    


