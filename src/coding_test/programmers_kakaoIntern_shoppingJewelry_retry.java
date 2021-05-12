package coding_test;

import java.util.*;

public class programmers_kakaoIntern_shoppingJewelry_retry {

    public static void main(String[] args) {
        String[] gems;
        gems = new String[] {"DIA", "RUBY", "RUBY", "DIA", "DIA", "EMERALD", "SAPPHIRE", "DIA"};
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
