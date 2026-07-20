class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> mp = new HashMap<Character,Integer>();

        mp.put('I',1);
        mp.put('V',5);
        mp.put('X',10);
        mp.put('L',50);
        mp.put('C',100);
        mp.put('D',500);
        mp.put('M',1000);
        char[] arr= s.toCharArray();

        int res=0;
        for(int i=0;i<arr.length;i++)
        {
            char c = arr[i];
            int val = mp.get(c);
            if(i<arr.length-1 && val < mp.get(arr[i+1]))
            {
                res = res-val;
            }
            else
            res = res + val;
        }
        return res;
    }
}