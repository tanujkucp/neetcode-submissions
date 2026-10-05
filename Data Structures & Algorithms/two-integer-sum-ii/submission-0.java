class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int s = 0, e = numbers.length - 1;

        int sum = numbers[s] + numbers[e];
        while(s<e && target != sum) {
            sum = numbers[s] + numbers[e];
            if (sum > target) {
                e--;
            } else if(sum < target) {
                s++;
            } else {
                break;
            }
        }

        return new int[] {s+1, e+1};

    }
}
