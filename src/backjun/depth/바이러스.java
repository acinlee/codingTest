package backjun.depth;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 바이러스 {
    static int[][] network;
    static int[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int computer = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int networkCnt = Integer.parseInt(st.nextToken());
        network = new int[computer+1][computer+1];
        visited = new int[computer+1];

        // 네트워크 추가
        for (int i=0; i<networkCnt; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            // 네트워크 연결
            network[a][b] = 1;
            network[b][a] = 1;
        }



        bw.write(bfs(1)+"");
        br.close();
        bw.close();
    }

    public static int bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        int cnt = 0;

        visited[start] = 1;
        q.offer(start);

        while (!q.isEmpty()) {
            int x = q.poll();

            for (int i=1; i< network.length; i++) {
                if (network[x][i] == 1 && visited[i] != 1) {
                    q.offer(i);
                    visited[i] = 1;
                    cnt++;
                }
            }
        }

        return cnt;
    }
}
