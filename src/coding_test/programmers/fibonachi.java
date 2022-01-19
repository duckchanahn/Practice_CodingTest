package coding_test.programmers;

public class fibonachi {

    public int solution(int n) {
        int answer = 0;

        if(n == 0) return 1;
        if(n < 3) return 1;

        int prev = 1;
        int prev_two = 1;

        for(int i = 3; i <= n; i++) {
            answer = prev + prev_two;
            prev_two = prev % 1234567;
            prev = answer % 1234567;

        }

        return answer % 1234567;
    }

}
