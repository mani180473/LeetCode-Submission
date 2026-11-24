class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sumOfN = n*(n+1)/2;
        int sum = 0;
        for(int a : nums){
            sum+=a;
        }

        return sumOfN - sum;
    }
}