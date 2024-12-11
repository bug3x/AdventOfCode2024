package days;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Day3 {
//	public static boolean corruptOrNot(String[] list) {
//		int errorCount = 0;
//		int tolerance = 1;
//		for(int i = 1; i < list.length; i++) {
//			//check inverse
//			int el1= Integer.valueOf(list[i]);
//			int el0= Integer.valueOf(list[i-1]);
//			
//			if(el1 <= el0) {
//				return false;
//			}
//			if(el1 - el0 > 3 && (errorCount <= tolerance)) {
//				errorCount += 1;
//				return true;
//			}
//			else if(el1 - el0 > 3 && (errorCount > tolerance)) {
//				errorCount += 1;
//				return false;
//			}
//			
//		}
//		//no inverse output
//		return true;
//	}
	
	public static void main(String[] args) {
		
		
		File list = new File("day2input.txt");
		
		try {
			//
			Scanner scan = new Scanner(list);
			int count = 0;
			while(scan.hasNext()) {
				//grab one line
				String line = scan.nextLine();
				
				//split the line into string array
				String[] elements = line.split(" ");
				
			}
			System.out.println("Total safe...is " + count);
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
