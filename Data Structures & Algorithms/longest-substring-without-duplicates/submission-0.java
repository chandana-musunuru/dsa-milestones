class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new LinkedHashSet<>();
        int len=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if (set.contains(ch)) {
                Iterator<Character> it = set.iterator();
                while (it.hasNext()) {
                    char c = it.next();
                    it.remove(); 
                    if (c == ch) break;
                }
            }
            set.add(ch);
            len = Math.max(len, set.size());
        } 
        return len;
    }
}
