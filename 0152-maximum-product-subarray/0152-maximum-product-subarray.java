class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int pre =1;
        int suffix=1;
        int ans = Integer.MIN_VALUE;

        for(int i =0; i<n ;i++){
            if(pre == 0){
                pre =1;
            }
            if(suffix == 0){
                suffix =1;
            }

            pre *= nums[i];

            suffix *= nums[n-i-1];

            ans = Math.max(ans , Math.max(pre , suffix));
        } 

        return ans;

    }
}