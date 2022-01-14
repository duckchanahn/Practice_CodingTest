package test;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class main {

    public static void main(String[] args){
        System.out.println("start");
//        List<? extends Object> list_extends = new List<? extends Object>();
//        list_extends.add("Hello, generics!");

        List<Object> list_object;
        System.out.println("end");

        String s = "aaa";
        int length = s.length();

        List<Integer> split_length = new ArrayList<>();
        for(int i = 1; i <= length/2; i++) {
            length%i == 0 ? split_length.add(i) : so;
        }

        System.out.println();

    }


    @Test
    public void 기능_테스트() {



    }

}
