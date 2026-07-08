class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        for(char ch:s.toCharArray()){
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }
        for(char ch:t.toCharArray()){
            if(!map1.containsKey(ch)){
                return false;
            }
            map2.put(ch,map2.getOrDefault(ch,0)+1);
        }
        
        for(Map.Entry<Character,Integer> map:map1.entrySet()){
            char ch=map.getKey();
            if (!Objects.equals(map1.get(ch), map2.get(ch))){
                return false;
            }
        }
        return true;
    }
}
