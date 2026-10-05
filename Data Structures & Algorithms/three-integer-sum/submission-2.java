class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> res = new ArrayList<>();
        for(int i=0; i<nums.length - 2; i++){
            // Skip duplicates
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            // i + j + k = 0
            // j + k = -i
            int target = -nums[i];
            int j = i+1, k = nums.length - 1;

            // Two-Sum
            while(j<k) {
                int sum = nums[j] + nums[k];
                if (sum > target) {
                    k--;
                } else if(sum < target) {
                    j++;
                } else {
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    // Handle duplicate pairs due to duplicate elements
                    while (j < k && nums[j] == nums[j + 1]) j++;
                    while (j < k && nums[k] == nums[k - 1]) k--;
                    j++;
                    k--;
                }
            }

            
            
        }

        return res;
    }

}
