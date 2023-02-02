package backjun.backtracking;

import java.io.*;
import java.util.*;

public class NQueen {
    private static int N;
    private static int count = 0;
    private static boolean[][] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        arr = new boolean[N][N];

        dfs(0, 0,0);

        bw.write(String.valueOf(count));
        br.close();
        bw.close();
    }

    private static void dfs(int row, int col, int depth) {
        if (depth == N) {
            int resultCount = 0;
            for (int i=0; i<N; i++) {
                for (int j = 0; j < N; j++) {
                    if (arr[i][j]) {
                        resultCount += 1;
                    }
                }
            }
            if (resultCount == N) {
                count++;
            }
            return;
        }

        for (int i=row; i<N; i++) {
            for (int j=col; j<N; j++) {
                if (i == row && j == col) {
                    arr[i][j] = true;
                } else if (i == row || j == col || Math.abs(row-col) == Math.abs(i-j) || Math.abs(row+col) == Math.abs(i+j)) {
                } else {
                    arr[i][j] = true;
                    dfs(i, j, depth+1);
                    arr[i][j] = false;
                }
            }
        }
    }
}
