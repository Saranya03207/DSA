class Solution {
    public int missingInteger(int[] nums) {
        List<Integer> num=new ArrayList<>();
        for(int n:nums){
            num.add(n);
        }
        int ans=nums[0];

        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]+1){
                ans+=nums[i];
            }else{
                break;
        }
        }
                        while(num.contains(ans)){
                    ans++;
                }
        return ans;
    }
}