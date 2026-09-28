class Solution {
    public int[] sortedSquares(int[] nums) {

        int left = 0;
        int[] s = new int[nums.length];
        int sq = 1;

        while (left < nums.length) {
            sq = nums[left] * nums[left];
            s[left] = sq;
            left++;
        }

        Arrays.sort(s);

        return s;
    }
}