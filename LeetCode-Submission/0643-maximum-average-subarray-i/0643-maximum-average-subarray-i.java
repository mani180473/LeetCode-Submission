class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum =0;
        for(int r =0; r < k; r++){
            sum += nums[r];
        }
        double maxSum = sum;
        for(int r = k; r < nums.length; r++){
            sum += nums[r] - nums[r - k];
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum/k;
    }
}