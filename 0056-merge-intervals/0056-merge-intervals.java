class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> {
            if (a[0] != b[0]) {
                return Integer.compare(a[0], b[0]);   
            }
            return Integer.compare(b[1], a[1]);
        });

        List<int[]> ans = new ArrayList<>();
        int start = intervals[0][0];
        int end = intervals[0][1];
        int n = intervals.length;
        for(int i =1 ; i<n ; i++){
            if(end>=intervals[i][0]){
                if(end<intervals[i][1])
                end = intervals[i][1];
            }
            else{
                ans.add(new int[]{start, end});
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        ans.add(new int[]{start, end});
        return ans.toArray(new int[ans.size()][]);
    }
}