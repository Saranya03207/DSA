class Solution {
    int[][] dp;

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        dp=new int[obstacleGrid.length][obstacleGrid[0].length];
        for(int i=0;i<obstacleGrid.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return solve(obstacleGrid,obstacleGrid.length-1,obstacleGrid[0].length-1);
    }
    public int solve(int[][] obstacleGrid,int i,int j){
        if(i<0||j<0){
            return 0;
        }
        if(obstacleGrid[i][j]==1){
            return 0;
        }
        if(i==0&&j==0){
            return 1;
        }
        
        if(dp[i][j]==-1){
            dp[i][j]=solve(obstacleGrid,i-1,j)+solve(obstacleGrid,i,j-1);
        }
        return dp[i][j];
    }
}