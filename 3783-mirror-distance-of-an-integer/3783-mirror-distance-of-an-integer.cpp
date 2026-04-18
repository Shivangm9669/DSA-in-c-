class Solution {
public:
    int reverse(int n ){
        int rev =0;
        while(n!=0){
            int rem = n%10;
            n/=10;
            rev = rev * 10 + rem;
        }

        return rev;
    }
    int mirrorDistance(int n) {
        return abs(n- reverse(n));
    }
};