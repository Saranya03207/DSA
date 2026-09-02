class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        ArrayList<Integer> l=new ArrayList<>();

        for(int n:nums){
            l.add(n);
        }
        Collections.sort(l);
        int cnt=1;
        int max=1;
        for(int i=1;i<l.size();i++){
            if(l.get(i)-l.get(i-1)==1){
                cnt++;
            }else if(l.get(i).equals(l.get(i-1))){
                continue;
            }else{
                cnt=1;
            }
            max=Math.max(cnt,max);
        }
        return max;
    }
}