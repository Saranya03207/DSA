class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> l=new ArrayList<>();

        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int c:nums){
            hm.put(c,hm.getOrDefault(c,0)+1);
        }

        for(Map.Entry<Integer,Integer> e:hm.entrySet()){
            if(e.getValue()>1){
                l.add(e.getKey());
            }
        }

        return l;
    }
}