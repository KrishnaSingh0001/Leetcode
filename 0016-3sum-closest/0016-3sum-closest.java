class Solution {
    public int threeSumClosest(int[] arr, int target) {
        int n = arr.length;
        int closestSum = arr[0] + arr[1] + arr[2]; // Initialize closestSum
        Arrays.sort(arr); // Sort the array for two-pointer technique
        for(int i = 0 ; i<n-2 ; i++){ // Change the loop condition
            int j = i + 1;
            int k = n - 1;
            while(j < k) { // Use two-pointer technique
                int sum = arr[i] + arr[j] + arr[k];
                if (Math.abs(target - closestSum) > Math.abs(target - sum)) {
                    closestSum = sum;
                }
                if (sum < target) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return closestSum;
    }
}