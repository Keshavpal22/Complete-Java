public class DiagonalSum {
    // public static int diagonalAdd(int matrix[][]) {
        // int sum = 0;
        // for(int i=0; i<matrix.length; i++){
        //     for(int j = 0; j<matrix[0].length;j++){
        //         if (i == j) {
        //             sum += matrix[i][j]; // primary diagonal
                    
        //         }
        //         else if (i + j == matrix.length - 1) {
        //             sum += matrix[i][j]; // secondary diagonal
                    
        //         }
        //     }
        // }


        // optimize code
    //     for (int i = 0; i < matrix.length; i++) {
    //         sum += matrix[i][i]; // primary diagonal
    //         if (i != matrix.length - 1 - i) { // avoid double counting the center element in odd-sized matrices
    //             sum += matrix[i][matrix.length - 1 - i]; // secondary diagonal
    //         }
    //     }


    //     return sum;

    // }

    public static boolean stairCaseSearch(int matrix[][], int key) {
        int row = 0;
        int col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.println("Key found at: (" + row + ", " + col + ")");
                return true; // Key found
            } else if (matrix[row][col] > key) {
                col--; // Move left
            } else {
                row++; // Move down
            }
        }
        System.out.println("Key not found");
        return false; // Key not found
    } 


    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3, 4},
                          {5, 6, 7, 8},
                          {9, 10, 11, 12},
                          {13, 14, 15, 16}};
        int key = 12;
        // int result = diagonalAdd(matrix);
        // System.out.println("Diagonal Sum: " + result);
        stairCaseSearch(matrix, key);

    }
}
