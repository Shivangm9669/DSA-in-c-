class Solution {
public:
    vector<int> findThePrefixCommonArray(vector<int>& A, vector<int>& B) {
        int count =0;
        vector<int> ans;
        int n = B.size();
        long long bitSum=0;
        for(int i =0 ; i<n ;i++){
            if(bitSum & (1LL<<A[i])){
                count++;
            }else{
                bitSum |= (1LL<<A[i]);
            }
            if(bitSum & (1LL<<B[i])){
                count++;
            }
            else{
                bitSum |= (1LL<<B[i]);
            }

            ans.push_back(count);
        }
        return ans;
    }
};