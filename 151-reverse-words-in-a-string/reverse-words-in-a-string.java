class Solution {
    public String reverseWords(String s) {
        String[] sar=s.trim().split("\\s+");
        Stack<String> stk=new Stack<>();
        for(String num:sar){
            stk.push(num);
        }
        String res="";
        while(!stk.isEmpty()){
            res+=stk.pop();
            if(!stk.isEmpty()){
                res+=" ";
            }
        }
        return res;

    }
}