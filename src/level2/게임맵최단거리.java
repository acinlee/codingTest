package level2;
import java.util.*;

public class 게임맵최단거리 {

    class Solution {
        public int solution(int[][] maps) {
            int n = maps.length;
            int m = maps[0].length;
            int[] dx = {-1, 1, 0, 0};
            int[] dy = {0, 0, -1, 1};

            Queue<int[]> q = new LinkedList<>();
            boolean[][] visited = new boolean[n][m];

            q.offer(new int[]{0, 0, 1}); // 시작 지점 (0, 0)에서 시작하므로 1부터 시작
            visited[0][0] = true;

            while (!q.isEmpty()) {
                int[] cur = q.poll(); // -> 0,0,1
                int x = cur[0];
                int y = cur[1];
                int dist = cur[2];

                if (x == n-1 && y == m-1) { // 목적지에 도달한 경우
                    return dist;
                }

                for (int i = 0; i < 4; i++) { // 상하좌우 이동
                    int nx = x + dx[i];
                    int ny = y + dy[i];

                    if (nx >= 0 && nx < n && ny >= 0 && ny < m && !visited[nx][ny] && maps[nx][ny] == 1) {
                        visited[nx][ny] = true;
                        q.offer(new int[]{nx, ny, dist+1});
                    }
                }
            }

            return -1; // 목적지에 도달하지 못한 경우
        }
    }
}
