class Solution {
    public int circleRob(int[] nums,int low,int high){
        int prev1=0;
        int prev2=0;
        for(int i=low;i<high;i++){
            int curr=Math.max(prev2,prev1+nums[i]);
            prev1=prev2;
            prev2=curr;
        }
        return prev2;
    }
    public int rob(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        return Math.max(circleRob(nums,0,nums.length-1),circleRob(nums,1,nums.length));
    }
}