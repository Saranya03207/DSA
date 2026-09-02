class Solution {
    public void swap(int[][] mat,int i,int j){
        int temp=mat[i][j];
        mat[i][j]=mat[j][i];
        mat[j][i]=temp;
    }

    public void reverse(int[][] mat,int row,int left,int right){
        int temp=mat[row][left];
        mat[row][left]=mat[row][right];
        mat[row][right]=temp;
    }
    public void rotate(int[][] matrix) {
        int n=matrix.length;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                swap(matrix,i,j);
            }
        }
        for(int i=0;i<n;i++){
            int left=0;
            int right=n-1;
            while(left<right){
                reverse(matrix,i,left,right);
                left++;
                right--;
            }
        }
        
        }
    }