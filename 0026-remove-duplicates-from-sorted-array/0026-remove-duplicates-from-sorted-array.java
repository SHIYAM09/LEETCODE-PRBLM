class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int i=0;
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for(int num:nums)
        {
            set.add(num);
        }
        for(int num:set)
        {
            nums[i++]=num;
        }
        return set.size();
    }
}