package level2;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class 무인도여행DFS {
    static int dx[] = {0, 0, -1, 1};
    static int dy[] = {-1, 1, 0, 0};

    static boolean visited[][];
    static char[][] map;
    static ArrayList<Integer> answer = new ArrayList<>();

    public class Pos{
        int x, y;

        public Pos(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public Integer[] solution(String[] maps) {
        visited = new boolean[maps.length][maps[0].length()];

        map = new char[maps.length][maps[0].length()];
        for(int i=0; i<maps.length; i++){
            for(int j=0; j<maps[0].length(); j++){
                map[i][j] = maps[i].charAt(j);
            }
        }

        for(int i=0; i<maps.length; i++){
            for(int j=0; j<maps[0].length(); j++){
                if(!visited[i][j] && maps[i].charAt(j) != 'X'){
                    //answer.add(dfs(new Pos(i, j)));
                }
            }
        }

        Collections.sort(answer);

        if(answer.size() == 0) {
            answer.add(-1);
        }

        return answer.toArray(new Integer[0]);
    }

//    public int dfs(Pos start){
//        if (start.x < 0 || start.y < 0 || start.x >= map.length || )
//        return
//    }

    @Test
    public void answer() {
        // given
        String[] test1 = {"X591X","X1X5X","X231X", "1XXX1"};
        String[] test2 = {"XXX","XXX","XXX"};
        Integer[] expectResult1 = {1, 1, 27};
        Integer[] expectResult2 = {-1};
        // when
        Integer[] result1 = solution(test1);
        Integer[] result2 = solution(test2);
        for (int a:result2) {
            System.out.println(a);
        }
        // then
        Assert.assertArrayEquals(result2, expectResult2);
    }
}
