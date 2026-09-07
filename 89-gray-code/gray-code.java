class Solution {
    public List<Integer> grayCode(int n) {
       List<Integer> l=new ArrayList<>();
       int s=1<<n;
       for(int i=0;i<s;i++){
        l.add(i^(i>>1));
       } 
       return l;
    }
}