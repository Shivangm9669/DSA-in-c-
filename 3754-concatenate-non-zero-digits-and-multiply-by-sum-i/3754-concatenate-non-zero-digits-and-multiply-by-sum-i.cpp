class Solution {
public:
    long long sumAndMultiply(int n) {
        long long ans =0;
        int sum =0;
        int r=1;

        while(n){
            int rem = n%10;
            if(rem!=0){
                sum+=rem;
                ans = (rem * r) + ans;
                r*=10;
            }
            n/=10;
        }
        return sum * ans;
    }
};