package coding_test.programmers;

import java.util.*;

public class immigration {

    public long solution(int n, int[] times) {
        Arrays.sort(times);
        return binarySearch((long)n, times);
    }

    private long binarySearch(long n, int[] times) {
        long left = 1;
        long right = times[times.length-1] * n;
        long mid = 0;

        long answer = right;

        while(left <= right) {
            mid = (left + right) / 2;

            if(check_all(mid, times) >= n) {
                // answer = answer > mid ? mid : answer;
                answer = mid;
                right = mid-1;
            } else {
                left = mid+1;
            }
        }
        return answer;
    }

    private long check_all(long mid, int[] times) {
        long count = 0;
        for(int time : times) {
            count += mid / time;
        }
        return count;
    }

}
