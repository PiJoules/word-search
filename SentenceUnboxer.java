import java.util.Scanner;

public class SentenceUnboxer {
	private char[][] matrix;

	public static void main(String[] args){
		/* Read from stdin */
		Scanner scan = new Scanner(System.in);
		String[] lineArgs = scan.nextLine().split("\\s+");
		int width = Integer.parseInt(lineArgs[0]);
		int initX = Integer.parseInt(lineArgs[1])-1; // Maze is indexed from 1, you say? Well, I index at 0.
		int initY = Integer.parseInt(lineArgs[2])-1;
		SentenceUnboxer su = new SentenceUnboxer();
		su.matrix = new char[width][width];
		for (int y = 0; y < width; y++){
			String[] elems = scan.nextLine().split("\\s+");
			for (int x = 0; x < width; x++){
				su.matrix[y][x] = elems[x].charAt(0);
			}
		}

		/* Have a traveler traverse the matrix */
		Direction initD = (initY == 0 ? Direction.DOWN : Direction.UP);
		Traveler neo = new Traveler(initX, initY, initD);
		/*
		while (did not accomplish goal){ // each iteration represents 1 turn
			// check for a certain condition to see if the traveler can move
			// let the example position be if the traveler can move another space
			Direction[] possibleDirections = new Direction[]; // all possible directions the traveler can move


			// some condition is met and the traveler can continue move
			traverler.moveTo(some direction); // from a list of possible directions
		}
		 */

		/* Check vals */
		for (char[] cArr : su.matrix){
			for (char c : cArr){
				System.out.print(c + " ");
			}
			System.out.println("");
		}
	}
}