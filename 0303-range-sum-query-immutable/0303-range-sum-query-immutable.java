class NumArray {
private int res[];
    public NumArray(int[] nums) {
        res = new int[nums.length+1];
        res[0] = 0;
        for(int i = 1;i<=nums.length;i++)
        {
            res[i] = res[i-1] + nums[i-1];
        }
    }
    
    public int sumRange(int left, int right) {
        return res[right+1] - res[left];
    }
}
