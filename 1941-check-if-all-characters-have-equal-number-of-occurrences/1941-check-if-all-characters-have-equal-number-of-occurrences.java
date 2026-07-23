class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer> mp = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
        }
        HashSet<Integer> set=new HashSet<>(mp.values());
        return set.size()==1;
    }
}