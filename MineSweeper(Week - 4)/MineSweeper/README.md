# MineSweeper Game

This Java program implements the classic game of Minesweeper. Players can uncover cells on a grid, and the goal is to reveal all cells without hitting a mine. The game provides feedback on the number of adjacent mines for each uncovered cell.

## Instructions

1. **Compile and Run:**
    - Compile the program using a Java compiler.
    - Run the compiled program.

2. **Game Initialization:**
    - Upon starting the game, the program initializes a game board with mines placed randomly. The number of mines is determined based on the size of the board.

3. **Gameplay:**
    - Players input row and column coordinates to uncover cells.
    - The game displays the current state of the board, indicating the number of adjacent mines for uncovered cells.
    - If a mine is uncovered, the game ends, and the player loses.
    - If all non-mine cells are uncovered, the player wins.

4. **Input Validation:**
    - The program validates user input to ensure it falls within the valid range of rows and columns.

5. **Feedback:**
    - The game provides feedback when a cell has already been selected or when the player hits a mine.

6. **End of Game:**
    - The game ends either when a mine is hit or when all non-mine cells are uncovered.
    - The final state of the board is displayed, and a corresponding message is shown based on the outcome.

## How to Play

1. Enter the row and column coordinates when prompted.
2. Avoid selecting cells with mines.
3. Use the feedback provided to strategics and uncover all non-mine cells.
4. If a mine is hit, the game ends. If all non-mine cells are uncovered, you win.

## Notes

- Adjust the size of the game board by providing appropriate values for `row` and `column` when creating an instance of the `MineSweeper` class.

- The program uses a random mine placement algorithm, ensuring a dynamic and unpredictable gaming experience.

- The game output is presented in the console, providing a text-based Minesweeper experience.

Enjoy playing Minesweeper!
