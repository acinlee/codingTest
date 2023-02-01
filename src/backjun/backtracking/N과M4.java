package backjun.backtracking;

import java.io.*;
import java.util.StringTokenizer;

public class N과M4 {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken(" "));
        int M = Integer.parseInt(st.nextToken(" "));
        int arr[] = new int[M];
        boolean visit[] = new boolean[M];

        dfs(N, M, 0, arr, visit);

        br.close();
        bw.close();
    }

    public static void dfs(int N, int M, int depth, int[] arr, boolean[] visit) throws IOException {
        if (depth == M) {
            for (int a : arr) {
                bw.write(a + " ");
            }
            bw.write("\n");
        }

        for (int i=0; i<N; i++) {
            if (!visit[depth]) {
                visit[depth] = true;
                arr[depth] = i+1;
                dfs(N, M, depth+1, arr, visit);
                visit[depth] = false;
            }
        }
    }
}
