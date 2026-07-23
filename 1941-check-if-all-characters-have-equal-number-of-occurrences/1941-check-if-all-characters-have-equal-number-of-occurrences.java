class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer> mp = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<s.length()-1;i++)
        {
            if(!mp.get(s.charAt(i)).equals (mp.get(s.charAt(i+1))))
            return false;
        }
        return true;
    }
}