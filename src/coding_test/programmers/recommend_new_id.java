package coding_test.programmers;

import java.util.*;


//https://programmers.co.kr/learn/courses/30/lessons/72410
public class recommend_new_id {

    public static void main(String[] args) {



    }

    public String solution(String new_id) {
        String answer = "";

        new_id = step_one(new_id);
        new_id = step_two(new_id);
        new_id = step_three(new_id);
        new_id = step_four(new_id);
        new_id = step_five(new_id);
        new_id = step_six(new_id);
        new_id = step_seven(new_id);

        System.out.println(new_id);

        return new_id;
    }


    private String step_one(String new_id) {
        return new_id.toLowerCase();
    }

    private String step_two(String new_id) {
        char[] array = new_id.toCharArray();
        StringBuilder answer = new StringBuilder();
        // System.out.println("1--> " + new_id);
        for(char c : array) {
            if((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || c == '-' || c == '_' || c == '.') {
                answer.append(c);
            }
        }
        // System.out.println("1--> " + answer.toString());
        return answer.toString();
    }


    private String step_three(String new_id) {
        // StringBuilder answer = new StringBuilder(new_id);

        // new_id.replaceAll("..", ".");
        while(new_id.contains("..")) {
            new_id = new_id.replace("..", ".");
        }

        // return answer.toString();
        return new_id;
    }

    private String step_four(String new_id) {
        StringBuilder answer = new StringBuilder(new_id);

        while(answer.length() > 0 && answer.charAt(0) == '.') {
            answer.deleteCharAt(0);
        }

        while(answer.length() > 0 && answer.charAt(answer.length()-1) == '.') {
            answer.deleteCharAt(answer.length()-1);
        }

        return answer.toString();
    }

    private String step_five(String new_id) {
        if(new_id.length() == 0) {
            new_id = "a";
        }

        return new_id;
    }

    private String step_six(String new_id) {
        if(new_id.length() >= 16) {
            new_id = new_id.substring(0, 15);

            StringBuilder answer = new StringBuilder(new_id);
            while(answer.length() > 0 && answer.charAt(answer.length()-1) == '.') {
                answer.deleteCharAt(answer.length()-1);
            }

            return answer.toString();
        }

        return new_id;
    }


    private String step_seven(String new_id) {

        StringBuilder answer = new StringBuilder(new_id);

        while(answer.length() <= 2) {
            answer.append(answer.charAt(answer.length()-1));
        }

        return answer.toString();
    }

}
