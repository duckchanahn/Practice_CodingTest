package coding_test;

public class programmers_backRoad {

    /*
    재귀를 사용해도 정답은 나오지만 효율성 테스트에서 통과하지 못함
    -> 효율성이 DP가 더 좋은듯
    -> 왼쪽 && 위쪽에 한줄씩 추가하고 0으로 두면 if문이 줄어든다
     */
    
    public static void main(String args[]) {
        count = 0;
//        7, 4, [[2, 1], [2, 2], [2, 3], [4, 2], [4, 3], [4, 4], [6, 2], [6, 3]]), 0
//        System.out.println(solution(7, 4, new int[][] {{2, 2}, {2, 1}, {2, 3}, {4, 2}, {4, 3}, {4, 4}, {6, 2}, {6, 3}}));
        System.out.println(solution(100, 100, new int[][] {}));
    }

    private static int count;
    
    public static int solution(int m, int n, int[][] puddles) {
        int answer = 0;

        int[][] area = new int[n][m];

        for (int i = 0; i < puddles.length; i++) {
            area[puddles[i][1]-1][puddles[i][0]-1] = -1;
        }

//        answer = recursive(0, 0, area);


        area[0][0] = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (area[i][j] == -1) {
                    area[i][j] = 0;
                } else {
                    if (i == 0 && j == 0) {

                    } else if (i == 0) {
                        area[i][j] = area[i][j-1];
                    } else if (j == 0) {
                        area[i][j] = area[i-1][j];
                    } else {
                        area[i][j] = (area[i-1][j] + area[i][j-1])%1000000007;
                    }
                }
            }
        }

//        answer = ;

        return area[n-1][m-1]%1000000007;
    }

    private static int recursive(int x, int y, int[][] area) {
        if (area[x][y] == -1) return 0;

        if (area[x][y] > 0) {return area[x][y];}
        else {
            if (x == area.length - 1 && y == area[0].length - 1) {
                return 1;
            }
            if (y == area[0].length - 1) {
                area[x][y] = recursive(x + 1, y, area) % 1000000007;
                return area[x][y];
            }
            if (x == area.length - 1) {
                area[x][y] = recursive(x, y + 1, area) % 1000000007;
                return area[x][y];
            }
        }

        return recursive(x+1, y, area)%1000000007 + recursive(x, y+1, area)%1000000007;
    }


}
