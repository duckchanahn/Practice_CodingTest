package coding_test.programmers;

import java.util.ArrayList;
import java.util.List;

public class compress_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder b = new StringBuilder("abcdef");
        System.out.println(b.append("1"));
	}
	
	int max_length_split;
    
    public int solution(String s) {
        int answer = 0;
        this.max_length_split = s.length()/2;
        
        StringBuilder b = new StringBuilder("abcde");
        b.append("1");
        
        System.out.println();
        
        return answer;
    }

    
private int split(StringBuilder builder, int length) {
        
        /*
        length 기준으로 자르기
        -> 토막 애들 서로 비교
        -> 하나로 합치기
        -> 길이 비교
        */
        
        List<String> split_list = new ArrayList<>();
        int index = 0;
        while(index < builder.length()-length) {
            split_list.add(builder.substring(index, index+length));
            index += length;
        }
        
        if(index < builder.length()) {
            split_list.add(builder.substring(index, builder.length()));
        }
        
        for(String s : split_list) {
            
        }
        
        builder.append("1");
        
        System.out.println(builder.toString());
                         
        return 0;
    }
    
}
