class Solution {
    public String convertToTitle(int columnNumber) {
        String res = "";
        while(columnNumber!=0)
        {
            columnNumber--;
            res = (char)('A'+(columnNumber%26))+res;
            columnNumber/=26;
        }
        return res;
    }
}