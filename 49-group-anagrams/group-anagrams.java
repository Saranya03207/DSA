class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String,ArrayList<String>> hm=new HashMap<>();

        for(String s:strs){
            char[] ch=s.toCharArray();
            Arrays.sort(ch);
            String k=new String(ch);
            if(!hm.containsKey(k)){
                hm.put(k,new ArrayList<>());
            }
            hm.get(k).add(s);
        }

        return new ArrayList<>(hm.values());
    }
}