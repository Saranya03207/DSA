class Solution {
    public int lengthOfLastWord(String s) {
        String[] sar=s.trim().split("\\s+");

        String temp=sar[sar.length-1];
        return temp.length();
    }
}