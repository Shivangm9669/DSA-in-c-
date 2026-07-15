class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> mp = new HashSet<>();
        int longest =0;

        for(int i : nums){
            mp.add(i);
        }

        for(int num : mp){
            if(!mp.contains(num-1)){
                int current = num;
                int length =0;
                while(mp.contains(current)){
                    current++;
                    length++;
                }
            longest = Math.max(longest , length);
            }

        }
    return longest;
    }

}