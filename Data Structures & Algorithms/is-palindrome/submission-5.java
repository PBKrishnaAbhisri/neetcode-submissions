class Solution {
    public boolean isPalindrome(String s) {

        s = s.toLowerCase();
        char[] arr = s.toCharArray();

        int l = 0;
        int r = arr.length - 1;

        while (l < r) {

            while (l < r && !Character.isLetterOrDigit(arr[l])) {
                l++;
            }

            while (l < r && !Character.isLetterOrDigit(arr[r])) {
                r--;
            }

            if (arr[l] != arr[r]) {
                return false;
            }

            l++;
            r--;
        }

        return true;
    }
}