package coding_test.programmers;

// https://programmers.co.kr/learn/courses/30/lessons/12953
public class leastCommonMultiple {

    public int solution(int[] arr) {
        int answer = 0;
        /*
        가장 큰 값을 찾아서 그 값의 공배수로 계속 비교
        */

        int max = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) max = arr[i];
        }

        int multiple = 0;

        boolean end = false;
        while(!end) {
            multiple = multiple + max;
            int count = 0;
            for(int i : arr) {
                if((multiple % i) == 0) {
                    count++;
                }
            }
            if(count == arr.length) {
                end = true;
                answer = multiple;
            }

        }

        return answer;
    }

}
