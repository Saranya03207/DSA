class Solution {
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int[][] d={{0,1},{1,0},{-1,0},{0,-1}};
        int cnt=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1'){
                    cnt++;
                    Queue<int[]> q=new LinkedList<>();
                      q.offer(new int[]{i,j});
                      while(!q.isEmpty()){
                        int[] u=q.poll();
                        for(int k=0;k<4;k++){
                            int nr=u[0]+d[k][0];
                            int nc=u[1]+d[k][1];
                            if(nr>=0 && nr<n && nc>=0 && nc<m && grid[nr][nc]=='1'){
                                q.offer(new int[]{nr,nc});
                                grid[nr][nc]=0;
                            }
                        }
                      }
                }
            }
        }
        return cnt; 
    }
}