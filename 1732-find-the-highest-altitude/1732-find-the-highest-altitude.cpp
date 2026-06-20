class Solution {
public:
    int largestAltitude(vector<int>& gain) {
        int attitude =0;
        int maxAtt = 0;
        for(int i : gain){
            attitude += i;
            maxAtt = max(maxAtt , attitude);
        }

        return maxAtt;
    }
};