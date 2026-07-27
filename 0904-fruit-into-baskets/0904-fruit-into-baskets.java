class Solution {
    public int totalFruit(int[] fruits) {
        int left = 0;
        int right = 0;
        int max = 0;
        HashMap<Integer,Integer> mp = new HashMap<>();
        while (right < fruits.length) {
            mp.put(fruits[right],mp.getOrDefault(fruits[right],0)+1);
            int pop = fruits[left];

            while (mp.size() > 2) {
               mp.put(fruits[left],mp.getOrDefault(fruits[left],0)-1);  
               if(mp.get(fruits[left]) <= 0)
                   mp.remove(fruits[left]);
               left++;          
            }
            max = Math.max(max, right - left + 1);
           right++;
        }
        return max;
    }
}