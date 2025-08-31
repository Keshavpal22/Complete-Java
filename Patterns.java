import java.beans.DefaultPersistenceDelegate;

public class Patterns {
    // *
    // **
    // ***
    // ****
    public static void main(String[] args) {
        // for (int i = 1; i <= 10; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // ****
        // ***
        // **
        // *
        // int n  = 5;
        // for(int i=1; i<=n;i++){
        //     for(int j=1; j<=n-i+1;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        // 1
        // 12
        // 123
        // 1234

        // int n = 5;
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }


        // A
        // BC
        // DEF
        // GHIJ
        // int n = 6;
        // char ch = 'A';
        // for(int i =1;i<=n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(ch);
        //         ch++;
        //     }
        //     System.out.println();
        // }

        // *****
        // *   *
        // *   *
        // *****

        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
