class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        
        Set<String> bset=new HashSet<String>();
        for(String word:banned)
        {
            bset.add(word);
        }
        String ans= paragraph.toLowerCase().replaceAll("[^a-zA-Z0-9 ]", " ");
        String words[] = ans.split("\\s+");

        HashMap<String,Integer> mp = new HashMap<String,Integer>();
        String mostcom="";
        int max=0;
        for(String word:words)
        {
            if(word.isEmpty()||bset.contains(word))
            {
                continue;
            }
            int count=mp.getOrDefault(word,0)+1;
            mp.put(word,count);

            if(count>max)
            {
                max=count;
                mostcom=word;
            }
        }
        return mostcom;
    }
}