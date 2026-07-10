class Solution {
    private void swap(int[] nums , int i , int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void moveZeroes(int[] nums) {
        int zero = 0;
        int n = nums.length;
        for(int i =0 ; i<n ; i++){
            if(nums[i]!=0){
                swap(nums , zero , i);
                zero++;
            }  
        }

    }
}