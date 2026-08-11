class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int num:nums){
            hm.put(num,hm.getOrDefault(num,0)+1);
        }
        int ans=0;
        for(Map.Entry<Integer,Integer> em:hm.entrySet()){
            if(em.getValue()==1){
                ans=em.getKey();
                break;
            }
        }
        return ans;
    }
}