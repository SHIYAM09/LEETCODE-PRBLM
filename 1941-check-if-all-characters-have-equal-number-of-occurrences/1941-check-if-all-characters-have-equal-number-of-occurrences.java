class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer> mp = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
        }
        int target = mp.get(s.charAt(0));
        for(int freq:mp.values())
        {
            if(freq!=target)
            return false;
        }
        return true;
    }
}