class Solution {
    public int[] productExceptSelf(int[] nums) {
        int zi = -1; // zero index
        int product = 1;
        for(int i = 0; i<nums.length; i++){
            int num = nums[i];
            if (num == 0 && zi == -1){ // first 0 
                zi = i;
                continue;
            } else if (num == 0 && zi != -1) {
                // Two zeroes means all products will be 0
                return new int[nums.length];
            }

            product *= num;
        }

        int[] res = new int[nums.length];
        if(zi != -1){
            res[zi] = product; // Only zero index will have non-zero product
        } else {
            for(int i = 0; i<nums.length; i++){
                int num = nums[i];
                res[i] = product / num;
            }
        }

        return res;
    }
}  
