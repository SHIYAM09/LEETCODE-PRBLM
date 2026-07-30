class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st = new Stack<>();
        int n = temperatures.length;
        int res[] = new int[n];
        for(int i = n - 1;i >= 0;i--)
        {
            while(!st.isEmpty() && temperatures[st.peek()] <= temperatures[i])
            {
                st.pop();
            }
            res[i] = !st.isEmpty() ? st.peek() - i : 0;
            st.push(i);
        }
        return res;
    }
}