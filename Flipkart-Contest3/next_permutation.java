class Solution 
{ 
    void swap(int i,int j,int[] nums){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    void reverse(int i,int[] nums){
        int j=nums.length-1;
        while(i<j){
            swap(i,j,nums);
            i+=1;
            j-=1;
        }
    }
    void nextPermutation(int nums[], int N)
	{    
	    // code here
	    int i=nums.length-2;
	    int j=nums.length-1;
        //finding first decreasing element from the last
	    while(i>=0){
	        if(nums[i]>=nums[i+1])
	            i-=1;
	        else
	            break;
	    }
	    if(i>=0){
            //finding the element just greater than the nums[i]
	        while(j>=0){
	            if(nums[j]<=nums[i])
	                j-=1;
	            else
	                break;
	       }
           //swap nums[i] and nums[j]
	       swap(i,j,nums);
	    }
        //reverse the next array from the index next of i to last 
        reverse(i+1,nums);
	}
} 