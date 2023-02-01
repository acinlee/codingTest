package backjun.backtracking;

import java.io.*;
import java.util.StringTokenizer;

public class N과M3 {

    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken(" "));
        int M = Integer.parseInt(st.nextToken(" "));

        int arr[] = new int[M];

        dfs(N, M, 0, arr);

        br.close();
        bw.close();
    }

    private static void dfs(int N, int M, int depth, int arr[]) throws IOException {
        if (depth == M) {
            for (int a : arr) {
                bw.write(a + " ");
            }
            bw.write("\n");
            return;
        }
        for (int i=0; i<N; i++) {
            arr[depth] = i+1;
            dfs(N, M,depth+1, arr);
        }
    }
}
