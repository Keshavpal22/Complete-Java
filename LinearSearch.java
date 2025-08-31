public class LinearSearch {


    // public static int linearSearch(int numbers[], int key) {
    //     // This function performs linear search on the array
    //     for (int i = 0; i < numbers.length; i++) {
    //         if (numbers[i] == key) {
    //             return i; // Return the index if key is found
    //         }
    //     }
    //     return -1; // Return -1 if key is not found
    // }

    // public static int LargestInArray(int numbers[]){
    //     int Largest = Integer.MIN_VALUE; // Initialize Largest to the smallest possible integer
    //     int Smallest = Integer.MAX_VALUE; // Initialize Smallest to the largest possible integer
    //     for (int i = 0; i < numbers.length; i++) {
    //         if (numbers[i] > Largest) {
    //             Largest = numbers[i]; // Update Largest if current number is greater
    //         }
    //         if (Smallest > numbers[i]) {
    //             Smallest = numbers[i]; // Update Smallest if current number is smaller
                
    //         }
    //     }
    //     System.out.println("Smallest number in the array is: " + Smallest);
    //     return Largest; // Return the largest number found in the array
    // }


    // public static int binarySearch(int numbers[], int key) {
    //     // This function performs binary search on the array
    //     int start = 0;
    //     int end = numbers.length - 1;

    //     while (start <= end) {
    //         int mid = start + (end - start) / 2; // Calculate mid index
    //         if (numbers[mid] == key) {
    //             return mid; // Return the index if key is found
    //         } else if (numbers[mid] < key) {
    //             start = mid + 1; // Search in the right half
    //         } else {
    //             end = mid - 1; // Search in the left half
    //         }
    //     }
    //     return -1; // Return -1 if key is not found
    // }

    // public static void ReverseArray(int numbers[]){
    //     int start = 0; // Initialize start index
    //     int end = numbers.length - 1; // Initialize end index
    //     while (start < end) {
    //         // Swap the elements at start and end indices
    //         int temp = numbers[start];
    //         numbers[start] = numbers[end];
    //         numbers[end] = temp;
    //         start++; // Move start index forward
    //         end--; // Move end index backward
    //     }
    // }


    // public static void printPairs(int numbers[]) {
    //     int tp = 0; // Initialize total pairs counter
    //     // This function prints all pairs of elements in the array
    //     for (int i = 0; i < numbers.length; i++) {
    //         for (int j = i + 1; j < numbers.length; j++) {
    //             System.out.print("(" + numbers[i] + ", " + numbers[j] + ") ");
    //             tp++; // Increment total pairs counter
    //         }
    //         System.out.println(); // Print a new line after each outer loop iteration
    //     }
    //     System.out.println("Total pairs: " + tp); // Print total pairs found
    // }
    



    // public static void maxSubArraySum(int numbers[]) {
    //     int currSum = 0;
    //     int maxSum = Integer.MIN_VALUE; // Initialize maxSum to the smallest possible integer
    //     int prefix[] = new int[numbers.length]; // Prefix sum array to store cumulative sums

    //     for(int i = 1; i < prefix.length; i++) {
    //         prefix[i] = prefix[i-1] + numbers[i]; // Initialize prefix array to zero
    //     }


    //     for (int start = 0; start < numbers.length; start++) {
    //         for (int end = start; end < numbers.length; end++) {
    //             currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
    //             // for (int k = start; k <= end; k++) {
    //             //     currSum += numbers[k]; // Calculate the sum of the current subarray                    
    //             // }

    //             if (maxSum < currSum) {
    //                 maxSum = currSum; // Update maxSum if current sum is greater
                    
    //             }
    //         }
    //     }
    //     System.out.println("Maximum subarray sum is: " + maxSum); // Print the maximum subarray sum
    // }

    public static void kadanes(int numbers[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for(int i=0;i<numbers.length; i++){
            cs += numbers[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("Max subarray sum is : "+ ms);
    }

    public static void main(String[] args) {
        int numbers[] = {-2,-3,4,-1,-2,1,5,-3}; // Initializing an array with even numbers
        // int key= 12;
        // int index = linearSearch(numbers, key);
        // if (index==-1) {
        //     System.out.println("Key not found");
        // } else {
        //     System.out.println("Key found at index: " + index);
            
        // }
        // System.out.println(linearSearch(numbers, key));        

        // System.out.println("Largest number in the array is: " + LargestInArray(numbers));
        // System.out.println("Binary Search "+ binarySearch(numbers, 12));


        // ReverseArray(numbers);
        // for (int i = 0; i < numbers.length; i++) {
        //     System.out.print(numbers[i] + " "); // Print the reversed array
        // }
        // printPairs(numbers);
        // System.out.println();
        // maxSubArraySum(numbers);
        kadanes(numbers);




        
    }
}
