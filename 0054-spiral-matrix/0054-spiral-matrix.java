class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        // int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        
        int m = arr.length;
        int n = arr[0].length;

        // spiral print 
        List<Integer> ans = new ArrayList<>();        
        int minr=0,  maxr=m-1;
        int minc=0, maxc=n-1;
        while(minr<=maxr && minc<=maxc){
            // left to right 
            for(int j = minc ; j<=maxc ; j++ ){
                ans.add(arr[minr][j]);
            }
            minr++;
            if(minr>maxr || minc>maxc) break;
            // top to bottom
            for(int i = minr ; i<=maxr ; i++){
                ans.add(arr[i][maxc]);
            }
            maxc--;

            // right to left
            if(minr>maxr || minc>maxc) break;
            for(int j = maxc ; j>=minc ; j-- ){
                ans.add(arr[maxr][j]);
            }
            maxr--;
            if(minr>maxr || minc>maxc) break;
            // bottom to top
            for(int i = maxr ; i>=minr ; i--){
                ans.add(arr[i][minc]);
            }
            minc++;
        }
    return ans;
    }

}