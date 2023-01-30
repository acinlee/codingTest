package backjun.bruteforce;

import java.io.*;
import java.util.StringTokenizer;

public class 덩치 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int peopleCount = Integer.parseInt(st.nextToken());
        int[][] arr = new int[peopleCount][2];
        int[] result = new int[peopleCount];

        for (int i=0; i<peopleCount; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        for (int i=0; i<peopleCount; i++) {
            int count = 1;
            for (int j=0; j<peopleCount; j++) {
                if ((arr[j][0] > arr[i][0]) && (arr[j][1] > arr[i][1])){
                    count += 1;
                }
            }
            result[i] = count;
        }

        for (int i=0; i<result.length; i++) {
            bw.write(String.valueOf(result[i]));
            bw.write(" ");
        }

        br.close();
        bw.close();
    }
}
