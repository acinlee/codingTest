package backjun.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class N과M {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken(" "));
        int M = Integer.parseInt(st.nextToken(" "));

        boolean visit[] = new boolean[N];
        int[] arr = new int[M];
        int depth = 0;
        dfs(N, M, depth, arr, visit);

        br.close();
    }

    public static void dfs(int N, int M, int depth, int[] arr, boolean[] visit) {
        if (depth == M) {
            for (int val : arr) {
                System.out.print(val + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!visit[i]) {
                visit[i] = true;
                arr[depth] = i + 1;
                dfs(N, M, depth + 1, arr, visit);
                visit[i] = false;
            }
        }
    }
}
