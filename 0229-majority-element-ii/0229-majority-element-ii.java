class Solution {
    public List<Integer> majorityElement(int[] nums) {

        int elemOne = 0, elemTwo = 1;
        int countOne = 0, countTwo = 0;

        for (int num : nums) {
            if (num == elemOne) {
                countOne++;
            } else if (num == elemTwo) {
                countTwo++;
            } else if (countOne == 0) {
                elemOne = num;
                countOne = 1;
            } else if (countTwo == 0) {
                elemTwo = num;
                countTwo = 1;
            } else {
                countOne--;
                countTwo--;
            }
        }

        countOne = 0;
        countTwo = 0;

        for (int num : nums) {
            if (num == elemOne) countOne++;
            else if (num == elemTwo) countTwo++;
        }

        List<Integer> ans = new ArrayList<>();

        if (countOne > nums.length / 3)
            ans.add(elemOne);

        if (countTwo > nums.length / 3)
            ans.add(elemTwo);

        return ans;
    }
}