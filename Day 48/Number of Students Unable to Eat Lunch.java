class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < students.length; i++) {
            q.add(students[i]);
        }
        for (int i = sandwiches.length - 1; i >= 0; i--) {
            st.add(sandwiches[i]);
        }
        int n = students.length;
        while (n != 0) {
            if (q.isEmpty() || st.isEmpty()) {
                break;
            }
            if (q.peek() == st.peek()) {
                q.remove();
                st.pop();
                n = students.length;
            } else {
                int temp = q.peek();
                q.remove();
                q.add(temp);
            }
            n--;
        }
        return q.size();
    }
}