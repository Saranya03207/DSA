class Solution {
    public int countSpecialIntegers(int[] nums) {
        HashMap<Integer,ArrayList<Integer>> l=new HashMap<>();

        for(int n=0;n<nums.length;n++){
            if(!l.containsKey(nums[n])){
                l.put(nums[n],new ArrayList<>());
            }
            l.get(nums[n]).add(n);
        }
        int cnt=0;
        for(Map.Entry<Integer,ArrayList<Integer>> hm:l.entrySet()){
            boolean special=true;
            ArrayList<Integer> arr=hm.getValue();
            for(int i=1;i<arr.size();i++){
                if(arr.get(i)!=(arr.get(i-1)+1)){
                    special=false;
                    break;
                }
            }

             if(special){
                    cnt++;
                }
        }
        return cnt;
        
    } 
}