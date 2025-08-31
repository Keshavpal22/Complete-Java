public class test {
    public static void printDecreasing(int n) {
        if (n == 1) {
            System.out.println(1);
            return;
        }
        System.out.print(n + " ");
        printDecreasing(n - 1);
    }
    public static void printIncreasing(int n) {
        if (n == 1) {
            System.out.print(1);
            return;
        }
        printIncreasing(n - 1);
        System.out.print(" "+n);
        
    }

    public static int fact(int n){
        if (n == 0) {
            return 1;
        }
        return n * fact(n - 1);
    }

    public static int calcSum(int n){
        if (n == 1) {
            return 1;
        }
        int sn = calcSum(n-1);
        int s = n + sn;
        return s;
    }

    public static int fibonacci(int n){
        if (n == 0 || n==1) {
            return n;
        }
        int fibn_1 = fibonacci(n - 1);
        int fibn_2 = fibonacci(n - 2);
        int fib_n = fibn_1 + fibn_2;
        return fib_n;
    }

    public static boolean isSorted(int arr[], int i){
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSorted(arr, i + 1);
    }
    public static int firstOcc(int arr[], int key, int i){
        if(i ==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOcc(arr, key, i+1);
    }
    public static int lastOcc(int arr[], int key, int i){
        if (i==arr.length) {
            return -1;
        }
        int isFound = lastOcc(arr, key, i+1);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;
    }

    public static int power(int x, int n){
        if (n == 0) {
            return 1;
        }
        return x * power(x, n - 1);
    }

    public static int powerOptimized(int x, int n){
        if (n == 0) {
            return 1;
        }
        int halfPower = powerOptimized(x, n / 2);
        int halfPowerSq = halfPower * halfPower;

        if (n % 2 != 0) {
            halfPowerSq = x * halfPowerSq;
        }
        return halfPowerSq;
    }


    public static int  tilingProblem(int n){
        if (n == 0 || n == 1) {
            return 1;
        }
        return tilingProblem(n - 1) + tilingProblem(n - 2);
    }

    public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]){
        // base
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }
        // kaam
        char currChar = str.charAt(idx);
        if(map[currChar - 'a'] == true){
            removeDuplicates(str, idx + 1, newStr, map);
        }else{
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx + 1, newStr.append(currChar), map);
        }
    }

    public static int friendsPairing(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        return friendsPairing(n - 1) + (n - 1) * friendsPairing(n - 2);
    }


    public static void printBinStrings(int n, int lastPlace, String str) {
        if (n == 0) {
            System.out.println(str);
            return;
        }
        // if (lastPlace == 0) {
        //     printBinStrings(n - 1, 0, str.append("0"));
        //     printBinStrings(n - 1, 1, str.append("1"));
        // } else {
        //     printBinStrings(n - 1, 0, str.append("0"));
        // }
        printBinStrings(n-1, 0, str + "0");
        if (lastPlace == 0) {
            printBinStrings(n-1, 1, str + "1");
        }
    }

    

    public static void main(String[] args) {
        // printDecreasing(10);
        // printIncreasing(5);
        // System.out.println(fact(5));
        // System.out.println(calcSum(6));
        // System.out.println(fibonacci(6));
        // int arr[] = {1,2,4,3,4,7,6};
        // System.out.println(isSorted(arr, 0));
        // System.out.println(firstOcc(arr, 4, 0));
        // System.out.println(lastOcc(arr, 4, 0));
        // System.out.println(power(2, 10));
        // System.out.println(powerOptimized(2, 10));
        // System.out.println(tilingProblem(3));
        // String str = "appnnacollege";
        // boolean map[] = new boolean[26];
        // removeDuplicates(str, 0, new StringBuilder(""), map);
        // System.out.println(friendsPairing(3));
        printBinStrings(2, 0, "");
    }
}
