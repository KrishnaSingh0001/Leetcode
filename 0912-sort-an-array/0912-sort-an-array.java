import java.util.Arrays;
class Solution {
    public int[] sortArray(int[] arr) {
        Arrays.sort(arr);
        System.out.println("Sorted array is");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        return arr;
    }
    
}