class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] arr = new int[k];

        for(int i =0; i<n;i++){
            int val = map.getOrDefault(nums[i],0);
            map.put(nums[i],val+1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> (map.get(b)- map.get(a)));
        pq.addAll(map.keySet());
        for(int i =0; i<k;i++){
            arr[i] = pq.poll();
        }
        return arr;
    
    }
}
