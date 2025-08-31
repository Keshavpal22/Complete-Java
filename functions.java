import java.util.Scanner;

public class functions {
    // public static void printHelloWorld(){
    //     System.out.println("Hello World");
    //     System.out.println("Hello World");
    //     System.out.println("Hello World");
    // }
    // public static int calculateSum(int a, int b){  // formal parameters
    //     int sum = a + b;
    //     // System.out.println("Sum is: " + sum);
    //     return sum;
    // }

    // public static void swap(int a, int b) {
    //     int temp = a;
    //     a = b;
    //     b = temp;
    //     System.out.println("After swap: a = " + a + ", b = " + b);
    // }
    // public static int multiply(int a, int b) {
    //     int product = a * b;
    //     return product;
    // }

    // public static int factorial(int n) {
    //     int f = 1;

    //     for(int i=1;i<=n;i++){
    //         f = f * i;
    //     }
    //     return f;
    // }

    // public static int binCoeff(int n, int r){
    //     int fact_n = factorial(n);
    //     int fact_r = factorial(r);  
    //     int fact_n_r = factorial(n - r);
    //     int binCoeff = fact_n / (fact_r * fact_n_r);
    //     return binCoeff;
    // }

    // public static int sum(int a, int b) {
    //     return a + b;
    // }
    // public static int sum(int a, int b, int c) {
    //     return a + b + c;
    // }

    // public static float sum(float a, float b) {
    //     return a + b;
    // }

    public static boolean isPrime(int n) {
    //     // corner cases
    //     if(n==1 || n==0) {
    //         return false; 
    //     }


    //     if(n==2) {
    //         return true; 
    //     }

        // for(int i=2; i<=n-1; i++) {
        //     if(n % i == 0) {
        //         return false; 
        //     }
        // }
        // return true;
        for(int i=2; i<=Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false; 
            }
        }
        return true;

    }



    public static void primeInRange(int a){
        for(int i=2;i<=a;i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
        System.out.println();

    }

    public static void binToDec(int binNum){
        int myNum = binNum; // store the original number for printing later
        int pow = 0;
        int decNum = 0;

        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decNum += lastDigit * Math.pow(2, pow);
            pow++;
            binNum /= 10; // remove the last digit
            
        }
        System.out.println("decimal of " + myNum + " is: " + decNum);
    }

    public static void decToBin(int n){
        int pow = 0;
        int binNum = 0;
        while (n > 0) {
            int rem = n % 2;
            binNum += rem * Math.pow(10, pow);
            pow++;
            n /= 2; // remove the last digit
        }
        System.out.println("binary of " + n + " is: " + binNum);
    }

    public static void printS(){
        int s = 56;
    }

    public static void main(String[] args) {
        // printHelloWorld();
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = calculateSum(a, b); // arguments
        // System.out.println("Sum is: " + sum);


        // swap
        // int a = 5;
        // int b = 10;
        // System.out.println("Before swap: a = " + a + ", b = " + b);
        // swap(a, b);
        // System.out.println(a);
        // System.out.println(b);
        // int prod = multiply(a, b);
        // System.out.println("Product is: " + prod);
        // System.out.println(factorial(7));
        // System.out.println(binCoeff(5, 2));
        // System.out.println(sum(5, 10));
        // System.out.println(sum(5.9f, 10.8f));
        // System.out.println(sum(5, 10, 15));
        // System.out.println(isPrime(21)); // true
        // primeInRange(50);
        // binToDec(1111);
        // decToBin(24);
        // System.out.println(s);
        // int s = 45;
        // System.out.println(s);

        // {int s = 56;
        //     System.out.println(s);
        // }
        // System.out.println(s);
        // System.out.println(isPalindrome(12321));
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  an integer: ");
        int digits = sc.nextInt();
        System.out.println("The sum is "+ sumDigits(digits));
        
    }



    public static boolean isPalindrome(int n){
        int palindrome = n;
        int reverse = 0;

        while (palindrome != 0) {
            int rem = palindrome % 10;
            reverse = reverse * 10 + rem;
            palindrome /= 10; 
            
        }
        return reverse == n;
    }

    public static int sumDigits(int n) {
    int sumOfDigits = 0;
    while (n > 0) {
        int lastDigit = n % 10;
        sumOfDigits += lastDigit;
        n /= 10;
    }
    return sumOfDigits;
}


    
}
