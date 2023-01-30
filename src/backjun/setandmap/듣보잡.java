package backjun.setandmap;

import java.io.*;
import java.util.*;

public class 듣보잡 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken(" ")); // 듣도
        int M = Integer.parseInt(st.nextToken(" ")); // 보도

        Map<String, Integer> mapN = new HashMap<>();

        ArrayList<String> arr = new ArrayList<>();

        for (int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            mapN.put(s, i);
        }

        for (int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            if (mapN.containsKey(s)) {
                arr.add(s);
            }
        }

        Collections.sort(arr);

        bw.write(String.valueOf(arr.size()));
        bw.write("\n");
        for (String s : arr) {
            bw.write(s);
            bw.write("\n");
        }


        br.close();
        bw.close();
    }
}
