class Solution {
    public String reverseWords(String s) {
        String[] sar=s.trim().split("\\s+");
        String temp="";
        for(int i=0;i<sar.length;i++){
            StringBuilder sb=new StringBuilder(sar[i]).reverse();
            temp+=sb;
            if(i!=sar.length-1){
                temp+=" ";
            }
        }
        return temp;
    }
}