class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int n = tokens.length;
        int res = 0;
        for(String s : tokens){
            if(!s.equals("+") && !s.equals("-")&& !s.equals("*") &&!s.equals("/")){
                stack.push(Integer.parseInt(s));
            }else{
                int val2 = stack.pop();
                int val1 = stack.pop();
                if(s.equals("+")){
                    res = val1 + val2;
                    stack.push(res);
                }else if(s.equals("-")){
                    res = val1 - val2;
                    stack.push(res);
                }else if(s.equals("*")){
                    res = val1 * val2;
                    stack.push(res);
                }else{
                    res = val1 / val2;
                    stack.push(res);
                }
            }
        }
        return stack.pop();
    }
}
