class Solution {
    public boolean isValid(String s) {
        if(s.length()==1) return false;
        Stack<Character> stack = new Stack<>();
        int i =0;
        while(i<s.length()){
            if(s.charAt(i)=='('){
                stack.push(')');
                i++;
            }
            else if(s.charAt(i)=='{'){
                stack.push('}');
                i++;
            }
            else if(s.charAt(i)=='['){
                stack.push(']');
                i++;
            }
            else{
                if(stack.isEmpty() || s.charAt(i)!=stack.peek()){
                    return false;
                }
                else stack.pop();
                i++;
            }
        
        }
        return stack.isEmpty() ?true :false;        
    }
}
