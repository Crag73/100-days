class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int n = deck.length;
        Queue<Integer> index = new LinkedList<>();
        for (int i=0; i<n;i++) {
            index.add(i);
        }
        Arrays.sort(deck);
        int[] ans = new int[n];
        for (int card:deck) {
            ans[index.poll()] = card;
            if (!index.isEmpty()) {
                index.add(index.poll());
            }
        }
        return ans;
    }
}