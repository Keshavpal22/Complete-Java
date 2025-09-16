public class test {
    public static void changeArr(int arr[], int i, int val){
        // base case
        if (i == arr.length) {
            printArr(arr);
            return;
        }

        // recursion
        arr[i] = val;
        changeArr(arr, i + 1, val + 1);
        arr[i] = arr[i] - 2;
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void findPermutations(String str,String ans){
        //base case
        if(str.length() == 0){
            System.out.println(ans);
            return ;
        }
        // recursion
        for(int i=0;i<str.length();i++){
            char curr = str.charAt(i);
            String newStr = str.substring(0,i) + str.substring(i+1);
            findPermutations(newStr, ans + curr);
        }
    }

    public static boolean isSafe(char board[][], int row, int col){
        // vertical up
        for(int i=row-1;i>=0;i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        // diagonal left up
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        // diagonal right up
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }

    public static boolean nQueens(char board[][], int row){
        //base case
        if(row == board.length){
            // printBoard(board);
            count++;
            return true;
        }

        //recursion
        for(int j=0;j<board.length;j++){
            if(isSafe(board, row, j)){
                board[row][j] = 'Q';
                if (nQueens(board, row + 1)) {
                    return true;
                    
                }; // function call
                board[row][j] = '.'; // backtracking step
            }
           
        }
        return false;
    }

    public static void printBoard(char board[][]){
        System.out.println("-----Chess Board-----");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int count = 0;

    // ✅ main is inside the class now
    public static void main(String[] args) {
        int n=4;
        char board[][] = new char[n][n];
        //Initialize the board
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j] = '.';
            }
        }
        if (nQueens(board, 0)) {
            System.out.println("Solution is possible");
            printBoard(board);
        } else {
            System.out.println("Solution not possible");
        }
        // System.out.println("Total ways to solve N-Queens problem: " + count);
    }
}
