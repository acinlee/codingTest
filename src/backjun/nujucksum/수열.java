package backjun.nujucksum;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class 수열 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int arr[] = new int[N];
        ArrayList<Integer> temArr = new ArrayList<>();

        st = new StringTokenizer(br.readLine());
        for (int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i<N-K+1; i++) {
            int sum = 0;
            for (int j=i; j<i+K; j++) {
                sum += arr[j];
            }
            temArr.add(sum);
        }

        Collections.sort(temArr);

        bw.write(String.valueOf(temArr.get(temArr.size()-1)));
        br.close();
        bw.close();
    }
}
