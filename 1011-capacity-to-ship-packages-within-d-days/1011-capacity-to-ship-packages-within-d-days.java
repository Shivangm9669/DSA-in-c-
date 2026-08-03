class Solution {
    int totalDays(int[] weights , int weight){
        int day=0;
        int sum =0;

        for(int w : weights){
            if(sum + w > weight){
                day++;
                sum=w;
            }
            else
            sum += w;
        }
        if(sum !=0){
            day+=1;
        }

        return day;
    }
    public int shipWithinDays(int[] weights, int days) {
        int left = Arrays.stream(weights).max().getAsInt();
        int right = Arrays.stream(weights).sum();

        while(left <= right){
            int mid = left + (right - left)/2;
            int noDays = totalDays(weights , mid);
            
            if(noDays<=days){
                right = mid  - 1;
            }
            else{
                left = mid + 1;
            }
        }

        return left ;
    }
}