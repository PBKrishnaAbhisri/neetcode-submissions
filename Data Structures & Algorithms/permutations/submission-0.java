class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> perm = new ArrayList<>();
        boolean[] used = new boolean[nums.length];

        dfs(nums, used, perm, res);
        return res;
    }
    public void dfs(int[] nums, boolean[] used,List<Integer> perm ,List<List<Integer>> res){
        if(perm.size() == nums.length){
            res.add(new ArrayList<>(perm));
            return;
        }
        for(int i = 0; i<nums.length;i++){
            if(used[i]){
                continue;
            }
            used[i] = true;
            perm.add(nums[i]);
            dfs(nums,used,perm,res);
            perm.remove(perm.size()-1);
            used[i] = false;
        }
    }
}
