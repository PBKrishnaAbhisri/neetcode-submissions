class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> sub = new ArrayList<>();
        solve(0,nums,res,sub);
        return res;
    }
    public void solve(int ind, int[] nums, List<List<Integer>> res, List<Integer>sub){
        
        res.add(new ArrayList<>(sub));
        
        for(int i = ind; i<nums.length;i++){
            if(i > ind && nums[i]== nums[i-1]){
                continue;
            }
            sub.add(nums[i]);
            solve(i+1, nums,res,sub);
            sub.remove(sub.size()-1);
        }

    }
}
