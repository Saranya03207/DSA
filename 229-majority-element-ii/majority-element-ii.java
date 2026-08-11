class Solution {
    public List<Integer> majorityElement(int[] nums) {
       int n=nums.length;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int num:nums){
            hm.put(num,hm.getOrDefault(num,0)+1);
        }
        List<Integer> li=new ArrayList<>();
        for(Map.Entry<Integer,Integer> em:hm.entrySet()){
            if(em.getValue()>n/3){
                li.add(em.getKey());
            }
        }
        return li;

    }
} 
  