class Solution {
    public void sortColors(int[] arr) {
        // int arr[] = {0,1,2,0,1,2,1,2,0,0};
        int n  = arr.length;
        int mid = 0 ;
        int hi = n-1 ; 
        int lo = 0;

        while(mid<=hi){
            if(arr[mid] ==0){
                int temp = arr[mid];
                arr[mid]=arr[lo];
                arr[lo]= temp;
                lo++;
                mid++;

            }

            else if (arr[mid]==1){
                mid ++;
            }
            else{
                int temp = arr[mid];
                arr[mid]=arr[hi];
                arr[hi]=temp;
                hi--;
            }
        }
        for(int i = 0 ; i<n ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        
    }
}