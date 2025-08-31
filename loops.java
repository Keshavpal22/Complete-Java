import java.util.Scanner;

public class loops {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int counter = 0;
        // while (counter < 100) {
        // System.out.println("Counter is: " + counter);
        // counter++;
        // }
        // int num = 1;
        // int n = sc.nextInt();
        // int sum = 0;
        // int i = 1;
        // while (num <= 1000) {
        // System.out.print(num + " ");
        // num++;

        // }
        // int n = sc.nextInt();
        // while (i <= n) {
        // // System.out.println(num + " ");
        // sum += i;
        // i++;
        // }
        // System.out.println("Sum of first " + n + " natural numbers is: " + sum);
        // for(int i=1; i<= 10; i++){
        // System.out.println(i);
        // }
        // int n = 4;
        // for (int i = 1; i <= n; i++) {
        // System.out.println("****");
        // }

        // int n = 10899;
        // while (n > 0) {
        // int digit = n % 10;
        // System.out.print(digit);
        // n /= 10; // Remove the last digit
        // }
        // System.out.println();
        // for(int i = n-1; i>= 0; i--){
        // System.out.println(i);
        // }
        // int rev = 0; // Variable to store the reversed number
        // while (n>0) {
        // int lastDigit = n % 10;
        // rev = (rev * 10) + lastDigit;
        // n /= 10; // Remove the last digit

        // }
        // System.out.println("Reversed number is: " + rev);

        // int counter = 1;
        // do{
        // System.out.println("Hello World " + counter);
        // counter++;
        // }while (counter <= 10);

        // do {
        // System.out.println("Enter your number : ");
        // int num = sc.nextInt();
        // if (num%10==0) {
        // break;
        // }
        // System.out.println(num);

        // } while (true);
        // for(int i=1; i <= 10; i++) {
        // if (i == 3) {
        // continue;
        // }
        // System.out.println(i);
        // }
        // do {
        // System.out.println("Enter numbers: ");
        // int num = sc.nextInt();
        // if (num % 10 == 0) {
        // continue;
        // }
        // System.out.println("number was : "+ num);
        // }while (true);

        // int n = sc.nextInt();

        // if (n == 2) {
        //     System.out.println("n is a prime number.");
        // } else {
        //     boolean isPrime = true;
        //     for (int i = 2; i <= Math.sqrt(n); i++) {
        //         if (n % i == 0) {
        //             isPrime = false;
        //         }
        //     }

        //     if (isPrime == true) {
        //         System.out.println(n + " is a prime number.");
        //     } else {
        //         System.out.println(n + " is not a prime number.");

        //     }
        // }
        int number;
        int choice;
        int evenSum = 0;
        int oddSum = 0;

        do {
            System.out.println("Enter a number (0 to exit): ");
            number = sc.nextInt();
            if (number == 0) {
                break;
            }
            if (number % 2 == 0) {
                evenSum += number;
            } else {
                oddSum += number;
            }
            System.out.println("Do you want to continue? (1 for Yes, 0 for No): ");
            choice = sc.nextInt();
        } while (choice == 1);

        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
        sc.close();
        



    }
}
