package backjun.geometry1;

import java.io.*;
import java.util.StringTokenizer;

public class 직사각형에서탈출 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken(" "));
        int y = Integer.parseInt(st.nextToken(" "));
        int w = Integer.parseInt(st.nextToken(" "));
        int h = Integer.parseInt(st.nextToken(" "));

        int count = Integer.MAX_VALUE;

        count = Math.min(count, Math.abs(x-w));
        count = Math.min(count, Math.abs(y-h));
        count = Math.min(count, Math.abs(x-0));
        count = Math.min(count, Math.abs(y-0));

        bw.write(String.valueOf(count));
        br.close();
        bw.close();
    }
}
