class Solution {
public:
    int maxIceCream(vector<int>& costs, int coins) {
        sort(costs.begin() , costs.end());
        int outPut =0;
        for(int i : costs){
            if(coins<i){
                break;
            }
            outPut++;
            coins-=i;
        }
        return outPut;
    }
};