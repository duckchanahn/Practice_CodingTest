package coding_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class programmers_1830_retry {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("result ==> " + solution(bf.readLine()));
    }

    public static String solution(String sentence) throws IOException {
        String answer = "";
        // 테스트케이스 + 질문하기 예제 모두 통과되는데 제출은 안됨;;


        /*
     앞에서 거를 것 : 공백 포함 -> 완료
         규칙1 : 처음과 끝 -> 첫 문자의 다음, 끝 문자의 앞은 대문자
         규칙2 : 글자 사이사이 -> 모든 소문자의 앞 뒤는 대문자

         추가규칙 : 한 단어에 같은 규칙은 여러번 x

         --> 글자는 무조건 1개 or 2개 or 3개이상 -> 1 or 3 이상 : 규칙 2, 2 : 규칙 1

         function
            1. 소문자 갯수 구하는 함수 -
                count_char
            2. 앞 & 뒤 혹은 앞 | 뒤 대문자 확인 -
                check_AZ
                    if 2 : 앞의 뒤, 뒤의 앞,
                    else : 앞뒤
            3. 한 문자에 같은 규칙이 있는지 판단
                check_only
                    if 2 : 사이에 소문자가 1개 이하인자
                    else : indexof와 lastindexof 사이에 다른 문자가 있는지
            4. 1~3 했을 때 invalid가 아닐 경우 문자열 수정하기
                made_answer
                    if 2 : 앞 뒤 둘 다 replace(" ")
                    else : 소문자 다 지우고 첫 인덱스 앞을 " " + 첫 인덱스, 마지막 인덱스 뒤를 마지막 인덱스 + " "
            finally -
                공백 여러개 다 하나로 치환
                    replace(" +", " ")
                    맨 앞 맨 뒤 공백 삭제

        */

        if (sentence.contains(" ")) return "invalid";
        StringBuilder builder = new StringBuilder(sentence);

        boolean end = false;
        int index = 0;

        while (!end) {

            if (Character.isLowerCase(builder.charAt(index))) {
                char key = builder.charAt(index);

                int count = count_char(builder, key);

//                if (count == 1) {
                    if(check_AZ(builder, index, count)) {
                        if (check_only(builder, index, count)) {
                            made_answer(builder, index, count);
                        } else {
                            return "invalid";
                        }
                    } else {
                        return "invalid";
                    }
//                } else if (count == 2) {
//                    if(check_AZ(builder, index, count)) {
//
//                    } else {
//                        return "invalid";
//                    }
//                } else {
//                    if(check_AZ(builder, index, count)) {
//
//                    } else {
//                        return "invalid";
//                    }
//                }
            }
            index++;
            if (index == builder.length()) end = true;
        }

        if (builder.charAt(0) == ' ') builder.deleteCharAt(0);
        if (builder.charAt(builder.length()-1) == ' ') builder.deleteCharAt(builder.length()-1);
        answer = builder.toString().trim().replaceAll(" +", " ");

        return answer;
    }

    private static int count_char(StringBuilder builder, char key) {
        int count = 0;

        for (int i = 0; i < builder.length(); i++) {
            if (builder.charAt(i) == key) count++;
        }

        return count;
    }

    private static boolean check_AZ(StringBuilder builder, int index, int count) {

        int index_first = index;
        int index_last = builder.lastIndexOf(builder.charAt(index)+"");

        if (count == 2) {
            if (Character.isUpperCase(builder.charAt(index_first+1))
                    && Character.isUpperCase(builder.charAt(index_last-1))) {
                return true;
            } else {
                return false;
            }
        } else {

            for (int i = 0; i < count; i++) {
                index_first = index + (i * 2);


                if (index_first == 0) {
                    if (!(Character.isUpperCase(builder.charAt(index_first+1)))) {
                        return false;
                    }
                } else if (index_first == builder.length()-1) {
                    if (!Character.isUpperCase(builder.charAt(index_first-1))) {
                        return false;
                    }
                } else {
                    if (!(Character.isUpperCase(builder.charAt(index_first - 1)) && Character.isUpperCase(builder.charAt(index_first + 1)))) {
                        return false;
                    }
                }

            }
        }
        return true;
    }

    private static boolean check_only(StringBuilder builder, int index, int count) {

        int index_first = index;
        int index_last = builder.lastIndexOf(builder.charAt(index)+"");

        if (count == 2) {
            char key = '0';
            for (int i = index_first+1; i < index_last; i++) {
                if (Character.isLowerCase(builder.charAt(i))) {

                    if (key == '0') {
                        key = builder.charAt(i);
                    } else if (builder.charAt(i) != key) {
                        return false;
                    }
                }
            }
        } else if (count > 2) {
            char key = builder.charAt(index);
            for (int i = 0; i < count; i++) {
                if (builder.charAt(index_first + (i*2)) != key) {
                    return false;
                }
            }
        }

        return true;
    }

    private static StringBuilder made_answer(StringBuilder builder, int index, int count) {

        int index_first = index;
        int index_last = builder.lastIndexOf(builder.charAt(index)+"");

        if (count == 2) {
            builder.replace(index_first, index_first+1, " ");
            builder.replace(index_last, index_last+1, " ");
        } else {

            builder.replace(index_last+1, index_last+2, builder.charAt(index_last+1) + " ");

            for (int i = count-1; i >-1; i--) {
                builder.deleteCharAt(index_first + (i*2));
            }

            builder.replace(index_first-1, index_first, " " + builder.charAt(index_first-1));
        }

        return builder;
    }
}
