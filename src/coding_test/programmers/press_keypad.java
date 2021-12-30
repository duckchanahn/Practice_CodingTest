package coding_test.programmers;

// https://programmers.co.kr/learn/courses/30/lessons/67256
public class press_keypad {

    public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();

        int[] left = {3, 0}; // *
        int[] right = {3, 2}; // #

        int[][] keypad = new int[12][2]; // -1
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                keypad[i * 3 + j + 1][0] = i;
                keypad[i * 3 + j + 1][1] = j;
            }
        }

        keypad[0][0] = 3; keypad[0][1] = 1;

        for(int i : numbers) {
            answer.append(press(keypad, left, right, hand, i));
        }

        return answer.toString();
    }

    private Character press(int[][] keypad, int[] left, int[] right, String hand, int key) {
        if(key == 1 || key == 4 || key == 7) {
            return setLeft(left, keypad[key]);
        } else if(key == 3 || key == 6 || key == 9) {
            return setRight(right, keypad[key]);
        } else {
            int left_length = check(keypad, left, key);
            int right_length = check(keypad, right, key);
            if(left_length < right_length) {
                return setLeft(left, keypad[key]);
            } else if(left_length > right_length) {
                return setRight(right, keypad[key]);
            } else {
                return hand.equals("right") ?
                        setRight(right, keypad[key]) : setLeft(left, keypad[key]);
            }
        }
        // return 'Q';
    }

    private Character setLeft(int[] hand, int[] key) {
        hand[0] = key[0];
        hand[1] = key[1];
        return 'L';
    }

    private Character setRight(int[] hand, int[] key) {
        hand[0] = key[0];
        hand[1] = key[1];
        return 'R';
    }

    private int check(int[][] keypad, int[] hand, int key) {
        return Math.abs(keypad[key][0] - hand[0]) +
                Math.abs(keypad[key][1] - hand[1]);
    }

}
