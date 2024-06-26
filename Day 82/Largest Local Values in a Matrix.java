class Solution {
    class Pair {
        double ratio;
        int q;
        public Pair(double ratio, int q) {
            this.ratio = ratio;
            this.q = q;
        }
    }

    public double mincostToHireWorkers(int[] quality, int[] wage, int K) {
        PriorityQueue<Pair> minRatio = new PriorityQueue<Pair>(new Comparator<Pair>(){
            @Override
            public int compare(Pair a, Pair b) {
                return a.ratio < b.ratio? -1: 1;
            }
        });

        for (int i = 0; i < quality.length; i++) {
            double ratio =  wage[i] * 1.0 / quality[i];
            minRatio.offer(new Pair(ratio, quality[i]));
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        double minVal = Double.MAX_VALUE;
        int quantity = 0;

        while (!minRatio.isEmpty()) {
            Pair tmp = minRatio.poll();
            pq.offer(tmp.q);
            quantity += tmp.q;
            if (pq.size() > K) {
                quantity -= pq.poll();
            }

            if (pq.size() == K) {
                minVal = Math.min(minVal, tmp.ratio * quantity);
            }
        }
        return minVal;
    }
}