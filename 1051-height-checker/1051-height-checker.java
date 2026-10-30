class Solution {
    public int heightChecker(int[] heights) {
        int[] arr=new int[heights.length];
        int temp=0;
        for (int i = 0; i < heights.length; i++) {
            arr[i] = heights[i];
        }
		for(int i=0;i<heights.length;i++) {
			for(int j=i+1;j<heights.length;j++) {
				if(heights[i]>heights[j]) {
					temp=heights[i];
					heights[i]=heights[j];
					heights[j]=temp;
				}
			}
		}
		
		int count=0;
		for(int k=0;k<arr.length;k++) {
			if(heights[k]!=arr[k]) {
				count++;
			}

		}
		return count;
	}
    }
