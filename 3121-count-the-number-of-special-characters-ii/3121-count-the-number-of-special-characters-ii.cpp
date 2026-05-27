class Solution {
public:
    int numberOfSpecialChars(string word) {
        int n = word.length();
        vector<int> mp(26,0);
        int count =0;
        for(char c : word){
            if(c-0<=90){
                if(mp[c-'A']==0){
                    mp[c-'A']=-2;
                }
                if(mp[c-'A']>0){
                    count++;
                    mp[c-'A']=-1;
                }
            }
            else{
                if(mp[c-'a']==-1){
                    count--;
                    mp[c-'a']=-2;
                }
                else if(mp[c-'a']>=0){
                    mp[c-'a']++;
                }
            }
        }
        return count;
    }
};