class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> res = new ArrayList<>();
        genpara(res,0,0,"",n);
        return res;
    }
    public void genpara(ArrayList<String> res,int left,int right,String s,int n)
    {
        if(s.length() == n*2)
        {
            res.add(s);
            return;
        }
        if(left < n)
        {
            genpara(res,left + 1,right,s + "(",n);
        }
        if(right < left)
        {
            genpara(res,left,right + 1,s + ")",n);
        }
    }
}