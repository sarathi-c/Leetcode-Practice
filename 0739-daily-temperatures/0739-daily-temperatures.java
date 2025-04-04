class Solution {
    public int[] dailyTemperatures(int[] t) {
        int[] days = new int[t.length];
        Stack<Integer> st=new Stack<>();
        int[] a=new int[t.length];
        for(int i=0;i<t.length;i++){
            while(!st.isEmpty() && t[i]>t[st.peek()]){
                int prev=st.pop();
                a[prev]=i-prev;
            }
            st.push(i);
        }
        return a;
    }
}