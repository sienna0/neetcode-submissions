class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int stone : stones) {
            heap.offer(0 - stone);
        }

        while (heap.size() > 1) {
            int x = heap.poll();
            int y = heap.poll();

            if (x != y) {
                heap.offer(0 - Math.abs(x - y));
            }
        }

        if (heap.size() != 0) {
            return Math.abs(heap.poll());
        }

        return 0;
    }
}
