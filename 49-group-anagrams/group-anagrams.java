class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> hm=new HashMap<>();
        for(String num:strs){
            char[] arr=num.toCharArray();
            Arrays.sort(arr);
            String s=new String(arr);

            if(!hm.containsKey(s)){
                hm.put(s,new ArrayList<>());
            }

            hm.get(s).add(num);
        }

        return new ArrayList<>(hm.values());
    }
}