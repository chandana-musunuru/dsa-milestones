class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        var list=new ArrayList<List<List<String>>>();
        HashMap<String,List<String>> map=new HashMap<>();
        for(String st:strs){
            char[] arr=st.toCharArray();
            Arrays.sort(arr);
            String st1=new String(arr);
            map.computeIfAbsent(st1, k -> new ArrayList<>()).add(st);
        }
        return new ArrayList<>(map.values());
    }
}
