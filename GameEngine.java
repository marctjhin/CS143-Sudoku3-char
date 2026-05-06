public class GameEngine
{
	public static void main(String[] args)
	{
		SudokuBoard game = new SudokuBoard("very-fast-solve.sdk");
		System.out.println("Is valid: " + game.isValid());
		System.out.println("Is solved: " + game.isSolved());
		System.out.println(game);

		// Invalid board
        if (!game.isValid()) {
			System.out.println();
            System.out.println("Board is invalid and cannot be solved.");
        }

        // solved board
        else if (game.isSolved()) {
			System.out.println();
            System.out.println("Board is already solved.");
        }

        // try to solve
        else {
			System.out.println();
			System.out.println("Solving the board...");

            if (game.solve()) {
                System.out.println("Solved!");
				System.out.println();
                System.out.println(game);
            } else {
                System.out.println("There is no solution.");
            }

	}
}

/*
# PROGRAM OUTPUT
Is valid: true
Is solved: false
 2 | - | - | 1 | - | 5 | - | - | 3
–––|–––|–––|–––|–––|–––|–––|–––|–––
 - | 5 | 4 | - | - | - | 7 | 1 | -
–––|–––|–––|–––|–––|–––|–––|–––|–––
 - | 1 | - | 2 | - | 3 | - | 8 | -
–––|–––|–––|–––|–––|–––|–––|–––|–––
 6 | - | 2 | 8 | - | 7 | 3 | - | 4
–––|–––|–––|–––|–––|–––|–––|–––|–––
 - | - | - | - | - | - | - | - | -
–––|–––|–––|–––|–––|–––|–––|–––|–––
 1 | - | 5 | 3 | - | 9 | 8 | - | 6
–––|–––|–––|–––|–––|–––|–––|–––|–––
 - | 2 | - | 7 | - | 1 | - | 6 | -
–––|–––|–––|–––|–––|–––|–––|–––|–––
 - | 8 | 1 | - | - | - | 2 | 4 | -
–––|–––|–––|–––|–––|–––|–––|–––|–––
 7 | - | - | 4 | - | 2 | - | - | 1
*/

/*
program #3 OUTPUT
----jGRASP exec: java -ea GameEngine
Initial Board:
 - | 3 | 4 | 6 | 7 | 8 | 9 | 1 | 2
–––|–––|–––|–––|–––|–––|–––|–––|–––
 - | 7 | 2 | 1 | 9 | 5 | 3 | 4 | 8
–––|–––|–––|–––|–––|–––|–––|–––|–––
 1 | 9 | 8 | 3 | 4 | 2 | 5 | 6 | 7
–––|–––|–––|–––|–––|–––|–––|–––|–––
 - | - | 9 | - | 6 | 1 | 4 | 2 | 3
–––|–––|–––|–––|–––|–––|–––|–––|–––
 - | 2 | 6 | 8 | 5 | 3 | 7 | 9 | 1
–––|–––|–––|–––|–––|–––|–––|–––|–––
 - | 1 | 3 | 9 | 2 | 4 | - | 5 | 6
–––|–––|–––|–––|–––|–––|–––|–––|–––
 - | 6 | 1 | 5 | 3 | 7 | 2 | 8 | 4
–––|–––|–––|–––|–––|–––|–––|–––|–––
 - | 8 | - | 4 | 1 | 9 | 6 | 3 | 5
–––|–––|–––|–––|–––|–––|–––|–––|–––
 3 | 4 | 5 | - | 8 | 6 | 1 | 7 | 9

Solving board...
Solved!

 5 | 3 | 4 | 6 | 7 | 8 | 9 | 1 | 2
–––|–––|–––|–––|–––|–––|–––|–––|–––
 6 | 7 | 2 | 1 | 9 | 5 | 3 | 4 | 8
–––|–––|–––|–––|–––|–––|–––|–––|–––
 1 | 9 | 8 | 3 | 4 | 2 | 5 | 6 | 7
–––|–––|–––|–––|–––|–––|–––|–––|–––
 8 | 5 | 9 | 7 | 6 | 1 | 4 | 2 | 3
–––|–––|–––|–––|–––|–––|–––|–––|–––
 4 | 2 | 6 | 8 | 5 | 3 | 7 | 9 | 1
–––|–––|–––|–––|–––|–––|–––|–––|–––
 7 | 1 | 3 | 9 | 2 | 4 | 8 | 5 | 6
–––|–––|–––|–––|–––|–––|–––|–––|–––
 9 | 6 | 1 | 5 | 3 | 7 | 2 | 8 | 4
–––|–––|–––|–––|–––|–––|–––|–––|–––
 2 | 8 | 7 | 4 | 1 | 9 | 6 | 3 | 5
–––|–––|–––|–––|–––|–––|–––|–––|–––
 3 | 4 | 5 | 2 | 8 | 6 | 1 | 7 | 9

 ----jGRASP: Operation complete
*/
