class Solution {
    public int removeElement(int[] nums, int val) {
        int l =0; 
        
        for(int r =0; r <= nums.length-1; r++){
            if (nums[r]!=val){
                nums[l] = nums[r];
                l++;
            }
        }
        return l;
    }
}