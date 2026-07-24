class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int n = s.length();
        int count = 0;
        int maxcount = 0;
        char[] arr = s.toCharArray();
        int j =0,i =0;
        while(j<n){
            if(!set.contains(arr[j])){
                set.add(arr[j]);
                count++;
                j++;
            }else{
                set.remove(arr[i]);
                i++;
                count--;
            }
            maxcount = Math.max(maxcount,count);
        }
        return maxcount;
    }
}
