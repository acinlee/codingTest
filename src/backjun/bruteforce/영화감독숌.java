package backjun.bruteforce;

import java.io.*;
import java.util.StringTokenizer;

public class 영화감독숌 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());

        int count = 0;
        int result = 666;
        while (true) {
            String s = String.valueOf(result);
            if (s.contains("666")) {
                count++;
            }
            if (count == num) {
                break;
            }
            result++;
        }

        bw.write(String.valueOf(result));
        br.close();
        bw.close();
    }
}
