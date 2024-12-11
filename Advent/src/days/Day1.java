package days;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day1 {
	public static void main(String [] args) {
		ArrayList<Integer> ee = new ArrayList<Integer>();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		File list = new File("input.txt");
		
		try {
		
		//use scanner class to read file
			Scanner scan = new Scanner(list);

			int sum = 0;
			while(scan.hasNext()) {
				//elements in file are separated on white space and new line
				// System.out.println(scanner.nextInt());
				int first = scan.nextInt();
				int second = scan.nextInt();
				
				ee.add(first);
				arr.add(second);
				
			}
			
			while(ee.size() > 0) {
				int smallest = ee.get(0);
				int smallestIndex = 0;
				for(int i = 0; i<ee.size(); i++) {
					if(ee.get(i) < smallest) {
						smallest = ee.get(i);
						smallestIndex = i;
					}
				}
				
				int smallestR = arr.get(0);
				int smallestIndexR = 0;
				for(int j = 0; j<arr.size(); j++) {
					if(smallest > arr.get(j)) {
						smallestR = arr.get(j);
						smallestIndexR = j;
					}
				}
				arr.remove(smallestIndexR);
				ee.remove(smallestIndex);
				System.out.println("The difference is: " + Math.abs(smallestR - smallest));
				sum += Math.abs(smallestR - smallest);
			}
			System.out.println("The sum is: " + sum);
			
			//close the scanner
			scan.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
