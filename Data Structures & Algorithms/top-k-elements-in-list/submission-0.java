class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> counts = new HashMap<>();

        for(int num : nums){
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] freq = new List[nums.length + 1];
        for(Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            if (freq[entry.getValue()] ==null){
                freq[entry.getValue()] = new ArrayList<>();
            }
            freq[entry.getValue()].add(entry.getKey());
        }

        int[] res = new int[k];
        int i = nums.length;
        while(k>0){
            if(freq[i] != null){
                for(int n : freq[i]){
                    res[--k] = n;
                    if (k==0) return res;
                }
            }
            i--;
        }

        return res;
        
    }
}
