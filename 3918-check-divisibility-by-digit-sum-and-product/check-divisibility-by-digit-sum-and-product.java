class Solution {
    public boolean checkDivisibility(int n) {
        int o=n;
        int n1=0;
        int n2=1;

        while(n>0){
            int rev=n%10;
            n1+=rev;
            n2*=rev;
            n/=10;
        }
        return o % (n1+n2)==0;
    }
}