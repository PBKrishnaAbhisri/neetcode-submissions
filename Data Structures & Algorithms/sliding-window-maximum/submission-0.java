class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] maxarr = new int[n-k+1];
        int left =0;
        for(int right = k-1; right<n;right++){
            int max = findMax(nums,left,right);
            maxarr[left] = max;
            left++;
        }
        return maxarr;
    }
    public int findMax(int[] arr, int left, int right){
        int max = arr[left];
        for(int i = left; i<= right;i++){
            max = Math.max(max,arr[i]);
        }
        return max;
    }
}
