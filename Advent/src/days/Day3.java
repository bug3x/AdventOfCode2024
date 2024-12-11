package days;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Day3 {

	public static void main(String[] args) {
		 String corruptedMemory = "xmul(2,4)%&mul[3,7]!@^do_not_mul(5,5)+mul(32,64]then(mul(11,8)mul(8,5))";
	        
	        // Call the function to calculate the sum of the multiplications
	        int result = sumMultiplications(corruptedMemory);
	        
	        // Print the result
	        System.out.println(result);
	}
	
	   public static int sumMultiplications(String corruptedMemory) {
	        // Regular expression to match valid mul(X,Y) instructions
	        String regex = "mul\\((\\d{1,3}),(\\d{1,3})\\)";
	        Pattern pattern = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(corruptedMemory);

	        int totalSum = 0;

	        // Find all valid mul(X,Y) instructions
	        while (matcher.find()) {
	            // Extract the numbers X and Y
	            int x = Integer.parseInt(matcher.group(1));
	            int y = Integer.parseInt(matcher.group(2));

	            // Multiply them and add the result to the total sum
	            totalSum += x * y;
	        }

	        return totalSum;
	    }
}
