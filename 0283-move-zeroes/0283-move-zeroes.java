class Solution {
    public void moveZeroes(int[] nums) {
       int left=0;
		int right=0;
		int temp=0;
		while(left<nums.length) {
			if(nums[left]!=0) {
				temp=nums[left];
				nums[left]=nums[right];
				nums[right]=temp;
				right++;	
			}
			left++;			
		}
    }
}