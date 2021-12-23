package coding_test.programmers;

import java.util.*;
//https://programmers.co.kr/learn/courses/30/lessons/42586
public class develop_function {

    public static void main(String[] args) {

    }

    private int index;
    private ArrayList<Integer> answer_list;

    public int[] solution(int[] progresses, int[] speeds) {
        index = 0;
        answer_list = new ArrayList<>();


        Queue<Integer> queue;

        while(index < progresses.length){


            this.excute(progresses, speeds);
            queue = new LinkedList<>();

            for(int i = index; i < progresses.length; i++)
                queue.add(progresses[i]);


            if (queue.size() < 1) return answer();

            int count = cd(queue);
            if(count > 0)
                answer_list.add(count);
        }



        return answer();
    }

    private int[] answer() {
        int[] answer = new int[answer_list.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = (int)answer_list.get(i);
        }
        return answer;
    }

    private int[] excute(int[] progresses, int[] speeds) {

        for(int i = index; i < progresses.length; i++) {
            progresses[i] += speeds[i];
        }
        return progresses;
    }

    private int cd(Queue<Integer> queue) {

        boolean end = false;
        int count = 0;

        while(!end) {

            if (queue.size() < 1) return -1;
            if (queue.size() == 1 && queue.peek() >= 100) {
                count++;
                index += count;
                return count;
            }

            if(queue.peek() < 100) {
                index += count;
                return count;
            } else {
                count++;
                queue.poll();
            }
        }
        return count;
    }
}
