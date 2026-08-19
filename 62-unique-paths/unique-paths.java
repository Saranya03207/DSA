class Solution {
    int[][] dp;
    public int uniquePaths(int m, int n) {
        dp=new int[m+1][n+1];
        for(int i=0;i<=m;i++){
            Arrays.fill(dp[i],-1);
        }
        return solve(m,n);
    }
    public int solve(int m,int n){
          if(m==1||n==1){
            return 1;
        }
        if(dp[m][n]==-1){
            dp[m][n]=solve(m,n-1)+solve(m-1,n);
        }
        return dp[m][n];
    }
      
}