class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int[][] dis={{0,1},{1,0},{-1,0},{0,-1}};
        int cnt=0;

        Queue<int[]> q=new LinkedList<>();

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                int max=0;
                if(grid[i][j]==1){
                    grid[i][j]=0;
                    max++;
                    q.offer(new int[]{i,j});
                    while(!q.isEmpty()){
                        int[] a=q.poll();

                        for(int k=0;k<4;k++){
                            int nr=a[0]+dis[k][0];
                            int nc=a[1]+dis[k][1];
                            if(nr>=0 &&nr<grid.length && nc>=0 && nc<grid[0].length && grid[nr][nc]==1){
                                grid[nr][nc]=0;
                                q.offer(new int[]{nr,nc});
                                max++;
                            }
                        }
                    }
                }
                cnt=Math.max(cnt,max);
            }
            
        }

        return cnt;
    }

}