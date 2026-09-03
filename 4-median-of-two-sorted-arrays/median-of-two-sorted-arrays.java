class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
     int n=nums1.length;
     int m=nums2.length;

     if(n==0 && m!=0){

     }
     ArrayList<Integer> l=new ArrayList<>();
     for(int num:nums1){
        l.add(num);
     }    

     for(int num:nums2){
        l.add(num);
     }
     Collections.sort(l);
     int t=n+m;
     if(t%2==0){
         return (l.get(t/2)+l.get(t/2-1))/2.0;
     }

     return l.get(t/2);
    

    }
}