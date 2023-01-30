package backjun.geometry1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class 직각삼각형 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int x = Integer.MIN_VALUE;
        int y = Integer.MIN_VALUE;
        int z = Integer.MIN_VALUE;

        List<String> arr = new ArrayList<>();

        while (x != 0 && y != 0 && z != 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken(" "));
            y = Integer.parseInt(st.nextToken(" "));
            z = Integer.parseInt(st.nextToken(" "));

            if (x > y && x > z) {
                if (Math.pow(x, 2) == Math.pow(y, 2) + Math.pow(z, 2)) {
                    arr.add("right");
                } else {
                    arr.add("wrong");
                }
            } else if (y > x && y > z) {
                if (Math.pow(y, 2) == Math.pow(x, 2) + Math.pow(z, 2)) {
                    arr.add("right");
                } else {
                    arr.add("wrong");
                }
            } else if (z > x && z > y) {
                if (Math.pow(z, 2) == Math.pow(y, 2) + Math.pow(x, 2)) {
                    arr.add("right");
                } else {
                    arr.add("wrong");
                }
            }
        }

        for (String a : arr) {
            bw.write(a);
            bw.write("\n");
        }

        br.close();
        bw.close();
    }
}
