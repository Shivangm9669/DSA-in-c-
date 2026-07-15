class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int even = 0;
        int odd = 1;
        int []ans = new int [n];

        for(int i : nums){
            if(i>0){
                ans[even] = i;
                even+=2;
            }else{
                ans[odd] = i;
                odd+=2;
            }
        }

        return ans;
    }
}