class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int i =0;
        int j =0;

        while(j<n){
            while(j<n && nums[i] == nums[j]){
                j++;
            }
            i++;
            if(j<n){
                nums[i]=nums[j];
            }
        }

        return i;
    }
}