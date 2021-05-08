package coding_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class programmers_1830 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("result ==> " + solution(bf.readLine()));
    }

        /*

        <메인>
        while 한글자씩 읽기
            if 소문자
                같은 소문자 인덱스를 가져오기
                판단(인덱스들(배열));

        <판단>

        한번 처리 된

        이미 처리가 된 소문자인지, 아니면 안된 소문자인지 파악해야하는데 이걸 어떻게 하지?

        Map<Character, List<Integer>> -> 별론데


        배열 인덱스들;
        status = !invalid
        1. 글자 사이에 다 있음 -> 인덱스들이 2씩 늘어날 것
            for int i : 배열 -> iter 말고 그냥 for
                if !첫문자 or !끝문자
                else if [i+1] != i * 2
                    invalid
        2. 처음과 끝
            if 배열.size == 2
                지우고 첫 인덱스.replace(" ")
        */

    public static String solution(String sentence) throws IOException {
        String answer = "";

        StringBuilder builder = new StringBuilder(sentence);

        List<Character> keyChar = new ArrayList<>(); // 같은 글자 여러개일 경우를 방지
        boolean end = false;
        int index = 0;

        if(builder.indexOf(" ") != -1) {
            return "invalid";
        }

        while (!end) {

            System.out.println(builder.toString());

            if(Character.isLowerCase(builder.charAt(index))) {
                if (keyChar.contains(builder.charAt(index))) {
                    return "invalid";
                }
                int count = findCount_char(builder, builder.charAt(index));
                if (count == 1) { // 하나일 경우 앞 뒤가 대문자면 그냥 지우기 -> 띄어쓰기 X
                    if (check_AZ(builder, index)) {
                        keyChar.add(builder.charAt(index));
                        builder.deleteCharAt(builder.indexOf(builder.charAt(index)+""));
                        if(index > 1) builder.replace(index-1, index, " " + builder.charAt(index-1));
                    } else {
                        return "invalid";
                    }
                } else if (count == 2) { // 두개일 경우 지우고 뒤에 띄어쓰기 // 띄어쓰기 하고나서 이걸 만나면 안되네
                    keyChar.add(builder.charAt(index));
//                    if (check_AZ(builder, index) && check_AZ(builder, builder.lastIndexOf(builder.charAt(index) + ""))) {
                    if (Character.isUpperCase(builder.charAt(builder.indexOf(builder.charAt(index) + "") + 1))
                                && Character.isUpperCase(builder.charAt(builder.lastIndexOf(builder.charAt(index) + "") -1))) {
                        builder.replace(builder.lastIndexOf(builder.charAt(index) + ""), builder.lastIndexOf(builder.charAt(index) + "")+1, " ");
                        builder.replace(index, index+1, " ");
                    } else {
                        return "invalid";
                    }
                } else if (count >= 3) { // 3보다 크면 앞 뒤 사이에 대문자 있는지 확인하고 멀쩡하면 그냥 지우기
                    int temp_int = (count-1)*2;
                    System.out.println("index ==>" + index + "count ==>" + count + "repalce ==> " + builder.charAt(index + temp_int + 1));
                    builder.replace(index + temp_int + 1, index + temp_int + 2, builder.charAt(index + temp_int + 1) + " ");
                    StringBuilder temp = builder;
                    for (int i = count-1; i > -1; i--) {
                        if (check_AZ(temp, index + i*2) && builder.charAt(index + i * 2) == builder.charAt(index)) {
                            temp.replace(temp.lastIndexOf(temp.charAt(index + i*2) + ""), temp.lastIndexOf(temp.charAt(index + i*2) + "")+1, "");
                        } else {
                            return "invalid";
                        }
                    }

                    if(index > 1) builder.replace(index-1, index, " " + builder.charAt(index-1));

                    builder = temp;
                }
            }

            index++; // 1일 경우 하면 안됨 -> 지우기 때문? 근데 어차피 지우는 기준이 다음 대문자니까 해도 될듯 오히려 효율적
                    // 2일 경우 지우고 플러스하면 어차피 중간에 대문자 있고 이거 넘겨도 되니까 상관 없을듯 오히려 효율적
                        // 2개일 경우는 무조건 앞뒤 규칙으로 판단
                        // 앞뒤 규칙이 2번 적용된 경우엔
                    // 3이상일 경우 -> 3개일 경우를 기준으로 3개 지우고 1 플러스하면 괜찮네
                    // 근데 한 단어에 같은 규칙 두번은 어떻게 하지 ->

            // 한 단어에 규칙이 2번 적용 된 경우를 어떻게 하지 -> 예제3번...?
                // 예제 3번을 어떻게 할지가 안떠오르는데 어쩌지..?
//            System.out.println("index ==>" + index);
//            System.out.println("length ==>" + builder.length());

            if (index > builder.length()-1) {
//                System.out.println("out ==>" + index);
                end = true;
            }
        }
        answer = builder.toString();
        System.out.println("answer ==> " + answer);


        answer = answer.trim().replaceAll(" +", " ");

        return answer;
    }



    public static int findCount_char(StringBuilder builder, char key){
        int count = 0;

        for (int i = 0; i < builder.length(); i++) {
            if (builder.charAt(i) == key) count++;
        }

        return count;
    }

    public static boolean check_AZ(StringBuilder builder, int index) {
        if (index == 0) {
            if (Character.isUpperCase(builder.charAt(index+1))) {
                return true;
            } else {
                return false;
            }
        } else if (index == builder.length()-1) {
            if (Character.isUpperCase(builder.charAt(index-1))) {
                return true;
            } else {
                return false;
            }
        }

        System.out.println("check_AZ  " + builder.charAt(index-1) + builder.charAt(index+1));
        System.out.println("front " + Character.isUpperCase(builder.charAt(index-1)));
        System.out.println("end " + Character.isUpperCase(builder.charAt(index+1)));
        System.out.println("&& " + (Character.isUpperCase(builder.charAt(index-1)) &&
                Character.isUpperCase(builder.charAt(index+1))));
        if ((Character.isUpperCase(builder.charAt(index-1)) &&
                Character.isUpperCase(builder.charAt(index+1)))) {
            return true;
        } else {
            return false;
        }
    }
//    AAAaBaAbBBBBbCcBdBdBdBcCeBfBeGgGGjGjGRvRvRvRvRvR
//    AAA B A BBBB C BBBB C BB GG G G G RRRRRR
}



