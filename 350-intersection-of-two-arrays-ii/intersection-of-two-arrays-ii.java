class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> l=new ArrayList<>();
        boolean[] visited=new boolean[nums2.length];
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j] && !visited[j]){
                    l.add(nums1[i]);
                    visited[j]=true;
                    break;
                }
            }
        }
        int k=0;
        int[] num=new int[l.size()];
        for(int arr:l){
            num[k++]=arr;
        }
        return num;
    }
}