class Solution {
    public String decodeString(String s) {
        Stack<Integer> numStack = new Stack<>();
        Stack<String> strStack = new Stack<>();

        int number = 0;
        String curr = "";

        for(char ch : s.toCharArray())
        {
            if(Character.isDigit(ch))
            {
                number = number * 10 + (ch - '0');
            }

            else if(ch == '[')
            {
                numStack.push(number);
                strStack.push(curr);

                number = 0;
                curr = "";
            }

            else if(ch == ']')
            {
                int repeat = numStack.pop();
                String prev = strStack.pop();

                String temp = "";
                for(int i = 0;i < repeat;i++)
                {
                    temp += curr;
                }

                curr = prev + temp;
             }
             
             else
             {
                curr += ch;
             }
        }
        return curr;
    }
}