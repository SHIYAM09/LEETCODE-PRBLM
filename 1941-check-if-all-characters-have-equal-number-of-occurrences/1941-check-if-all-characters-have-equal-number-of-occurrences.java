class Solution {
    public boolean areOccurrencesEqual(String s) {
        int n = s.length();
        int count=0;
        HashMap<Character,Integer> mp = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<n-1;i++)
        {
            if(!mp.get(s.charAt(i)).equals (mp.get(s.charAt(i+1))))
            return false;
        }
        return true;
    }
}