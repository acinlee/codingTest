package backjun.setandmap;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class 숫자카드 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int sangun = Integer.parseInt(st.nextToken());
        Map<Integer, Integer> sangunCardMap = new HashMap<>();

        st = new StringTokenizer(br.readLine());
        for (int i=0; i<sangun; i++) {
            int num = Integer.parseInt(st.nextToken(" "));
            sangunCardMap.put(num, num);
        }

        st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[M];

        st = new StringTokenizer(br.readLine());
        for (int i=0; i<M; i++) {
            int num = Integer.parseInt(st.nextToken(" "));
            arr[i] = num;
        }

        for (int i=0; i<arr.length; i++) {
            if (sangunCardMap.containsKey(arr[i])){
                bw.write("1");
            } else {
                bw.write("0");
            }
            bw.write(" ");
        }

        br.close();
        bw.close();
    }
}
