class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            String ch=tokens[i];
            if(ch.equals("+") || ch.equals("-") || ch.equals("*") || ch.equals("/")){
                
                int num2=st.pop();
                int num1=st.pop();
                switch(ch){
                    case "+":
                            st.push(num1+num2);
                            break;
                    case "-":
                            st.push(num1-num2);
                            break;
                    case "*":
                            st.push(num1*num2);
                            break;
                    case "/":
                            st.push(num1/num2);
                            break;
                }
                

            }
            else{
                st.push(Integer.parseInt(ch));
            }
        }
        return st.pop();
    }
}
