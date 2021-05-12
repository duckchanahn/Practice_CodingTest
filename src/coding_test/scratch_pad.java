package coding_test;

import java.util.LinkedList;
import java.util.Queue;

public class scratch_pad {

    public static void main(String args[]) {
        int i = 9;
        Queue<String> queue = new LinkedList<>();


        queue.add("!!");
        queue.add("@@");
        queue.add("##");

        test(queue);

        System.out.println(queue.toString());
    }

    private static void test(Queue<String> queue) {
        Queue<String> temp = queue;
        temp.poll();
    }

}
