class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        int res=0;
        for(int num:nums)
        {
            mp.put(num,mp.getOrDefault(num,0)+1);
        }
        for(int num:nums)
        {
            if(mp.get(num)==1)
            res=num;
        }
return res;
    }
}