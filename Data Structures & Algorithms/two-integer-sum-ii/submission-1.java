class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // HashMap<Integer,Integer> map = new HashMap<>();
        int n = numbers.length;
        
        for(int i = 0; i<n;i++){
            int remtarget = target-numbers[i];
            int low =0, high = n-1;
            while(low <= high){
                int mid = (low + high)/2;
                if(numbers[mid] == remtarget){
                   return i>mid? new int[]{mid+1, i+1}: new int[]{i+1,mid+1};
                }
                else if(numbers[mid] < remtarget){
                    low = mid+1;
                }else{
                    high = mid -1;
                }
            } 
        }
        return new int[]{-1,-1};
    }
}
