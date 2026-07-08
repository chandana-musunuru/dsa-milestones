class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb=new StringBuilder();
        int len=strs.length;
        if(len==1) return strs[0];
        int minlen=Integer.MAX_VALUE;
        for(String st:strs){
            minlen=Math.min(minlen,st.length());
        }
        for(int i=0;i<minlen;i++){
            char ch=strs[0].charAt(i);
            System.out.println(" ch="+ch);
            boolean flag=true;
            for(int j=1;j<len;j++){
                if(strs[j].charAt(i)!=ch){
                    flag=false;
                    break;
                }
            }
            if(!flag){
                break;
            }
            sb.append(ch);
        }
        return sb.toString();
        
    }
}