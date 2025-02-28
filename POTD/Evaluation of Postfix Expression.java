class Solution {
    public int performOperation(String cur,int op1,int op2){
        switch (cur){
            case "+":
                return op1+op2;
            case "-":
                return op1-op2;
            case "*":
                return op1*op2;
            case "/":
                return op1/op2;
            default:
            return -1;
        }
    }
    public int evaluate(String[] arr) {
        // code here
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<arr.length;i++){
            String cur=arr[i];
        if(cur.equals("+") || cur.equals("-") || cur.equals("*") || cur.equals("/")){
            //take out the top 2 
            if(s.size()>=2){
                int op2=s.pop();
                int op1=s.pop();
                int ans=performOperation(cur,op1,op2);
                s.push(ans);
        }
    }else{
         s.push(Integer.parseInt(arr[i]));
    }
        }
        return s.pop();
    }
}
