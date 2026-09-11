class Solution {
    public boolean isHappy(int n) {
        
        HashSet<Integer> hs=new HashSet<>();
        
        while(n!=1){

            if(hs.contains(n)){
                return false;
            }
            hs.add(n);
           int m=0;
            while(n>0){
                int rem=n%10;
                m+=(rem*rem);
                n/=10;
            }
            n=m;
        }

        return true;
    }
}