package backjun.geometry1;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class 네번째점 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();

        int x = 0;
        int y = 0;
        for (int i=0; i<3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            map.put(num, map.getOrDefault(num,0)+1);
            map2.put(num2, map2.getOrDefault(num2,0)+1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                x = entry.getKey();
            }
        }

        for (Map.Entry<Integer, Integer> entry : map2.entrySet()) {
            if (entry.getValue() == 1) {
                y = entry.getKey();
            }
        }

        bw.write(x + " " + y);
        br.close();
        bw.close();
    }
}
