class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer> m=new HashMap<>();

        for(int n:nums){
            m.put(n,m.getOrDefault(n,0)+1);
        }
        ArrayList<Integer> l=new ArrayList<>();
        for(Map.Entry<Integer,Integer> e:m.entrySet()){
            if(e.getValue()==1){
                l.add(e.getKey());
            }
        }
        int i=0;
        int[] arr=new int[l.size()];
        for(int x:l){
            arr[i++]=x;
        }
        return arr;
    }
}