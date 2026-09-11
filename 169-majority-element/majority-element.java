class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int n:nums){
            hm.put(n,hm.getOrDefault(n,0)+1);
        }
        for(Map.Entry<Integer,Integer> e:hm.entrySet()){
            if(e.getValue()>nums.length/2){
                return e.getKey();
            }
        }
        return 0;
    }
}