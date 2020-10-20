package exercise4;


import java.util.Scanner;      
import java.util.Arrays; 

public class MinIndex { 
public static void main(String[] args){ 
int a[] = new int[]{-8,2,7};

	       int min = a[0];
	       int index = 0;

	       for(int i = 0; i < a.length; i++)
	       {
	            if(min > a[i])
	            {
	                min = a[i];
	                index=i;
	            }
	        }

	        System.out.println("smallest index is"+index);
	}
	
}

} 

      
    


