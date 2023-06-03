class Solution {
    public int maxSubArray(int[] nums) {
        
        int sum=0, maxSum=Integer.MIN_VALUE;
        
        for(int i=0; i<nums.length; i++){
            
            sum = Math.max(sum+nums[i],nums[i]);
            maxSum = Math.max(sum,maxSum);
        }
        return maxSum;
}
}