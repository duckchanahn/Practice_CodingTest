package coding_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class programmers_1830_retry2 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("result ==> " + " " + solution(bf.readLine()));

        System.out.println("A BBBB CC D D D" + " / " + solution("aAaBbBbBbBcCCcDdDdD"));
        System.out.println("HELLO" + " / " + solution("aHELLOa"));
        System.out.println("A A A A AA" + " / " + solution("AAAAxAbAx"));
        System.out.println("HELLO" + " / " + solution("aHbEbLbLbOa"));
        System.out.println("HELLO WORLD" + " / " + solution("HaEaLaLaObWORLDb"));
        System.out.println("SIGONG J O A" + " / " + solution("SpIpGpOpNpGJqOqA"));
        System.out.println("A" + " / " + solution("A"));
        System.out.println("H E L L O W O R L D" + " / " + solution("HELLOWORLD"));
        System.out.println("HELLO WORLD" + " / " + solution("aHbEbLbLbOacWdOdRdLdDc"));
        System.out.println("HELL O WORLD" + " / " + solution("HaEaLaLObWORLDb"));
        System.out.println("A A A" + " / " + solution("AAA"));
        System.out.println("HELLOWORLD" + " / " + solution("aHELLOWORLDa"));
        System.out.println("A A A B A BBBB C BBBB C BB GG G G G RRRRRR"
                + " / " + solution("AAAaBaAbBBBBbCcBdBdBdBcCeBfBeGgGGjGjGRvRvRvRvRvR"));
        System.out.println("I A M" + " / " + solution("aIaAM"));
        System.out.println("AO" + " / " + solution("bAaOb"));
        System.out.println("invalid" + " / " + solution("a"));
        System.out.println("invalid" + " / " + solution("Aa"));
        System.out.println("invalid" + " / " + solution("aA"));
        System.out.println("invalid" + " / " + solution("HaEaLaLaOWaOaRaLaD"));
        System.out.println("invalid" + " / " + solution("abHELLObaWORLD"));
        System.out.println("invalid" + " / " + solution("aHELLOa bWORLDb"));
        System.out.println("invalid" + " / " + solution("TxTxTxbAb"));
        System.out.println("invalid" + " / " + solution("bTxTxTaTxTbkABaCDk"));
        System.out.println("invalid" + " / " + solution("baHELLOabWORLD"));
        System.out.println("invalid" + " / " + solution("A B"));
        System.out.println("AAAA BBBB" + " / " + solution("AxAxAxABcBcBcB"));
        System.out.println("BB A" + " / " + solution("oBBoA"));
        System.out.println("AAAA" + " / " + solution("AxAxAxA"));
        System.out.println("HELLO WORLD SIGONG J O A GWFD GWL BB A A A AAAA A"
                + " / " + solution("HaEaLaLaObWORLDbSpIpGpOpNpGJqOqAdGcWcFcDdeGfWfLeoBBoAAAAxAxAxAA"));
        System.out.println("BA DE A E EEEE" + " / " + solution("aBcAadDeEdvAvlElmEEEEm"));
        System.out.println("A A A B B B" + " / " + solution("AcAcABaBaB"));
        System.out.println("GWFD GWL" + " / " + solution("aGbWbFbDakGnWnLk"));
        System.out.println("X XX X" + " / " + solution("XcXbXcX"));
        System.out.println("invalid" + " / " + solution("aCaCa"));
        System.out.println("invalid" + " / " + solution("AxAxAxAoBoBoB"));
//        System.out.println("A"+ " / " + solution("aaA"));
//        System.out.println("A"+ " / " + solution("Aaa"));
        System.out.println("invalid" + " / " + solution("xAaAbAaAx"));
        System.out.println("invalid" + " / " + solution("AsCsWsQsQsEEEEEEEEeEeEe"));
        System.out.println("A B C D E F GH" + " / " + solution("ABCaDaEFGbH"));
        System.out.println("A B B B AAA" + " / " + solution("aAaBBBcAeAeAc"));
        System.out.println("A B C DEF H I" + " / " + solution("ABCbDaEaFbHI"));
        System.out.println("invalid" + " / " + solution("AacacaA"));
        System.out.println("invalid" + " / " + solution("AaBcBcBcBcB"));
        System.out.println("invalid" + " / " + solution("aAAA"));
        System.out.println("invalid" + " / " + solution("AAAa"));
        System.out.println("invalid" + " / " + solution("aAbBBbAa"));
        System.out.println("invalid" + " / " + solution("aAbBBbAa"));
        System.out.println("invalid" + " / " + solution("aAAbBbAAa"));
        System.out.println("invalid" + " / " + solution("aAcAbAbAcAcAcAa"));
        System.out.println("invalid" + " / " + solution("acAcAcAa"));
        System.out.println("invalid" + " / " + solution("aAcAcAca"));
        System.out.println("A AAA A" + " / " + solution("AdAeAeAdA"));
        System.out.println("invalid" + " / " + solution("dAAeAd"));
        System.out.println("invalid" + " / " + solution("dAeAAd"));
        System.out.println("ABA" + " / " + solution("cAbBbAc"));
        System.out.println("invalid" + " / " + solution("AbbA"));
        System.out.println("invalid" + " / " + solution("aAaaBa"));
        System.out.println("A B" + " / " + solution("aAacBc"));
        System.out.println("A B" + " / " + solution("AB"));
        System.out.println("A B" + " / " + solution("AcBc"));
        System.out.println("A B" + " / " + solution("aAaB"));
        System.out.println("AAAA BBBB" + " / " + solution("aAbAbAbAacBdBdBdBc"));
        System.out.println("AAAA BBBB" + " / " + solution("AbAbAbABdBdBdB"));
        System.out.println("AAAA BBBB" + " / " + solution("AbAbAbAcBBBBc"));
        System.out.println("AAAA BBBB" + " / " + solution("aAbAbAbAaBdBdBdB"));
        System.out.println("AAAA BBBB" + " / " + solution("aAbAbAbAacBBBBc"));
        System.out.println("AAAA BBBB" + " / " + solution("aAAAAaBdBdBdB"));
        System.out.println("AAAA BBBB" + " / " + solution("aAAAAacBBBBc"));
        System.out.println("AAAA BBBB" + " / " + solution("aAAAAaBdBdBdB"));
        System.out.println("AAAA BBBB" + " / " + solution("aAAAAacBdBdBdBc"));
        System.out.println("AAAA BBBB" + " / " + solution("aAAAAaBdBdBdB"));
        System.out.println("AAAA BBBB" + " / " + solution("AbAbAbAcBdBdBdBc"));
        System.out.println("AAAA BBBB" + " / " + solution("aAAAAaBdBdBdB"));
        System.out.println("IM M M" + " / " + solution("IaMMbMb"));
        System.out.println("invalid" + " / " + solution("AaAaAabBBb"));
        System.out.println("A A AA" + " / " + solution("AaAaAcA"));
        System.out.println("A B" + " / " + solution("aAabBb"));
        System.out.println("B HEE" + " / " + solution("bBbcHdEdEc"));
        System.out.println("AA A" + " / " + solution("AaAA"));
        System.out.println("J OOO A" + " / " + solution("JaOOOaA"));
        System.out.println("J O O O A" + " / " + solution("aJaOOOcAc"));
        System.out.println("I AM" + " / " + solution("IaAMa"));
        System.out.println("I A M" + " / " + solution("aIaAM"));
        System.out.println("SIGONG J OOO A" + " / " + solution("SpIpGpOpNpGJqOOOqA"));
        System.out.println("invalid" + " / " + solution("AxAxAxAoBoBoB"));
        System.out.println("HELLO WORLD" + " / " + solution("HaEaLaLaOWbObRbLbD"));
        System.out.println("AAAA B B B" + " / " + solution("AxAxAxABoBoB"));
        System.out.println("B" + " / " + solution("aBa"));
        System.out.println("invalid" + " / " + solution("baHELLOabWORLD"));
        System.out.println("invalid" + " / " + solution("aAbAba"));
        System.out.println("AO" + " / " + solution("bAaOb"));
        System.out.println("A A A B B B BB" + " / " + solution("AAAaBaBBBbB"));
    }

    public static String solution(String sentence) throws IOException {
        String answer = "";

        /*
        규칙 1. 소문자가 단어 사이사이 있을 경우
        규칙 2. 소문자가 단어 앞 뒤에 있을 경우

        소문자가 1 or 3이상 일 경우 규칙 1
        소문자가 2일 경우 규칙 2
        ++ 2개 안에 2개가 있을 경우 규칙 1 2 한번씩으로 판단 가능
        --> 갯수로 파악 x

        map으로 소문자랑 각 소문자 개수 파악
        2인 거 부터 처리 (2인거 처리할 때 안에 같이 처리
        -> 남은 애들 (1 or 3이상) 처리?



        소문자를 없애는 게 목표,
        소문자를 없애면서 규칙에 맞는지 확인하고, 단어 사이사이 띄어쓰기를 해야됨

        규칙에 맞는지 확인하는 함수
        1. 한 단어에 하나의 규칙이 한번 적용됐는지
        

        띄어쓰기 + 삭제하는 함수



         */

        Map<Character, Integer> map = new HashMap<>();
        for (char c : sentence.toCharArray()) {
            if (Character.isLowerCase(c))
                map.put(c, map.getOrDefault(map.get(c), 0) + 1);
        }

        Set<Character> set = new HashSet<>(map.keySet());

        StringBuilder builder = new StringBuilder(sentence);

        boolean end = false;
        int index = 0;

        while (!end) {



            if (index > builder.length()-1) {
                end = true;
            }
            index++;
        }

        return answer;
    }
}