class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for(String s : operations)
        {
            if(s.equals("C"))
            {
                st.pop();
            }
            else if(s.equals("D"))
            {
                    st.push(2 * st.peek());
            }
            else if(s.equals("+"))
            {
                int num1 = st.peek();
                st.pop();
                int num2 = st.peek();
                st.push(num1);
                st.push(num1 + num2);
            }
            else{
                st.push(Integer.parseInt(s));
            }
        }
        int totalSum = 0;
        while(!st.isEmpty())
        {
            totalSum += st.peek();
            st.pop();
        }
        return totalSum;
    }
}