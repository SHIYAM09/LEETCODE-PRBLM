class Solution {
    public int compress(char[] chars) {
        String res = "";
        int count = 0;
        char current = chars[0];
        for (int i = 0; i < chars.length; i++) {
            if (current == chars[i])
                count++;
            else {
                res = res + current;
                if (count != 1)
                    res += count;

                current = chars[i];
                count = 1;
            }

        }
        res = res + current;
        if (count != 1)
            res += count;
        for (int i = 0; i < res.length(); i++) {
            chars[i] = res.charAt(i);
        }

        return res.length();
    }
}