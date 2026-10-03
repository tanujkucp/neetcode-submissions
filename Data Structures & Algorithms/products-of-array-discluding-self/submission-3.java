class Solution {

    // Sol using prefix and suffix product arrays
    // pre = [1, 1, 2, 8]
    // suf = [48,24,6,1]
    // sol = [48, 24, 12, 8]

    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] pre = new int[n];
        int[] suf = new int[n];

        pre[0] = 1;
        for(int i=1; i<n; i++){
            pre[i] = pre[i-1] * nums[i-1];
            if(pre[i]==0) break;
        }
        suf[n-1] = 1;
        for(int i=n-2; i>=0; i--){
            suf[i] = suf[i+1] * nums[i+1];
            if(suf[i]==0) break;
        }

        int[] res = new int[nums.length];
        for(int i=0; i<n; i++){
            res[i] = pre[i] * suf[i];
        }

        return res;

    }
}  
