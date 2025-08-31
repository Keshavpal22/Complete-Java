package BitManipulation;




public class BitMani {
    public static void oddEven(int n){
    int bitMask = 1;
    if((n & bitMask) == 0){
        System.out.println("Even");
    }else{
        System.out.println("Odd");
    }
}

public static int getIthBit(int n, int i) {
    int bitMask = 1 << i;
    if ((n & bitMask) == 0) {
        return 0; // ith bit is not set
    } else {
        return 1; // ith bit is set
        
    }


}
    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask; // Set the ith bit
    }

    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask; // Clear the ith bit
    }

    public static int updateIthBit(int n, int i, int newBit){
        if (newBit == 0) {
            return clearIthBit(n, i);
        } else {
            return setIthBit(n, i);
        }
    }

     public static int clearIthBits(int n, int i){
        int bitMask = (~0) << i;
        return n & bitMask;
     }
     public static int clearIthBitsInRange(int n, int i, int j){
        int a = ((~0)<<(j+1));
        int b = (1<<i)-1;
        int bitMask = a|b;
        return n & bitMask;
    }
    public static boolean isPowerOfTwo(int n){
        return (n & (n - 1)) == 0;
    }


    public static void main(String[] args) {
        // System.out.println(5 & 6);
        // System.out.println(5 | 6);
        // System.out.println(5 ^ 6);
        // System.out.println(~0);
        // System.out.println(5 << 2); // Left shift
        // System.out.println(6 >> 2); // Right shift 
        // oddEven(16);
        // System.out.println(getIthBit(10, 2));
        // System.out.println(setIthBit(10, 2));
        // System.out.println(clearIthBit(10, 1));
        // System.out.println(updateIthBit(10, 2, 1));
        // System.out.println(clearIthBits(15, 2));
        // System.out.println(clearIthBitsInRange(10, 2, 4));
        System.out.println(isPowerOfTwo(16));
        System.out.println(isPowerOfTwo(18));

    }
    
}
