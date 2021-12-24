package coding_test.programmers;

// https://programmers.co.kr/learn/courses/30/lessons/12899
public class country_124_number {

    public String solution(int n) {
        String answer = "";
        StringBuilder builder = new StringBuilder("");

        while(n > 0) {
            int temp = n % 3;
            n /= 3;
            if(temp == 0) {
                temp = 4;
                n = n-1;
            }
            //answer = temp + answer;
            builder.insert(0, temp);
        }


        return builder.toString();
        //return answer;
    }

}
