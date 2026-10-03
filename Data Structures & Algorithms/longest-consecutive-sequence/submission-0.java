class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        // Add all values to the set
        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;

        for(int i=0; i<n; i++){
            int num = nums[i];
            if(!set.contains(num-1)){
                // start sequence
                int curr = num;
                int l = 1;
                while(set.contains(curr + 1)){
                    curr++;
                    l++;
                }
                longest = Math.max(longest, l);
            }
        }

        return longest;
    }
}
