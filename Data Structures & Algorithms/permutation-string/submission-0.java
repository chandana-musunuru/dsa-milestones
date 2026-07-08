class Solution {
    public boolean checkInclusion(String s1, String s2) {
    int s1len=s1.length();
    int s2len=s2.length();
    if(s2len<s1len) return false;
    char[] s1Arr = s1.toCharArray();
    Arrays.sort(s1Arr);
    String sortedS1 = new String(s1Arr);
    for (int i = 0; i < s2.length(); i++) {
            for (int j = i; j < s2.length(); j++) {
                char[] subStrArr = s2.substring(i, j + 1).toCharArray();
                Arrays.sort(subStrArr);
                String sortedSubStr = new String(subStrArr);

                if (sortedSubStr.equals(sortedS1)) {
                    return true;
                }
            }
        }
        return false;
        
    }
}
