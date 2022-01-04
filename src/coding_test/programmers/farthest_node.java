package coding_test.programmers;

import java.util.*;

// https://programmers.co.kr/learn/courses/30/lessons/49189
public class farthest_node {

    public int solution(int n, int[][] edge) {
        int answer = 0;

        boolean[] visit = new boolean[n+1];
        LinkedList<LinkedList<Integer>> relation = new LinkedList<>();
        for(int i = 0; i <= n; i++) {
            relation.add(new LinkedList<Integer>());
        }
        // int[][] relation = new int[n+1][n+1];

        for(int[] i : edge) {
            relation.get(i[0]).add(i[1]);
            relation.get(i[1]).add(i[0]);
        }

        // for(LinkedList<Integer> list : relation)
        //     System.out.println(list);
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        visit[1] = true;
        ArrayList<Integer> next = new ArrayList<>();

        boolean end = false;
        while(!end) {
            next = new ArrayList<>();
            while(!queue.isEmpty()) {
                int now = queue.poll();
                // System.out.println("\n");
                for(int i : relation.get(now)) {
                    if(!visit[i]) {
                        // for(int i = 0; i < relation.get(now).size(); i++) {
                        // if(!visit[i] && relation.get(now).poll()) {
                        // System.out.print(i + " ");
                        visit[i] = true;
                        next.add(i);
                    }
                }
                // System.out.println(next);
            }


            if(next.size() > 0) {
                answer = next.size();
                queue.addAll(next);
            } else {
                end = true;
            }
        }

        return answer;
    }

}
