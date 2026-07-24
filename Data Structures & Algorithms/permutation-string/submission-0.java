class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();

        if (n > m) return false;

        int[] arr = new int[26];
        int[] res = new int[26];

        for (char c : s1.toCharArray()) {
            arr[c - 'a']++;
        }

        for (int i = 0; i < n; i++) {
            res[s2.charAt(i) - 'a']++;
        }

        if (Arrays.equals(arr, res)) {
            return true;
        }
        for (int i = n; i < m; i++) {
            
            res[s2.charAt(i) - 'a']++;

           
            res[s2.charAt(i - n) - 'a']--;

            if (Arrays.equals(arr, res)) {
                return true;
            }
        }

        return false;
    }
}