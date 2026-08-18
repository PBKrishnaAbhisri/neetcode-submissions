class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        Map<Character, String> map = new HashMap<>();

            map.put('2', "abc");
            map.put('3', "def");
            map.put('4', "ghi");
            map.put('5', "jkl");
            map.put('6', "mno");
            map.put('7', "pqrs");
            map.put('8', "tuv");
            map.put('9', "wxyz");
            if(!digits.isEmpty()){
                dfs(0,digits,new StringBuilder(),map,res);
            }
        return res;
    }
    void dfs(int i ,String digits,StringBuilder s, Map<Character, String> map,List<String> res){
        if(i>= digits.length()){
            res.add(s.toString());
            return;
        }
        char c = digits.charAt(i);
        String str = map.get(c);
        for(char ch : str.toCharArray()){
            
            dfs(i+1,digits,s.append(ch),map,res);
            s.deleteCharAt(s.length() - 1);
        }
    }

}
