class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);

        List<List<Integer>> res = new ArrayList<>();
        List<Integer> sub = new ArrayList<>();

        dfs(0, target, candidates, sub, res);
        return res;
    }

    private void dfs(int ind, int target, int[] candidates,
                     List<Integer> sub, List<List<Integer>> res) {

        if (target == 0) {
            res.add(new ArrayList<>(sub));
            return;
        }

        for (int i = ind; i < candidates.length; i++) {

            // Skip duplicates
            if (i > ind && candidates[i] == candidates[i - 1]) {
                continue;
            }

            // Since array is sorted, no need to continue
            if (candidates[i] > target) {
                break;
            }

            sub.add(candidates[i]);

            // Move to next index (cannot reuse same element)
            dfs(i + 1, target - candidates[i], candidates, sub, res);

            // Backtrack
            sub.remove(sub.size() - 1);
        }
    }
}