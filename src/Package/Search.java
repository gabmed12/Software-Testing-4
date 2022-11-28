package Package;

import java.util.Scanner;
import java.io.*;

public class Search {

	public static void main(String[] args) throws FileNotFoundException {
		
		File file = new File(args[1]);
		
		Scanner scan = new Scanner(file);
		
		while (scan.hasNextLine()) {
			String nextLine = scan.nextLine();
			
			if (nextLine.contains(args[0])) {
				System.out.println(nextLine);
			}
	    }
		
		scan.close();
		
	}
	

}
