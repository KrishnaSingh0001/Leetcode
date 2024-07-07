import java.util.Arrays;
class Solution {
    public int[] sortArray(int[] arr) {
        // // int[] arr = { 5, -2, 23, 7, 87, -42, 509 };
        // // System.out.println("The original array is: ");
        // for (int num : arr) {
        //     System.out.print(num + " ");
        // }
        // Arrays.sort(arr);
        // System.out.println("\nThe sorted array is: ");
        // for (int num : arr) {
        //     System.out.print(num + " ");
        // }
        
        // int[] nums = {12, 11, 13, 5, 6, 7};

        // Sort the array using Arrays.sort()
        Arrays.sort(arr);

        // Print the sorted array
        System.out.println("Sorted array is");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        return arr;
    }
    
}