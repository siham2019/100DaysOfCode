class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0 || matrix[0].length == 0){
            return false;
        }
        int i,j,mid = 0;
        for(i=0, j=matrix.length-1; i<j;){
            mid = i + (j-i)/2;
            if(matrix[mid][0] == target){
                return true;
            }
            else if(matrix[mid][0] > target ){
                j = mid-1;
            }
            else {
                if(matrix[mid][matrix[mid].length-1]>=target){
                    i=mid;break;
                }
                else{
                    i = mid+1;
                }
            }
        }
        j=0;
        for(int k=matrix[i].length-1; j<=k; ){
            mid = j + (k-j)/2;
            if(matrix[i][mid] == target){
                return true;
            }
            else if(matrix[i][mid] > target){
                k = mid-1;
            }
            else {
                j = mid+1;
            }
        }
        
        return false;
    }
}
//https://leetcode.com/problems/search-a-2d-matrix/