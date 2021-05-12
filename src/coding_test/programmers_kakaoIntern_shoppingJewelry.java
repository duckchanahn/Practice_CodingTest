package coding_test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class programmers_kakaoIntern_shoppingJewelry {

    /*
    100점 만점에 15.6 점 받은 우수한 코드
     */

    public static void main(String[] args) {
        String[] gems;
        gems = new String[] {"A", "A", "S", "DIA", "DIA", "EMERALD", "SAPPHIRE", "DIA"};
        int[] answer;
        answer = solution(gems);
        System.out.println("result ==> " + answer[0] + " " + answer[1]);
        gems = new String[] {"AA", "AB", "AC", "AA", "AC"};
        answer = solution(gems);
        System.out.println("result ==> " + answer[0] + " " + answer[1]);
        gems = new String[] {"XYZ", "XYZ", "XYZ"};
        answer = solution(gems);
        System.out.println("result ==> " + answer[0] + " " + answer[1]);
        gems = new String[] {"ZZZ", "YYY", "NNNN", "YYY", "BBB"};
        answer = solution(gems);
        System.out.println("result ==> " + answer[0] + " " + answer[1]);
    }

    public static int[] solution(String[] gems) {
        int[] answer = new int[2];
        List<String> list = new ArrayList<>();

        int start = 0;
        int end = 0;

        int count = 0; // 새로운 단어가 추가될 때마다? -> 새로운 단어인지 파악할 방법이 있나


        Queue<String> queue = new LinkedList<>();
        for (String s : gems) {
            if (!list.contains(s)) list.add(s);
        }

//        for (String s : list) System.out.println("list -- " + s);

        int index = 0;

        while (count < list.size()) {
//            System.out.println("queue.toString() ==> " + queue.toString());
            if (!queue.contains(gems[index])) count++;
//            System.out.println("count ==> " + count);
//            System.out.println("gems[index] ==> " + gems[index]);
//            System.out.println("queue.peek() ==> " + queue.peek());
//            if (queue.peek() != gems[index]) {
//                queue.add(gems[index]);
//                end++;
//            } else {
//                System.out.println("queue1 ==> " + queue.toString());
                if (queue.peek() == gems[index]) {
                    queue.poll();
                    start++;
                }
                queue.add(gems[index]);
                end++;
//                System.out.println("queue2 ==> " + queue.toString());
                int index_temp = make_short(queue);
//                System.out.println("index_temp ==> " + index_temp);
//                System.out.println("queue3 ==> " + queue.toString());
                start = start + index_temp;
                for (int i = 0; i < index_temp; i++) {
                    queue.poll();
                }
//                System.out.println("queue4 ==> " + queue.toString());
//            }
//            System.out.println("check_end(queue, list) ==> " + check_end(queue, list));
            if(check_end(queue, list)) {
                answer[0] = ++start;
                answer[1] = end;
                return answer;
            }
            index++;
        }

//        for (String s : gems) {
//
//        }
//
//        for(int i = 0; i < gems.length; i++) {
////            if (queue.peek() == )
//        }

        return answer;
    }

    private static int make_short(Queue<String> queue) { // return 을 지운 갯수만큼 하면 위에서 다시 지우면 됨
        boolean end = false;
        int count = 0;
        Queue<String> temp = new LinkedList<>();
        for (String s : queue) temp.add(s);
        while(!end) {

            String peek = temp.poll();
            if (temp.contains(peek)) {
                count++;
            } else {
                end = true;
            }
        }
        return count;
    }

    private static boolean check_end(Queue<String> queue, List<String> list) {
        for (String s : list) {
            if (!queue.contains(s)) return false;
        }
        return true;
    }

}
