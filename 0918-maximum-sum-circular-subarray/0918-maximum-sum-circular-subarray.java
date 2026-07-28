class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int totalsum = 0;
        int currentmax = 0;
        int currentmin = 0;
        int max = nums[0];
        int min = nums[0];

        for(int i = 0;i<nums.length;i++)
        {
            currentmax = Math.max(nums[i],currentmax + nums[i]);
            max = Math.max(currentmax,max);

            currentmin = Math.min(nums[i],currentmin + nums[i]);
            min = Math.min(currentmin,min);

            totalsum += nums[i];
        }
        if(max < 0)
        return max;
        
        return Math.max(max,totalsum - min);
    }
}