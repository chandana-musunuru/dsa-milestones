class Solution {
    public boolean isAnagram(String s, String t) {
       /* if (s.length() != t.length()) return false;
        HashMap<Character,Integer> map1=new HashMap<>();
        
        for(char ch:s.toCharArray()){
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }
        for(char ch:t.toCharArray()){
           
            map1.put(ch,map1.getOrDefault(ch,0)-1);
            if (map1.get(ch) == 0) {
                map1.remove(ch); 
            }
        }
        
        
        return (map1.size()==0)?true:false;*/
        if (s.length() != t.length()) return false;
        int[] letters=new int[26];
        for(char ch:s.toCharArray()){
            letters[ch-'a']+=1;
        }
        for(char ch:t.toCharArray()){
            if(letters[ch-'a']>0){
                letters[ch-'a']-=1;
            }
            else{
                return false;
            }
        }
        for(int i:letters){
            if(i>0){
                return false;
            }
        }
        return true;
    }
}
