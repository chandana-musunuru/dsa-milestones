class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        /*HashMap<String,List<String>> map=new HashMap<>();
        for(String st:strs){
            char[] arr=st.toCharArray();
            Arrays.sort(arr);
            String st1=new String(arr);
            map.computeIfAbsent(st1, k -> new ArrayList<>()).add(st);
        }
        return new ArrayList<>(map.values());*/
       
    return Arrays.stream(strs)
.parallel() // leverage multiple CPU cores
.collect(Collectors.groupingByConcurrent(
s -> s.chars()
.sorted()
.collect(StringBuilder::new,
StringBuilder::appendCodePoint,
StringBuilder::append)
.toString()
))
.values()
.stream()
.toList();
}
}
