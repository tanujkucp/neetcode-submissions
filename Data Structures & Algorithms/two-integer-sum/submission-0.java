class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> index = new HashMap<>();

        for(int i=0;i<nums.length; i++){
            int num = nums[i];
            int compl = target - num;
            if(index.containsKey(compl)){
                return new int[] {index.get(compl), i};
            } else {
                index.put(num, i);
            }
        }

        return new int[] {-1,-1};
    }
}
