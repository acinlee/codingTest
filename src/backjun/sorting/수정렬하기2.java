package backjun.sorting;

import java.io.*;
import java.util.StringTokenizer;

public class 수정렬하기2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int lineNum = Integer.parseInt(st.nextToken());

        boolean[] arr = new boolean[2000001];

        for (int i=0; i<lineNum; i++) {
            st = new StringTokenizer(br.readLine());
            arr[Integer.parseInt(st.nextToken()) + 1000000] = true;
        }

        for (int i=0; i< arr.length; i++) {
            if (arr[i]) {
                bw.write(String.valueOf(i-1000000));
                bw.write("\n");
            }
        }

        br.close();
        bw.close();
    }
}
