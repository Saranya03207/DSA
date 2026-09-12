class Solution {

     public boolean isPrime(int n){

        if(n<=1){
            return false;
        }

        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
     }
    public int diagonalPrime(int[][] nums) {
        int maxPrime=0;
        int n=nums.length-1;
        for(int i=0;i<=n;i++){
            if(isPrime(nums[i][i]) && maxPrime<nums[i][i]){
                maxPrime=nums[i][i];
            }
            if(isPrime(nums[i][n-i]) && maxPrime<nums[i][n-i]){
                maxPrime=nums[i][n-i];
            }
        }

        return maxPrime;
    }
}