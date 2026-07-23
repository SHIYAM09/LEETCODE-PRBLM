class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> res = new ArrayList<String>();

       for(int w=0;w<words.length;w++)
       {
         String word = words[w];
         boolean flag=true;
        HashMap<Character,Character> mp = new HashMap<>();
        HashMap<Character,Character> mp1 = new HashMap<>();

        for(int i=0;i<word.length();i++)
        {
            if(!mp.containsKey(pattern.charAt(i)))
            {
                mp.put(pattern.charAt(i),word.charAt(i));
                if(mp1.containsKey(word.charAt(i)))
                {
                    flag = false;
                    break;
                }
                mp1.put(word.charAt(i),pattern.charAt(i));
            }
            else
            {
                if(mp.get(pattern.charAt(i))!=word.charAt(i) || mp1.get(word.charAt(i))!=pattern.charAt(i))
                {
                    flag = false;
                    break;
                }
            }
        }
        if(flag)
        res.add(word);
       }
       return res;
    }
}