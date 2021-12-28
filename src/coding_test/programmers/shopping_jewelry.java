package coding_test.programmers;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.*;

public class shopping_jewelry {

//    https://programmers.co.kr/learn/courses/30/lessons/67258
    public static int[] solution(String[] gems) {
        int[] answer = {};

        Queue<String> queue = new LinkedList<>();
        HashSet<String> set = new HashSet<>(Arrays.asList(gems));
        HashMap<String, Integer> map = new HashMap<>();

        String peek;

//        boolean end = false;
        int first = 0;
        int last = Integer.MAX_VALUE;

        int temp_first = 0;
        for (int i = 0; i < gems.length; i++) {

            queue.add(gems[i]);

            map.put(gems[i], map.getOrDefault(gems[i], 0) + 1);

            boolean end = false;
            while (!end) {

                peek = queue.peek();

                if (map.get(peek) > 1) {
                    queue.poll();
                    temp_first++;
                    map.put(peek, map.get(peek) -1);
                } else {
                    end = true;
                }
            }

            if (map.size() == set.size() && last > queue.size()) {
                first = temp_first;
                last = queue.size();
            }

        }

        return new int[] {first+1, first+last};
    }

}
