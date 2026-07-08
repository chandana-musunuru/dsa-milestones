class Solution {
    static HashMap<Integer,String> map=new HashMap<>(Map.of(
         2,"abc",
         3,"def",
         4,"ghi",
         5,"jkl",
         6,"mno",
         7,"pqrs",
         8,"tuv",
         9,"wxyz"
        ));
    public List<String> letterCombinations(String digits) {
        List<String> lis=new ArrayList<>();
        
        if (digits == null || digits.length() == 0) {
           return new ArrayList<>();
        }

        combinations(lis,digits,0,new StringBuilder());
        return lis;
        
        
        
    }
    public void combinations(List<String> lis,String s,int i,StringBuilder current){
    
        if (i == s.length()) {
            lis.add(current.toString());
            return;
        }

        String letters = map.get(s.charAt(i)-'0');

        for (char c : letters.toCharArray()) {
            current.append(c);                      
            combinations(lis, s,i + 1, current); 
            current.deleteCharAt(current.length() - 1);    
        }

    }
}
