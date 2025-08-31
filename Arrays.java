import java.util.Scanner;

public class Arrays {

    public static void Update(int marks[]) {
        // This function updates the marks of students
        // Assuming we want to update the first three students' marks
        // Scanner sc = new Scanner(System.in);
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1; // Adding 10 to each student's marks
        }
    }

    public static void main(String[] args) {
        int marks[] = {97,98,99}; // Initializing an array with marks of 3 students
        // Scanner sc = new Scanner(System.in);
        // marks[0] = sc.nextInt();
        // marks[1] = sc.nextInt();
        // marks[2] = sc.nextInt();
        Update(marks); // Calling the Update function to update marks
        // System.out.println("length of array: " + marks.length);
        // System.out.println("Marks of student 1: " + marks[0]);
        // System.out.println("Marks of student 2: " + marks[1]);
        // System.out.println("Marks of student 3: " + marks[2]);
        // marks[0] = 100; // Updating the marks of student 1
        // System.out.println("Updated marks of student 1: " + marks[0]);

        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i]+ " ");
        }
        System.out.println();


    }
    
}
