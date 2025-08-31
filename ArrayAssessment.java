public class ArrayAssessment {

    // Optional method for future use
    // public static boolean containsDuplicate(int nums[]){
    //     for(int i = 0; i < nums.length; i++){
    //         for(int j = i + 1; j < nums.length; j++){
    //             if (nums[i] == nums[j]) {
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }

    // Make this class static so it can be used from main
    public static class RotatedArraySearch {
        public int search(int[] nums, int target) {
            int left = 0, right = nums.length - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (nums[mid] == target) {
                    return mid;
                }

                // Left half is sorted
                if (nums[left] <= nums[mid]) {
                    if (nums[left] <= target && target < nums[mid]) {
                        right = mid - 1;
                    } else {
                        left = mid + 1;
                    }
                }
                // Right half is sorted
                else {
                    if (nums[mid] < target && target <= nums[right]) {
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                }
            }

            return -1; // Target not found
        }
    }

    

    public static void main(String[] args) {
        RotatedArraySearch sol = new RotatedArraySearch();
        int[] nums = {4, 5, 6, 7, 0, 1, 2};

        System.out.println(sol.search(nums, 0)); // Output: 4
        System.out.println(sol.search(nums, 3)); // Output: -1
        System.out.println(sol.search(new int[]{1}, 0)); // Output: -1

        // System.out.println(containsDuplicate(nums)); // Uncomment to use
    }
}
