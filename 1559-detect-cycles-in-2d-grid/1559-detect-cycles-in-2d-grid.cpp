class Solution {
public:
    bool dfs(vector<vector<char>>& grid , int i , int j , int pi , int pj , vector<vector<int>> &visited , char c){
        if(i>=grid.size() || j>=grid[i].size() || i<0 || j<0){
            return false;
        }
        if(c!=grid[i][j]){
            return false;
        }
        if(visited[i][j]!=-1){
            return true;
        }
        visited[i][j]=1;
        int d[4] = {0, 0, -1, +1};
        int f[4] = {-1 , +1 , 0 , 0};
        bool ans = false;
        for(int k =0 ; k<4 ; k++){
            if(pi == i+d[k] && pj == j+f[k]){
                ans = ans || false;
                continue;
            }
            ans = ans || dfs(grid , i+d[k] , j+f[k] , i, j , visited , c);
        }
        return ans;
    }
    bool containsCycle(vector<vector<char>>& grid) {
        int n = grid.size();
        int m = grid[0].size();
        vector<vector<int>> visited (n , vector<int>(m , -1)); 
        for(int i =0 ; i<n ; i++){
            for(int j =0 ; j<m ; j++){
                if(visited[i][j]==-1 && dfs(grid , i , j ,-1 , -1 , visited, grid[i][j])){
                    return true;
                }
            }
        }
        return false;
    }
};