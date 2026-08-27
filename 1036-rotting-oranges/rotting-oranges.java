class Solution {
    public int orangesRotting(int[][] grid) {
        int[][] d={{0,1},{1,0},{-1,0},{0,-1}};
        Queue<int[]> q=new LinkedList<>();
        int fresh=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2){
                    q.offer(new int[]{i,j});
                }if(grid[i][j]==1){
                    fresh++;
                }
            }
        }

        int time=0;
        while(!q.isEmpty() && fresh>0){
            int t=q.size();
            while(t-->0){
                int[] u=q.poll();
                for(int  k=0;k<4;k++){
                    int nr=u[0]+d[k][0];
                    int nc=u[1]+d[k][1];
                    if(nr>=0 && nr<grid.length && nc>=0 && nc<grid[0].length && grid[nr][nc]==1){
                        q.offer(new int[]{nr,nc});
                        grid[nr][nc]=2;
                        fresh--;
                        }
                }
            }
            time++;
        }
        if(fresh>0){
            return -1;
        }
        return time;
    }
}