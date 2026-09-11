class Solution {
    public int[] twoSum(int[] nums, int target) {
        
       HashMap<Integer,Integer> hm=new HashMap<>();
       for(int i=0;i<nums.length;i++){
        int bal=target-nums[i];
        if(hm.containsKey(bal)){
            return new int[]{hm.get(bal),i};
        }
        hm.put(nums[i],i);
       }
       return new int[]{};
    }
}