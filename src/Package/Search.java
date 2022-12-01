package Package;

import java.util.Scanner;
import java.io.*;

public class Search {

	public static void main(String[] args) throws FileNotFoundException {
		
		String word = args[1];
		String path = args[2];
		
		File file = new File(path);
		
		Scanner scan = new Scanner(file);
		
		while (scan.hasNextLine()) {
			String nextLine = scan.nextLine();
			
			if (nextLine.contains(word)) {
				System.out.println(nextLine);
			}
	    }
		
		scan.close();
		
	}
	

}
