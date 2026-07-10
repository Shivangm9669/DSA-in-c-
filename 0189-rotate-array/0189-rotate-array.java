class Solution {
    private void reverse(int i , int j , int[] nums){
        while(i<j){
            nums[i] = nums[i] + nums[j];
            nums[j] = nums[i] - nums[j];
            nums[i] = nums[i] - nums[j];

            i++;
            j--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;

        reverse(0 , n-1 , nums);
        reverse(0 , k-1 , nums);
        reverse(k , n-1 , nums);
    }
}