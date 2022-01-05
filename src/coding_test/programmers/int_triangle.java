package coding_test.programmers;

public class int_triangle {

    private int answer;
    private int max_height;

    public int solution(int[][] triangle) {
        answer = 0;
        max_height = triangle.length;

        // dfs(triangle, 0, 0, 0); // dfs는 효율성 통과하지 못함

        return dp(triangle);
    }


    private int dp(int[][] triangle) {
        int[][] max_triangle = (int[][]) triangle.clone();

        for(int height = max_height-2; -1 < height; height--) {
            for(int index = 0; index < triangle[height].length; index++) {
                max_triangle[height][index] = triangle[height][index]
                        + Math.max(triangle[height+1][index], triangle[height+1][index+1]);
            }

        }

        return max_triangle[0][0];

    }

    private void dfs(int[][] triangle, int height, int index, int sum) {
        // System.out.println("높이 --> " + height + "  index --> " + index);
        if(height < max_height){
            int total_sum = sum + triangle[height][index];
            dfs(triangle, height+1, index, total_sum);
            dfs(triangle, height+1, index+1, total_sum);
        } else{
            answer = Math.max(answer, sum);
        }

    }

}
