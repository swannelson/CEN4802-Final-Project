package square;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.*;

public class number {

	public static void main(String[] args) throws SecurityException, IOException {
			 int num = 70;
			 int result = squared(num);
			 System.out.println(result);
			 boolean isDivisible = false;
			 isDivisible = isDivisibleBy10(num);
			 System.out.println(isDivisible);
		
			 
			 
		}
	
	public static  int squared(int num) {
		return num * num;
	}
	
	public static boolean isDivisibleBy10(int num) {
		if(num % 10 == 0)
		{
			return true;
		}
		return false;
	}
}
		
	
	

