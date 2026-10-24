class Solution {
    public int singleNumber(int[] nums) {
        int r1=0;
		int r2=0;
		for(int nums1 : nums) {
			r1^=nums1&~r2;
			r2^=nums1&~r1;
		}
		return r1;

    }
}