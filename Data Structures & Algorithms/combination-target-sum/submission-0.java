class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer>sub = new ArrayList<>();
        func(0,0,sub,target,res,nums);
        return res;
    }
    public void func(int ind,int sum,List<Integer>sub,int target, List<List<Integer>> res, int[] nums){
        if(sum > target) return;
        if(ind == nums.length){
            if(target == sum){
                res.add(new ArrayList<>(sub));
            }
            return;
        }
        //take
        sub.add(nums[ind]);
        func(ind,sum + nums[ind],sub,target,res,nums);
        
        sub.remove(sub.size()-1);
        func(ind+1,sum,sub,target,res,nums);
    }
}
