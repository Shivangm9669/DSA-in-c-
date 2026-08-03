class Solution {
    private int sumDivisior(int[] nums , int k){
        int sum =0;

        for(int i : nums){
            sum+= (i + k - 1)/k;
        }
        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int left =1;
        int right = Arrays.stream(nums).max().getAsInt();

        while(left<=right){
            int mid = left + (right -left)/2;
            int sum = sumDivisior(nums , mid);

            if(sum>threshold){
                left = mid + 1;
            }
            else{
                right = mid -1;
            }
        }

        return left;
    }
}