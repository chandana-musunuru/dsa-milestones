class MinStack {
    Stack<Integer> st;
    
    public MinStack() {
        st=new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
    }
    
    public void pop() {
        st.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        Stack<Integer> st2=new Stack<>();
        st2.addAll(st);
        int min=Integer.MAX_VALUE;
        
        while(!st2.isEmpty()){
            int a=st2.pop();
            min=(min>a)?a:min;
        }
        return min;
    }
}
