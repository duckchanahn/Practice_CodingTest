package coding_test.programmers;

public class skill_tree {

    public int solution(String skill, String[] skill_trees) {

        int answer = 0;

        StringBuilder builder;
        char[] prev = skill.toCharArray();

        for(String skill_tree : skill_trees) {
            builder = new StringBuilder(skill_tree);
            int index = -2;
            boolean correct = true;
            // System.out.println();
            for(char c : prev) {

                // System.out.println(builder.indexOf(c+""));

                if(index > builder.indexOf(c+"") && builder.indexOf(c+"") != -1) correct = false;
                if(index == -1 && builder.indexOf(c+"") > -1) correct = false;
                index = builder.indexOf(c+"");
            }
            // System.out.println(correct);
            if(correct) answer++;
        }

        return answer;
    }

}
