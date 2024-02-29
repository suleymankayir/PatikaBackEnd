import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MineSweeper { // Degerlendirme Formu 5
    public int row;
    public int column;

    MineSweeper(int row, int column) {
        this.row = row;
        this.column = column;
    }

    // Degerlendirme formu 6
    public void run() {

        // Create the game board arrays
        String[][] arr = new String[this.row][this.column];
        String[][] arr2 = new String[this.row][this.column];

        // Initialize touchedCount to keep track of the number of touched cells
        int touchedCount = 0;

        // Initialize the game board with empty cells
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.column; j++) {
                arr[i][j] = "-";
            }
        }
        // Copy the initial state of the game board to another array
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = new String[arr[i].length];
            System.arraycopy(arr[i], 0, arr2[i], 0, arr.length);
        }

        int mineNum = (this.row * this.column) / 4;
        int emptySpace = (this.row * this.column) - mineNum; //
        // Place mines randomly on the game board
        // Degerlendirme formu 8
        Random random = new Random();
        while (mineNum > 0) {
            int mineRow = random.nextInt(this.row - 1);
            int mineCol = random.nextInt(this.column - 1);
            // Check if the cell is not already a mine
            if (!arr[mineRow][mineCol].equals("*")) {
                arr[mineRow][mineCol] = "*";
                mineNum--;
            }

        }
        // Display the initial state of the game board with mines
        System.out.println("LOCATION OF MINES");
        for (int i = 0; i < this.row; i++) {
            String map = (Arrays.toString(arr[i]));
            map = map.replace(",", "");
            System.out.println(map);
        }

        // Start the game loop
        boolean gameOn = false;
        while (!gameOn) {

            System.out.println("================================================");
            // Display the current state of the visible game board for players
            // Degerlendirme formu 11
            for (int i = 0; i < arr2.length; i++) {
                String board = Arrays.toString(arr2[i]);
                board = board.replace(",", "");
                System.out.println(board);
            }
            // Get user input for row and column
            // Degerlendirme formu 9
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter row : ");
            int userRow = scanner.nextInt();
            System.out.print("Enter column : ");
            int userColumn = scanner.nextInt();

            // Validate user input
            // Degerlendirme formu 10
            if (userRow < 0 || userRow > this.row - 1) {
                System.out.println("Please enter a valid row!");
                continue;
            } else if (userColumn < 0 || userColumn > this.column - 1) {
                System.out.println("Please enter a valid column!");
                continue;
            }
            // Check if the selected cell is an empty cell
            if (arr[userRow][userColumn].equals("-") && arr2[userRow][userColumn].equals("-")) { //
                // Check adjacent cells for mines and update touchedCount
                // The first four are for the corners, and the rest are for the edges excluding the corners.
                if ((userRow == this.row - 1 && userColumn == 0)) {
                    for (int i = userRow - 1; i <= userRow; i++) {
                        for (int j = userColumn; j <= userColumn + 1; j++) {
                            if (!arr[userRow][userColumn].equals(arr[i][j])) {
                                touchedCount++;
                            }
                        }
                    }
                } else if ((userRow == 0 && userColumn == this.column - 1)) {
                    for (int i = userRow; i <= userRow + 1; i++) {
                        for (int j = userColumn - 1; j <= userColumn; j++) {
                            if (!arr[userRow][userColumn].equals(arr[i][j])) {
                                touchedCount++;
                            }
                        }
                    }
                } else if ((userRow == 0 && userColumn == 0)) {
                    for (int i = userRow; i <= userRow + 1; i++) {
                        for (int j = userColumn; j <= userColumn + 1; j++) {
                            if (!arr[userRow][userColumn].equals(arr[i][j])) {
                                touchedCount++;
                            }
                        }
                    }
                } else if ((userRow == row - 1 && userColumn == column - 1)) {
                    for (int i = userRow - 1; i <= userRow; i++) {
                        for (int j = userColumn - 1; j <= userColumn; j++) {
                            if (!arr[userRow][userColumn].equals(arr[i][j])) {
                                touchedCount++;
                            }
                        }
                    }
                } else if (userRow == 0) {
                    for (int i = userRow; i <= userRow + 1; i++) {
                        for (int j = userColumn - 1; j <= userColumn + 1; j++) {
                            if (!arr[userRow][userColumn].equals(arr[i][j])) {
                                touchedCount++;
                            }
                        }
                    }
                } else if (userRow == this.row - 1) {
                    for (int i = userRow - 1; i <= userRow; i++) {
                        for (int j = userColumn - 1; j <= userColumn + 1; j++) {
                            if (!arr[userRow][userColumn].equals(arr[i][j])) {
                                touchedCount++;

                            }
                        }
                    }
                } else if (userColumn == 0) {
                    for (int i = userRow - 1; i <= userRow + 1; i++) {
                        for (int j = userColumn; j <= userColumn + 1; j++) {
                            if (!arr[userRow][userColumn].equals(arr[i][j])) {
                                touchedCount++;
                            }
                        }
                    }
                } else if (userColumn == this.column - 1) {
                    for (int i = userRow - 1; i <= userRow; i++) {
                        for (int j = userColumn - 1; j <= userColumn; j++) {
                            if (!arr[userRow][userColumn].equals(arr[i][j])) {
                                touchedCount++;
                            }
                        }
                    }
                } else {
                    for (int i = userRow - 1; i <= userRow + 1; i++) {
                        for (int j = userColumn - 1; j <= userColumn + 1; j++) {
                            if (!arr[userRow][userColumn].equals(arr[i][j])) {
                                touchedCount++;

                            }
                        }
                    }
                }

            } else if ((arr[userRow][userColumn].equals("*"))) {
                // User clicked on a mine, end the game
                // Degerlendirme formu 13
                isMineSpotted();
                gameOn = true;
            } else if (!arr2[userRow][userColumn].equals("-")) {
                // User selected a cell that has already been chosen, provide feedback
                emptySpace--;
                System.out.println("Please select a different location.\n" +
                        "This location has already been selected.");
                continue;
            }

            // Update the visible game board with the touchedCount
            // Degerlendirme formu 12
            arr2[userRow][userColumn] = Integer.toString(touchedCount);
            emptySpace--;
            // degerlendirme formu 14
            if (emptySpace == 0) {
                // Display the final state of the game board
                for (int i = 0; i < arr2.length; i++) {
                    String board = Arrays.toString(arr2[i]);
                    board = board.replace(",", "");
                    System.out.println(board);
                }
                // Degerlendirme formu 15
                System.out.println("Tebrikler KAZANDINIZ");
                gameOn = true;
            }
            // Reset touchedCount for the next iteration
            touchedCount = 0;
        }

    }

    // Degerlendirme formu 6
    static void isMineSpotted() {
        // Inform the user that they hit a mine
        // Degerlendirme formu 15
        System.out.println("Game Over!!");

    }

}

