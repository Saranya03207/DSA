class Solution {
    public int repeatedNTimes(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();

        for(int n:nums){
            hm.put(n,hm.getOrDefault(n,0)+1);
        }

        int freq=0;
        int ans=0;

        for(Map.Entry<Integer,Integer> e:hm.entrySet()){
            if(e.getValue()>freq){
                freq=e.getValue();
                ans=e.getKey();
            }
        }
        return ans;
    }
}