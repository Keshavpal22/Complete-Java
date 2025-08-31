public class Practice2DArray {

    public static void sevenInArray(int matrix[][]) {
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 7) {
                    count++;
                }
            }
        }
        System.out.println("Count of 7 in the array: " + count);
    }

    public static int sumOfArray(int matrix[][]){
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }

    public static void Transpose(int matrix[][]) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // Swap elements
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int matrix[][] = {{4, 7, 8},
                          {8, 8, 7}};
                          
        // sevenInArray(matrix);
        int sum = sumOfArray(matrix);
        // System.out.println("Sum of all elements in the array: " + sum);
        Transpose(matrix);
        
    }
}
