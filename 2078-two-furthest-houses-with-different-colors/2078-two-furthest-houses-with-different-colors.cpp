class Solution {
public:
    int maxDistance(vector<int>& colors) {
        vector<int> check (101 , 0);
        int n = colors.size();
        for(int i=0; i<n ; i++){
            check[colors[i]]=i;
        }
        int maxCount =0;
        for(int i =0;i<n;i++){
            for(int j =0; j<=100 ; j++){
                if(colors[i]!=j)
                maxCount = max(maxCount , check[j]-i);
            }
        }

        return maxCount;
    }
};