package DivideConquer;

public class test {

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mergeSort(int arr[], int si, int ei){
        if (si >= ei) {
            return;
            
        }
        int mid = si + (ei - si) / 2;
        mergeSort(arr, si, mid); // left part
        mergeSort(arr, mid + 1, ei); // right part
        merge(arr,si,mid,ei);
    }





    private static void merge(int[] arr, int si, int mid, int ei) {
        int  temp[] = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        for (i = si, k = 0; i <= ei; i++, k++) {
            arr[i] = temp[k];
        }
    }

    public static void quickSort(int arr[], int si, int ei){
        if (si >= ei) {
            return;
        }
        int pIdx = partition(arr, si, ei);
        quickSort(arr, si, pIdx - 1); // left part
        quickSort(arr, pIdx + 1, ei); // right part
    }

    public static int partition(int[] arr, int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1;

        for (int j = si; j < ei; j++) {
            if (arr[j] < pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Swap arr[i + 1] and arr[ei] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[ei];
        arr[ei] = temp;

        return i + 1;
    }


    public static int search(int arr[], int tar, int si, int ei){
        if (si > ei) {
            return -1;  // Base case: element not found
        }
        // kaam
        int mid = si + (ei - si) / 2;

        // case 1
        if (arr[mid] == tar) {
            return mid;
            
        }
        // case 2
        if (arr[si] <= arr[mid]) {
            // Left half is sorted
            if (tar >= arr[si] && tar < arr[mid]) {
                return search(arr, tar, si, mid - 1);
            } else {
                return search(arr, tar, mid + 1, ei);
            }
        } else {
            // Right half is sorted
            if (tar > arr[mid] && tar <= arr[ei]) {
                return search(arr, tar, mid + 1, ei);
            } else {
                return search(arr, tar, si, mid - 1);
            }
        }
    }

    


    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int target = 6;
        int targInd = search(arr, target, 0, arr.length - 1);
        System.out.println(targInd);
        // mergeSort(arr, 0, arr.length - 1);
        // quickSort(arr, 0, arr.length - 1);
        // printArr(arr);
    }
}
