package backjun.setandmap;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class 문자열집합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken(" "));
        int M = Integer.parseInt(st.nextToken(" "));
        Map<String, String> map = new HashMap<>();
        int count = 0;

        for (int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            map.put(s, s);
        }

        for (int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            if (map.containsKey(s)) {
                count++;
            }
        }

        bw.write(String.valueOf(count));
        br.close();
        bw.close();
    }
}
