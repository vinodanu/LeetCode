import java.util.*;

public class TopKFrequent {

    public static void main(String[] args) {
        int[] topK = topKFrequent(new int[]{1,2,1,2,1,3,1,3,2,3,3}, 2);
        System.out.println(Arrays.toString(topK));
    }

    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        for(int n : nums) {
            count.put(n, count.getOrDefault(n, 0)+ 1);
        }

        PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.comparingInt(count::get));

        for(int n : count.keySet()) {
            heap.offer(n);
            if (heap.size() > k) {
                heap.poll();
            }
        }
        int[] res = new int[k];
        for(int i = k-1; i >=0; i--) {
             res[i] = heap.poll();
        }
        return res;
    }
}
