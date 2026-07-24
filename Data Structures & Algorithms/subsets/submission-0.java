class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> sub = new ArrayList<>();
        func(0,nums,result,sub,n);
        return result;
    }
    public void func(int ind, int[] nums,List<List<Integer>> result,List<Integer> sub,int n){
        //base case
        if(ind == n){
            result.add(new ArrayList<>(sub));
            return;
        }
        // take
        sub.add(nums[ind]);
        func(ind+1,nums,result,sub,n);
        sub.remove(sub.size()-1);
        //not take
        func(ind+1,nums,result,sub,n);        
    }
}
