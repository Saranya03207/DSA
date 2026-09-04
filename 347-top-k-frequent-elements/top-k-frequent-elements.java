class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer,Integer> nm=new HashMap<>();

        for(int num:nums){
            nm.put(num,nm.getOrDefault(num,0)+1);
        }

        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->nm.get(b)-nm.get(a));

        for(int num:nm.keySet()){
            pq.add(num);
        }

        int[] ans=new int[k];

        for(int i=0;i<k;i++){
            ans[i]=pq.poll();
        }

        return ans;
    }
}