import java.util.Scanner;

public class Strings {

    // public static void printLetters(String str) {
    //     for (int i = 0; i < str.length(); i++) {
    //         System.out.print(str.charAt(i) + " ");
    //     }
    //     System.out.println();
    // }


    // public static boolean isPalindrome(String str) {
    //     for (int i = 0; i < str.length() / 2; i++) {
    //         if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    // public static float getShortestPath(String path) {
    //     int x = 0, y = 0;
    //     for (int i = 0; i < path.length(); i++) {
    //         char dir = path.charAt(i);
    //         switch (dir) {
    //             case 'N':
    //                 y++;
    //                 break;
    //             case 'S':
    //                 y--;
    //                 break;
    //             case 'E':
    //                 x++;
    //                 break;
    //             case 'W':
    //                 x--;
    //                 break;
    //             default:
    //                 System.out.println("Invalid direction: " + dir);
    //         }
    //     }
    //     int x2 = x * x;
    //     int y2 = y * y;
    //     return (float)Math.sqrt(x2 + y2);
    // }

    // public static String subString(String str, int start, int end) {
    //     String subStr = "";
    //     for (int i = start; i < end; i++) {
    //         subStr += str.charAt(i);
    //     }
    //     return subStr;
    // }

    // public static String toUpperCase(String str) {
    //     StringBuilder sb = new StringBuilder();

    //     char ch = Character.toUpperCase(str.charAt(0));
    //     sb.append(ch);
    //     for (int i = 1; i < str.length(); i++) {
    //         if (str.charAt(i) == ' ' && i< str.length() - 1) {
    //             sb.append(str.charAt(i));
    //             i++; 
    //             sb.append(Character.toUpperCase(str.charAt(i)));
    //         } else {
    //             sb.append(str.charAt(i));
    //         }
    //     }
    //     return sb.toString();

    // }

    // public static String stringCompression(String str) {
    //     StringBuilder compressed = new StringBuilder();
    //     int count = 1;

    //     for (int i = 1; i < str.length(); i++) {
    //         if (str.charAt(i) == str.charAt(i - 1)) {
    //             count++;
    //         } else {
    //             compressed.append(str.charAt(i - 1)).append(count);
    //             count = 1;
    //         }
    //     }
    //     compressed.append(str.charAt(str.length() - 1)).append(count);

    //     return compressed.toString();
    // }


    // Practice
    // Count how many times lowercase vowels occured in a String entered by the user
    public static int countLowercaseVowels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        int vowelCount = countLowercaseVowels(input);
        System.out.println("Number of lowercase vowels: " + vowelCount);
        // String str = "hi, i am keshav pal";
        // System.out.println(toUpperCase(str));
        // String str = "abc";
        // System.out.println("Original String: " + str);
        // String compressedStr = stringCompression(str);
        // System.out.println("Compressed String: " + compressedStr);
        // String str = "nooon";
        // System.out.println("Is the string \"" + str + "\" a palindrome? " + isPalindrome(str));
        // String path = "WNEENESENNN";
        // System.out.println("Shortest path length for \"" + path + "\": " + getShortestPath(path));
        // String s1 = "new";
        // String s2 = "new";
        // String s3 = new String("new");
        // if (s1 == s2) {
        //     System.out.println("s1 and s2 are the same object in memory.");
        // } else {
        //     System.out.println("s1 and s2 are different objects in memory.");
        // }
        // if (s1 == s3) {
        //     System.out.println("s1 and s3 are the same object in memory.");
        // } else {
        //     System.out.println("s1 and s3 are different objects in memory.");
        // }
        

        // if (s2.equals(s3)) {
        //     System.out.println("s2 and s3 have the same content.");
        // } else {
        //     System.out.println("s2 and s3 have different content.");
            
        // }

        // String str = "helloworld";
        // System.out.println("Substring from index 2 to 5: " + subString(str, 2, 5));
        // System.out.println("Substring from index 0 to 5: " + str.substring(0, 5));


        // String fruits[] = {"apple", "banana", "mango"};

        // String largest = fruits[0];
        // for (int i = 1; i < fruits.length; i++) {
        //     if (largest.compareTo(fruits[i]) < 0) {
        //         largest = fruits[i];
        //     }
        // }
        // System.out.println(largest);

        // StringBuilder sb = new StringBuilder("");
        // for(char ch='a'; ch <= 'z'; ch++) {
        //     sb.append(ch);
        }
        // o(26)
        // o(n^2)
        // System.out.println(sb.length());

    // }

}