class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer , Integer> mp = new HashMap ();
        int n = nums.length;

        for(int i=0; i<n; i++){
            if(mp.containsKey(target - nums[i])){
                int ans [] = {mp.get(target - nums[i]), i};
                return ans;
            }

           mp.put(nums[i], i);
        }

        return new int[]{};
    }
}