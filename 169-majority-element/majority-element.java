class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int num:nums){
            hm.put(num,hm.getOrDefault(num,0)+1);
        }
        int ans=0;
        int maxCount=0;

        for(Map.Entry<Integer,Integer> em:hm.entrySet()){
            if(em.getValue()>maxCount){
                ans=em.getKey();
                maxCount=em.getValue();
            }
        }
        return ans;
    }
}