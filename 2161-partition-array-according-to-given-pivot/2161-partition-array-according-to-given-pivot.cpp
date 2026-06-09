class Solution {
public:
    vector<int> pivotArray(vector<int>& nums, int pivot) {
        vector<int> ans ;
        int pivotCount =0;
        for(int i : nums){
            if(i==pivot){
                pivotCount++;
            }
            else if(i<pivot){
                ans.push_back(i);
            }
        }

        for(int i =0; i<pivotCount ; i++){
            ans.push_back(pivot);
        }

        for(int i : nums){
            if(i>pivot){
                ans.push_back(i);
            }
        }

        return ans;
    }
};