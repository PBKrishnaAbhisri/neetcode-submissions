class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i =0; i< n-2; i++){
            int k = i+1;
            int j = n-1;
            if(i>0 && nums[i-1] == nums[i]) continue;
            while(k<j){
                int sum = nums[i]+nums[j]+nums[k];
                if( sum > 0){
                    j--;
                }else if(sum <0){
                    k++;
                }else{
                    res.add( Arrays.asList(nums[i], nums[k], nums[j]));
                    k++;
                    j--;
                    while(k < j && nums[k] == nums[k-1])
                        k++;

                    while(k < j && nums[j] == nums[j+1])
                        j--;
                }

            }

        }
       return res;
        
    }
}
