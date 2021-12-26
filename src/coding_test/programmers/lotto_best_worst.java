package coding_test.programmers;

// https://programmers.co.kr/learn/courses/30/lessons/77484
public class lotto_best_worst {

    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {0, 0}; // 최저, 최고

        for(int lotto : lottos) {
            if(lotto == 0) {
                answer[0]++;
            } else {
                for(int win_num : win_nums) {
                    if(lotto == win_num) {
                        answer[0]++;
                        answer[1]++;
                    }
                }
            }
        }


        answer[0] = answer[0] > 1 ? 7 - answer[0] : 6;
        answer[1] = answer[1] > 1 ? 7 - answer[1] : 6;

        return answer;
    }

}
