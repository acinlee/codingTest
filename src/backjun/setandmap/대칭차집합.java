package backjun.setandmap;

import java.io.*;
import java.util.*;

public class 대칭차집합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken(" "));
        int B = Integer.parseInt(st.nextToken(" "));

        Set<Integer> integerSet = new HashSet<>();

        st = new StringTokenizer(br.readLine());
        for (int i=0; i<A; i++) {
            int num = Integer.parseInt(st.nextToken(" "));
            integerSet.add(num);
        }

        st = new StringTokenizer(br.readLine());
        for (int i=0; i<B; i++) {
            int num = Integer.parseInt(st.nextToken(" "));
            if (integerSet.contains(num)){
                integerSet.remove(num);
            } else {
                integerSet.add(num);
            }
        }

        bw.write(String.valueOf(integerSet.size()));
        br.close();
        bw.close();
    }
}
