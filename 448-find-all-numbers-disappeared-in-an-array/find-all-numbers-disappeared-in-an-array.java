class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        Set<Integer> s=new LinkedHashSet<>();
        for(int num:nums){
            s.add(num);
        }

        List<Integer> li=new ArrayList<>();
        
        int j=1;
        while(j<=nums.length){
            if(!s.contains(j)){
                li.add(j);
            }
            j++;
        }
       return li;
    }
}