package coding_test.programmers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class open_chatting {

    public static void main(String[] args) {

    }

    public String[] solution(String[] record) {
        List result = new ArrayList<String>();

        HashMap user = new HashMap<String, String>();

        for(String log : record) {
            String[] log_split = log.split(" ");
            if(!log_split[0].equals("Leave")) {
                // System.out.println(log_split[2]);
                user.put(log_split[1], log_split[2]);
            }
        }

        int index = 0;
        for(String log : record) {
            String[] log_split = log.split(" ");

            if(log_split[0].equals("Enter")) {
                result.add(user.get(log_split[1]) + "님이 들어왔습니다.");
            } else if(log_split[0].equals("Leave")) {
                result.add(user.get(log_split[1]) + "님이 나갔습니다.");
            }

            index++;
        }

        String[] answer = new String[result.size()];

        index = 0;
        for(int i = 0; i < result.size(); i++) {
            answer[i] = (String)result.get(i);
        }

        return answer;
    }

}
