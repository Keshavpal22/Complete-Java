import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();

        // if(a < 500000) {
        //     System.out.println("0% Tax");
        // } else if(a < 1000000 && a >= 500000) {
        //     System.out.println("20% Tax");
        // } else{
        //     System.out.println("30% Tax");
        // }
        // int a =1;
        // int b =36;
        // int c = 6;
        
        // if(a >= b && a >= c) {
        //     System.out.println("a is the greatest");
        // } else if(b >= c) {
        //     System.out.println("b is the greatest");
        // } else {
        //     System.out.println("c is the greatest");
        // }

        // boolean isLarger = (5>3)?true:false;
        // String type = (5%2==0)?"Even":"Odd";
        // System.out.println(type);
        // int marks = 45;
        // String report = (marks>=33)?"Pass":"Fail";
        // System.out.println(report);
        int number = sc.nextInt();
        // switch (number) {
        //     case 1:
        //         System.out.println("Monday");
        //         break;
        //     case 2:
        //         System.out.println("Tuesday");
        //         break;
        //     case 3:
        //         System.out.println("Wednesday");
        //         break;
        //     case 4:
        //         System.out.println("Thursday");
        //         break;
        //     case 5:
        //         System.out.println("Friday");
        //         break;
        //     case 6:
        //         System.out.println("Saturday");
        //         break;
        //     case 7:
        //         System.out.println("Sunday");
        //         break;
        //     default:
        //         System.out.println("Lund Day");
        // }

        if (number % 4==0) {
            if (number % 100 == 0) {
                if (number % 400 == 0) {
                    System.out.println("Leap Year");
                } else {
                    System.out.println("Not a Leap Year");
                }
            } else {
                System.out.println("Leap Year");
            }
        } else {
            System.out.println("Not a Leap Year");
            
        }
    }
}
