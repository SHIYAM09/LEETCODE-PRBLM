class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> vis = new HashSet<Integer>();

        while(n!=0 && !vis.contains(n))
        {
            vis.add(n);
            int sum=0;
            while(n!=0)
            {
                int mod=n%10;
                sum+=mod*mod;
                n/=10;
            }
            if(sum==1)
            {
                return true;
            }
            else
            n=sum;
        }
        return false;
    }
}