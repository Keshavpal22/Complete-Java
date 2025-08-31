import java.net.Inet4Address;
import java.util.*;

public class BasicSorting {

    // Bubble Sort
    // public static void bubbleSort(Integer arr[]) {
    //     for (int turn = 0; turn < arr.length - 1; turn++) {
    //         for (int j = 0; j < arr.length - 1 - turn; j++) {
    //             if (arr[j] > arr[j + 1]) {
    //                 // Swap
    //                 int temp = arr[j];
    //                 arr[j] = arr[j + 1];
    //                 arr[j + 1] = temp;
    //             }
    //         }
    //     }
    // }

    // Selection Sort (Fixed to ascending order)
    // public static void selectionSort(Integer arr[]) {
    //     for (int i = 0; i < arr.length - 1; i++) {
    //         int minPos = i;
    //         for (int j = i + 1; j < arr.length; j++) {
    //             if (arr[minPos] > arr[j]) { // FIXED here
    //                 minPos = j;
    //             }
    //         }
    //         // Swap
    //         int temp = arr[minPos];
    //         arr[minPos] = arr[i];
    //         arr[i] = temp;
    //     }
    // }

    // Insertion Sort
    // public static void insertionSort(Integer arr[]) {
    //     for (int i = 1; i < arr.length; i++) { // FIX: i=1 (not 0)
    //         int curr = arr[i];
    //         int prev = i - 1;
    //         while (prev >= 0 && arr[prev] > curr) {
    //             arr[prev + 1] = arr[prev];
    //             prev--;
    //         }
    //         arr[prev + 1] = curr;
    //     }
    // }

    // Print Array
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void countingSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int[largest+1];
        for(int i=0; i<arr.length;i++){
            count[arr[i]]++;
        }

        int j=0;
        for(int i=0; i<count.length;i++){
            while (count[i]> 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    // Main Method
    public static void main(String[] args) {
        int arr[] = {1,4,1,3,2,4,3,7};

        // Call custom sorting method
        // bubbleSort(arr);       // Or: selectionSort(arr); or insertionSort(arr);
        countingSort(arr);
        printArr(arr);

    }
}
