public class Pattern2 {


    // public static void hollow_rectangle(int totRows, int totCols){
    //     for(int i=1;i<=totRows;i++){
    //         for(int j=1;j<=totCols;j++){
    //             if(i==1 || i==totRows || j==1 || j==totCols){
    //                 System.out.print("* ");
    //             } else {
    //                 System.out.print("  ");
    //             }
    //         }
    //         System.out.println();

    //     }
    // }

    //    *
    //   **
    //  ***
    // ****

    // public static void half_pyramid(int n){
    //     for(int i=1;i<=n;i++){
    //         for(int j=1;j<=n-i;j++){
    //             System.out.print(" ");
    //         }
    //         for(int j=1;j<=i;j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }  
    // }

    // public static void half_pyramid_numbers(int n){
    //     for(int i=1;i<=n;i++){
    //         for(int j=1;j<=n-i+1;j++){
    //             System.out.print(j+" ");
    //         }
    //         System.out.println();
    //     }
    // }


    // 1
    // 2 3
    // 4 5 6
    // 7 8 9 10    
    // 11 12 13 14 15

    // public static void floyd_triangle(int n) {
    //     int count = 1;
    //     for(int i=1;i<=n;i++){
    //         for(int j=1;j<=i;j++){
    //             System.out.print(count + " ");
    //             count++;
    //         }
    //         System.out.println();
    //     }
    // }

    // 0-1 triangle
    // 1
    // 01
    // 101
    // 0101
    // 10101

    // public static void triangle_01(int n){
    //     for(int i=1;i<=n;i++){
    //         for(int j=1;j<=i;j++){
    //             if ((i+j)%2==0) {
    //                 System.out.print("1");    
    //             }else{
    //                 System.out.print("0");
    //             }

    //         }
    //         System.out.println();
    //         }
    //     }
    // }

    // Butterfly pattern
    // public static void butterfly(int n){
    //     // 1st half
    //     for(int i=1;i<=n;i++){
    //         for(int j=1;j<=i;j++){
    //             System.out.print("*");
    //         }
    //         for(int j=1;j<=2*(n-i);j++){
    //             System.out.print(" ");
    //         }
    //         for(int j=1;j<=i;j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    //     // 2nd half
    //     for(int i=n;i>=1;i--){
    //         for(int j=1;j<=i;j++){
    //             System.out.print("*");
    //         }
    //         for(int j=1;j<=2*(n-i);j++){
    //             System.out.print(" ");
    //         }
    //         for(int j=1;j<=i;j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }

    // public static void solid_rhombus(int n){
    //     for(int i=1;i<=n;i++){
    //         for(int j=1;j<=n-i;j++){
    //             System.out.print(" ");
    //         }
    //         for(int j=1;j<=n;j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }
    // public static void hollow_rhombus(int n){
    //     for(int i=1;i<=n;i++){
    //         for(int j=1;j<=n-i;j++){
    //             System.out.print(" ");
    //         }
    //         for(int j=1;j<=n;j++){
    //             if(i==1 || i==n || j==1 || j==n){
    //                 System.out.print("*");
    //             } else {
    //                 System.out.print(" ");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }

    public static void diamond(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {
        // hollow_rectangle(4, 5);
        // half_pyramid(10);
        // half_pyramid_numbers(5);
        // floyd_triangle(5);
        // triangle_01(5);

        // butterfly(5);
        // solid_rhombus(5);
        // hollow_rhombus(5);
        diamond(4);
        
    }
}