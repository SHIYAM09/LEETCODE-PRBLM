class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> ran = new HashMap<>();
        HashMap<Character,Integer> mag = new HashMap<>();

        for(char c:ransomNote.toCharArray())
        {
            ran.put(c,ran.getOrDefault(c,0)+1);
        }
        for(char c:magazine.toCharArray())
        {
            mag.put(c,mag.getOrDefault(c,0)+1);
        }
        for(char c:ran.keySet())
        {
            if(mag.getOrDefault(c,0)<ran.get(c))
            return false;
        }
        return true;
    }
}