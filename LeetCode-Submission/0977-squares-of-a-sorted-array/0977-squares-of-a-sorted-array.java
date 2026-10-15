class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length, l = 0, r = n-1, k = n-1;
        int ans[] = new int[n];

        while(l<=r){
            int leftsqr = nums[l] * nums[l];
            int rightsqr = nums[r] * nums[r];

            if (leftsqr > rightsqr){
                ans[k] = leftsqr;
                l++;
            }else{
                ans[k] = rightsqr;
                r--;
            }
            k--;
        }
      
      return ans;
    }
}