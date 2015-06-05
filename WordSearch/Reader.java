package WordSearch;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

public class Reader {
	/**
	 * @param args [file name, word to search]
	 */
	public static void main(String[] args){
		/* Test each way of searching for string */
		File file = new File(args[0]);

		/* Checking each line */
		long startTime = System.nanoTime();
		try {
		    Scanner scanner = new Scanner(file);

		    //now read the file line by line...
		    int lineNum = 0;
		    while (scanner.hasNextLine()) {
		        String line = scanner.nextLine();
		        lineNum++;
		        if(line.toLowerCase().contains(args[1].toLowerCase()) && line.length() == args[1].length()) { 
		            System.out.println(lineNum + ": " + line);
		            break;
		        }
		    }
		} catch(FileNotFoundException e) { 
		    //handle this
		    System.err.println(e);
		}
		System.out.println("Time: " + (System.nanoTime() - startTime)/1000000 + "ms"); // in milliseconds

	}
}