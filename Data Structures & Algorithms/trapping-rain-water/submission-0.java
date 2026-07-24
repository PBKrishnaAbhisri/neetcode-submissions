class Solution {
    public int trap(int[] height) {
        int leftmax =0;
        int rightmax =0;
        int capacity =0;
        int l = 0, r = height.length -1;
        while(l <r){
            if(height[l] < height[r]){
                if(height[l] >= leftmax){
                    leftmax = height[l];
                }else{
                    capacity += leftmax - height[l];
                }
                l++;
            }else{
                if(height[r] >= rightmax){
                    rightmax = height[r];
                }else{
                    capacity += rightmax - height[r];
                }
                r--;
            }
        }
        return capacity;
    }
}
