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

    public static void main(String[] args) {
        // int arr[] = {1,2,3,4,5};
        // arr = new int[]{ 1, 2, 3, 4, 5 }; // [1,2,3,4,5]
        // changeArr(arr, 0, 1);
        // printArr(arr);
        String str = "abcd";
        findPermutations(str, "");
    }
}
