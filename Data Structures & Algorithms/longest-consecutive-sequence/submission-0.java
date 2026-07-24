class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int maxcount = 0;
        for(int num : nums){
            set.add(num);
        }
        for(int num : set){
            if(!set.contains(num-1)){
                int count =1;
                int current = num;
                while(set.contains(current+1)){
                    count++;
                    current++;
                }
                maxcount = Math.max(maxcount,count);
            }
        }
        return maxcount;
    }
}
