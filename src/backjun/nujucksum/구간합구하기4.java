package backjun.nujucksum;

import java.io.*;
import java.util.StringTokenizer;

public class 구간합구하기4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int arr[] = new int[N+1];

        st = new StringTokenizer(br.readLine());
        for (int i=1; i<N+1; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (i == 1) {
                arr[i] = num;
            } else {
                arr[i] = num + arr[i-1];
            }
        }

        for (int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            bw.write(String.valueOf(sectionSum(arr, a, b)));
            bw.write("\n");
        }

        br.close();
        bw.close();
    }

    public static int sectionSum(int arr[], int a, int b) {
        int result = arr[b] - arr[a-1];
        return result;
    }
}
