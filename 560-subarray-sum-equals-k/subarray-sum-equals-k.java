class Solution {
    public int subarraySum(int[] nums, int k) {
        int pref=0;
        int cnt=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(0,1);
        for(int n:nums){
            pref+=n;
            if(hm.containsKey(pref-k)){
                cnt+=hm.get(pref-k);
            }

            hm.put(pref,hm.getOrDefault(pref,0)+1);
        }
        return cnt;
    }
}