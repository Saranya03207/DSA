class Solution {
    public int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE;
        int preValue=0;
        for(int i=0;i<nums.length;i++){
            preValue+=nums[i];

            if(preValue>max){
                max=preValue;
            }

            if(preValue<0){
                preValue=0;
            }
        }
        
        return max;
    }
}