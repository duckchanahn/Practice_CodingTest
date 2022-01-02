package coding_test.programmers;


import java.util.*;

public class cant_finish {

    public String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String, Integer> map = new HashMap<>();

        for(String s : completion) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        for(String s : participant) {
            // System.out.println("s ==> " + s + " get ==> " + map.getOrDefault(s, 0));
            if(map.getOrDefault(s, 0) > 0) {
                map.put(s, map.get(s) - 1);
            } else {
                return s;
            }
        }

        return answer;
    }

}
