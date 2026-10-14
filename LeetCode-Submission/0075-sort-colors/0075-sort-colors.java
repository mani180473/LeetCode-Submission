class Solution {
    public void sortColors(int[] nums) {
        int s =0, m = 0, e = nums.length -1;

        while (m <= e){
            if (nums[m] == 0){
                swap(nums, s, m);
                s++;
                m++;
            }else if(nums[m] == 1){
                m++;
            }else if(nums[m] ==2){
                swap(nums, m, e);
                e--;
            }
        }
    }
    private void swap(int a[], int i, int j){
        int temp = a[i];
        a[i]= a[j];
        a[j]=temp;
    }
}