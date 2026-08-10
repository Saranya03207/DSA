class Solution {
    public int charToInt(char ch){
        int ans=0;
        switch (ch){
            case 'I':
            ans= 1;
            break;
            case 'V':
            ans= 5;
            break;
            case 'X':
            ans= 10;
            break;
            case 'L':
            ans= 50;
            break;
            case 'C':
            ans= 100;
            break;
            case 'D':
            ans= 500;
            break;
            case 'M':
            ans= 1000;
            break;
        }
        return ans;

    }
    public int romanToInt(String s) {
        int res=0;
        char[] car=s.toCharArray();
        for(int i=0;i<car.length;i++){
            if(i+1<car.length && charToInt(car[i])<charToInt(car[i+1])){
                res-=charToInt(car[i]);
            }else{
                res+=charToInt(car[i]);
            }
        }
        return res;
    }
}