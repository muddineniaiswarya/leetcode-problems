class Solution {
    public int[] runningSum(int[] nums) {
       // nums=[1,2,3,4];
		int[] b=new int[nums.length];
		b[0]=nums[0];
		for(int i=1;i<nums.length;i++){
		      b[i]=b[i-1]+nums[i];
		     
		} 
       return b;
    }
}