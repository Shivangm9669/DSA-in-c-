class Solution {
public:
    int maxDistance(vector<int>& nums1, vector<int>& nums2) {
        int ansIndx =0;
        int n1 = nums1.size();
        int n2 = nums2.size();
        int j = 0;
        for(int i=0; i<n1 ; i++){
            while(j<n2 && nums1[i]<=nums2[j]){
                j++;
            }
            ansIndx = max(ansIndx ,  j - i -1);
        }

        return ansIndx;
    }
};