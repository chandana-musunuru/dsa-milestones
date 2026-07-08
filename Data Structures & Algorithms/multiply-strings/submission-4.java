class Solution {
    public String multiply(String num1, String num2) {
       /* long n1=Long.valueOf(num1);//Long.parseLong(str);
        long n2=Long.valueOf(num2);
        long n3=n1*n2;
        return String.valueOf(n3);//Integer.toString(int)*/
        if(num1.equals("0") || num2.equals("0")) return "0";
        if(num1.length()<num2.length()){
            return multiply(num2,num1);
        }
        int[] result=new int[num1.length()+num2.length()];
        num1=new StringBuilder(num1).reverse().toString();
        num2=new StringBuilder(num2).reverse().toString();
        for(int i=0;i<num1.length();i++){
            for(int j=0;j<num2.length();j++){
                int mul=(num1.charAt(i)-'0')*(num2.charAt(j)-'0');
                int sum = result[i+j] + mul;
        result[i+j] = sum % 10;
        result[i+j+1] += sum / 10;
            }
        }
        StringBuilder sb=new StringBuilder();
        int i=result.length-1;
        while (i >= 0 && result[i] == 0) {
            i--;
        }
        while(i>=0){
            sb.append(result[i]);
            i--;
        }
        return sb.toString();





    }
}
