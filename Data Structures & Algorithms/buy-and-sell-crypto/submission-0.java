class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[] rightMax = new int[n];

        rightMax[n-1] = prices[n-1];
        for(int i=n-2; i>=0; i--){
            rightMax[i] = Math.max(rightMax[i+1], prices[i]);
        }

        int ans = 0;
        for(int i=0; i<n; i++){
            ans = Math.max(ans, rightMax[i] - prices[i]);
        }

        return ans;
    }
}
