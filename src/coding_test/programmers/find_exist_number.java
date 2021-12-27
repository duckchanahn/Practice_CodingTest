package coding_test.programmers;

// https://programmers.co.kr/learn/courses/30/lessons/86051
public class find_exist_number {

    public int solution(int[] numbers) {
        int answer = -1;

        int[] check = new int[10];

        for(int i = 0; i < check.length; i++) {
            check[i] = i;
        }

        for(int i : numbers) {
            check[i] = 0;
        }

        int sum = 0;
        for(int i : check) {
            sum += i;
        }

        return sum;
    }

}
