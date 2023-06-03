class Solution {
    public int[] searchRange(int[] nums, int target) {
        int s=0,e=nums.length-1;
     //   int[] ans = new int[2];
        while(s<=e){
            int mid = (e+s)/2 ; 
            if(nums[mid] == target){
                int i=mid,j=mid;
                while( i>0 && nums[i-1] == target){
                    i--;
                }
                while( j < nums.length-1 && nums[j+1] == target){
                    j++;
                }
               return new int[] {i,j}; 
            }
            else if( nums[mid] < target ){
                s = mid+1;
            }
            else
                e = mid-1;
        }
        return new int[] {-1,-1};
    }
}