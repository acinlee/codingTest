package backjun.sorting;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 좌표정렬하기2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int lineNum = Integer.parseInt(st.nextToken());
        int[][] arr = new int[lineNum][2];

        for (int i=0; i<lineNum; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, (e1, e2) -> {
            if (e1[1] == e2[1]) {
                return e1[0] - e2[0];
            } else {
                return e1[1] - e2[1];
            }
        });


        for (int i=0; i<lineNum; i++) {
            bw.write(arr[i][0] + " " + arr[i][1]);
            bw.write("\n");
        }

        br.close();
        bw.close();
    }
}
