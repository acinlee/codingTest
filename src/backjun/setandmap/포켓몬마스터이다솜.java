package backjun.setandmap;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class 포켓몬마스터이다솜 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken(" "));
        int M = Integer.parseInt(st.nextToken(" "));
        Map<String, Integer> map = new HashMap<>();
        Map<Integer, String> map2 = new HashMap<>();

        for (int i=1; i<N+1; i++) {
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            map.put(s, i);
            map2.put(i, s);
        }

        for (int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            try {
                int a = Integer.parseInt(s);
                bw.write(map2.get(a));
            } catch (NumberFormatException e) {
                bw.write(String.valueOf(map.get(s)));
            }
            bw.write("\n");
        }

        br.close();
        bw.close();
    }
}
