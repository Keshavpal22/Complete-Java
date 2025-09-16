public class sudokuClass {

    // Sudoku solver using backtracking
    public static boolean sudokuSolver(int sudoku[][], int row, int col) {
        // base case
        if (row == 9) {
            return true;
        }
        // next row
        if (col == 9) {
            return sudokuSolver(sudoku, row + 1, 0);
        }
        // skip the prefilled cells
        if (sudoku[row][col] != 0) {
            return sudokuSolver(sudoku, row, col + 1);
        }
        // filling the cell with possible options
        for (int digit = 1; digit <= 9; digit++) {
            if (isSafe(sudoku, row, col, digit)) {
                sudoku[row][col] = digit;
                if (sudokuSolver(sudoku, row, col + 1)) {
                    return true;
                }
                // backtracking
                sudoku[row][col] = 0;
            }
        }
        return false;
    }

    // Check if it's safe to place digit at sudoku[row][col]
    public static boolean isSafe(int sudoku[][], int row, int col, int digit) {
        // Check row
        for (int j = 0; j < 9; j++) {
            if (sudoku[row][j] == digit) {
                return false;
            }
        }

        // Check column
        for (int i = 0; i < 9; i++) {
            if (sudoku[i][col] == digit) {
                return false;
            }
        }

        // Check 3x3 grid
        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (sudoku[i][j] == digit) {
                    return false;
                }
            }
        }

        return true;
    }

    // Print Sudoku grid
    public static void printSudoku(int sudoku[][]) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Main method
    public static void main(String[] args) {
        int sudoku[][] = {
            {0, 0, 8, 0, 0, 0, 0, 0, 0},
            {4, 9, 0, 1, 5, 7, 0, 0, 2},
            {0, 0, 3, 0, 0, 4, 1, 9, 0},
            {1, 8, 5, 0, 6, 0, 0, 2, 0},
            {0, 0, 0, 0, 2, 0, 0, 6, 0},
            {9, 6, 0, 4, 0, 5, 3, 0, 0},
            {0, 3, 0, 0, 7, 2, 0, 0, 4},
            {0, 4, 9, 0, 3, 0, 0, 5, 7},
            {8, 2, 7, 0, 0, 9, 0, 1, 3}
        };

        if (sudokuSolver(sudoku, 0, 0)) {
            System.out.println("Solved Sudoku:");
            printSudoku(sudoku);
        } else {
            System.out.println("No solution exists.");
        }
    }
}
