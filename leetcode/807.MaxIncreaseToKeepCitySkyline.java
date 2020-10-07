class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int[][] r = new int[grid.length][2];
        for(int i=0;i<grid.length;i++){
            int rowMax = -1;
            int colMax = -1;
            for(int j=0;j<grid.length;j++){
                if(grid[i][j] > rowMax){
                    rowMax = grid[i][j];
                }
                if(grid[j][i] > colMax){
                    colMax = grid[j][i];
                }
            }
            r[i][0]=rowMax;
            r[i][1]=colMax;
        }
        int sum = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                if(r[i][0] <= r[j][1]){
                    sum+=(r[i][0]-grid[i][j]);
                }
                else{
                    sum+=(r[j][1]-grid[i][j]);
                }
            }
        }
        return sum;
    }
}
//https://leetcode.com/problems/max-increase-to-keep-city-skyline/submissions/