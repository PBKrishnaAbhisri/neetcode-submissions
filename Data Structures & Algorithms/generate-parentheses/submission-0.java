class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        func(n,new StringBuilder(),res,0,0);
        return res;
    }
    public void func(int n , StringBuilder s,List<String> res,int open, int close){
        if(s.length() == 2*n){
            res.add(s.toString());
            return;
        }
        if (open < n) {
            s.append('(');
            func(n, s, res, open + 1, close);
            s.deleteCharAt(s.length() - 1);   // backtrack
        }

        if (close < open) {
            s.append(')');
            func(n, s, res, open, close + 1);
            s.deleteCharAt(s.length() - 1);   // backtrack
        }

    }
}
