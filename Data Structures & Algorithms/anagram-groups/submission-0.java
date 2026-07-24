class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        int n = strs.length;
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {

            if (visited[i]) continue;

            visited[i] = true;

            char[] arr1 = strs[i].toCharArray();
            Arrays.sort(arr1);

            List<String> group = new ArrayList<>();
            group.add(strs[i]);

            for (int j = i + 1; j < n; j++) {

                if (visited[j]) continue;

                char[] arr2 = strs[j].toCharArray();
                Arrays.sort(arr2);

                if (Arrays.equals(arr1, arr2)) {
                    group.add(strs[j]);
                    visited[j] = true;
                }
            }

            ans.add(group);
        }

        return ans;
    }
}