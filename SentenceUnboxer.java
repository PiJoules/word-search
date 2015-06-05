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
		while (did not accomplish goal && traveler.canReachGoal()){ // each iteration represents 1 turn
			// Check for a certain condition to see if the traveler can move.
			// Let the example position be if the traveler can move another space/
			Direction[] possibleDirections = traveler.getPossibleDirections(); // all possible directions the traveler can move

			// Some condition is met and the traveler can continue move.
			// In this case, the condition is if the traveler can move in a direction.
			if (possibleDirections.length > 0 && (maybe some other conditions defined by the map)){
				traverler.moveTo(some direction); // from a list of possible directions
			}
			else {
				// The traveler cannot move and must retrace his steps.
				// He will need to move back and remember not to move in the previous direction he made.
				traveler.moveBack();
			}
		}

		// Traveler.java
		// This class will traverse the maze on each turn, remembering where he went.
		// At the end of it, once a goal/condition is met, the previousDirections will
		// be the successful path taken from the starting to end point.
		public class Traveler {
			// A list of (bad) directions the traveler made in the previous turns.
			// If the traveler must retrace his steps, after moving back, he should ignore these directions.
			// Each nested array is the bad directions the traveler took that turn. These are ignored.
			// The lenght of badDirections is always greater than or equal to that of the previousDirections.
			private Direction[][] badDirections;

			// An array of all the previous directions the traveler took.
			// When the traveler moves on a new spot, the direction is added onto this,
			// but if it turns out the spot is bad, then he goes back to the previous spot
			// and the last element in this is removed and added to the list of bad directions
			// at that move.
			private Direction[] previousDirections;

			// An variable that must always be checked at each iteration to make sure the maze is
			// traversable to reach a goal.
			private boolean reachableGoal = true;

			public void moveTo(Direction d){
				// Move in a specific direction. Update the traveler's position.
				this.x = new x;
				this.y = new y;

				// Remember this position in case the traveler is unable to move in the next turn.
				this.previousDirections.add(d);

				// If the traveler just moved to this square, he does not know of any bad directions
				// and makes a new (empty) list of bad directions.
				// If he moves, then moves back to this square, do not make a new list since he already
				// has one for recording bad squares.
				if (badDirections.length < previousDirections.length){
					badDirections.add([]);
				}
			}

			public void moveBack(){
				if (previousDirections.size() > 0){
					// Remove the previous direction from the list.
					// After this point, the list of bad directions will be greater than 
					// the list of previous directions (by either 1 or 2, though if it is
					// 2, that means the traveler has just moved back and will be moving back
					// once more.)
					this.previousDirections.removeLast();

					// The list of bad directions should always be at most 1 greater than that
					// of the list of previous directions. If it is greater, cut off the last nested list
					// of bad directions from the parent list, badDirections.
					if (this.badDirections.size() - this.previousDirections.size() > 1){
						this.badDirections.removeLast();
					}

					// Add the last direction made to the list of the latest bad directions.
					this.badDirections.last().add(this.lastDirection);

					// Update the position.
					this.x = old x;
					this.y = old y;
				}
				else{
					// The traveler was either forced back to the starting point and cannot move further
					// or the traveler could not move at all to start with. In this case, the goal is not
					// reachable.
					this.canReachGoal = false;
				}
			}

			public Directions[] getPossibleDirections(){
				// Return the list of directions this traveler can make.
				// Do not include the ones in the latest list of badDirections.
				// Also do not include the last irection made.
				// This is calculated BEFORE the traveler makes his move.
				if (badDirections.size() > 0)
					return (calculatedListOfDirections)-badDirections.last()-previousDirections.last();
				else 
					return calculatedListOfDirections;
			}

			public boolean canReachGoal(){
				return this.reachableGoal;
			}
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