class Solution {
    public boolean check(int[] nums) {
        int count =0;
        for(int i = 0;i<nums.length;i++)
        {
            if(nums[(i+1)%nums.length]<nums[i])
            {
                count++;
            }
        }
        return count<2;
    }
}