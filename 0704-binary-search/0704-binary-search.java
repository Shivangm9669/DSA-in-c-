class Solution {
    public int search(int[] nums, int target) {
        int end = nums.length -1;
        int start =0;

        while(start<=end){
            int med = start + (end - start)/2;

            if(nums[med] == target){
                return med;
            }

            else if(nums[med] > target){
                end = med -1;
            }
            else{
                start = med + 1;
            }
        }
        return -1;
    }
}