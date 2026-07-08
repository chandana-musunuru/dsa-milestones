class Solution {
   /* public char matchingChar(char ch) {
        return switch (ch) {
        case ']' -> '[';
        case ')' -> '(';
        case '}' -> '{';
        default -> '\0';
        };
    }*/
    public boolean isValid(String s) {
       /* //ds stack st empty=true else false
        //if len==1 or odd return false
        //open brackets push in to stack if closed brackets
        //} check top of the stack is {
        char c=s.charAt(0);
        if((s.length()%2==1)) return false;
        
        
        Stack<Character> st=new Stack<>();

        for(char ch:s.toCharArray()){
            if(ch=='[' || ch=='(' || ch=='{'){
                st.push(ch);
            }
            else{
                char val=matchingChar(ch);
                if(!st.isEmpty() && val==st.peek()){
                    st.pop();
                }
                else{
                    return false;
                }
            }
        }
        return st.isEmpty()?true:false;*/
        Map<Character,Character> map=Map.of(
            '}','{',
            ')','(',
            ']','['
        );
        Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(map.containsKey(ch)){
               if(st.isEmpty() || st.peek()!=map.get(ch)){
                    return false;
                }
                else{
                    st.pop();
                }
            }
            
            else{
               st.push(ch);
            }
    
        }
        return st.isEmpty();
    }
}
