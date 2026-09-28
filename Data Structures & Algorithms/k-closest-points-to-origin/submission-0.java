class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparing(x -> x[0]));
        for (int[] point : points) {
            int dist = point[0] * point[0] + point[1] * point[1];
            pq.offer(new int[]{dist, point[0], point[1]});
        } 

        int[][] sol = new int[k][2];
        for (int i = 0; i < k; i++) {
            int[] point = pq.poll();
            sol[i][0] = point[1];
            sol[i][1] = point[2];
        }

        return sol;

    }
}
