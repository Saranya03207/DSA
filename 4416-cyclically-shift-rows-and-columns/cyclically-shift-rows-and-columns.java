class Solution {
    public int[][] cyclicShift(int n, int[][] grid, int[] rowShift, int[] colShift) {
        
        for(int i=0;i<n;i++){
            for(int k=0;k<rowShift[i];k++){
                int temp=grid[i][0];
                for(int j=0;j<n-1;j++){
                    grid[i][j]=grid[i][j+1];
                }
                grid[i][n-1]=temp;
            }
        }

        for(int i=0;i<n;i++){
            for(int k=0;k<colShift[i];k++){
                int temp=grid[0][i];
                for(int j=0;j<n-1;j++){
                    grid[j][i]=grid[j+1][i];
                }
                grid[n-1][i]=temp;
            }
        }

        return grid;
    }
}