package coding_test.programmers;

import java.util.*;

// https://programmers.co.kr/learn/courses/30/lessons/42626
public class more_spicy {

    public int solution(int[] scoville, int K) {

        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for(int i : scoville) heap.add(i);

        return this.getAnswer(heap, K);
    }

    private int getAnswer(PriorityQueue<Integer> heap, int K) {
        int answer = 0;

        while(heap.peek() < K) {

            if(heap.size() < 2) return -1;

            int first = heap.poll();
            int second = heap.poll();

            heap.add(first + (second * 2));
            answer++;
            // System.out.println(answer);
        }

        return answer;
    }

}
