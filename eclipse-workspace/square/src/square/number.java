package square;

import java.util.logging.*;
import java.io.IOException;

public class number {

	public static void main(String[] args) throws SecurityException, IOException {
		 	Log myLogger = new Log("log.txt");

			 int num = 65;
			 int result = squared(num);
			 System.out.println(result);
			 boolean isDivisible = false;
			 isDivisible = isDivisibleBy10(num);
			 System.out.println(isDivisible);
			 myLogger.logger.setLevel(Level.ALL);
			 myLogger.logger.info("Square of " + String.valueOf(num) 
			 + " is " + String.valueOf(result));
			 
			 myLogger.logger.warning("This is a warning");
			 myLogger.logger.severe("this is a severe message");
		
			 
			 
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
		
	
	

