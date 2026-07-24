class Solution {
    public String minWindow(String s, String t) {

        int n = s.length();

        HashMap<Character, Integer> need = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();

        for(char c : t.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }

        int required = need.size();

        int have = 0;

        int left = 0;

        int minLen = Integer.MAX_VALUE;
        int start = 0;


        for(int right = 0; right < n; right++) {

            char c = s.charAt(right);

            window.put(c, window.getOrDefault(c, 0) + 1);

            if(need.containsKey(c) &&
               window.get(c).equals(need.get(c))) {

                have++;
            }
            while(have == required) {

                int len = right - left + 1;

                if(len < minLen) {
                    minLen = len;
                    start = left;
                }


                char remove = s.charAt(left);

                window.put(remove, window.get(remove) - 1);


                if(need.containsKey(remove) &&
                   window.get(remove) < need.get(remove)) {

                    have--;
                }

                left++;
            }
        }


        return minLen == Integer.MAX_VALUE 
                ? "" 
                : s.substring(start, start + minLen);
    }
}