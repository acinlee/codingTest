package backjun.stack;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class 균형잡힌세상 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken("");
            if (s.equals(".")) {
                break;
            }
            boolean result = true;
            int arrACount = 0;
            int arrBCount = 0;
            String[] arr = s.split("");

            for (int j=0; j< arr.length; j++) {
                if (arr[j].equals("(")) {
                    arrACount += 1;
                } else if (arr[j].equals(")")) {
                    arrACount -= 1;
                } else if (arr[j].equals("[")) {
                    arrBCount += 1;
                } else if (arr[j].equals("]")) {
                    arrBCount -= 1;
                }
            }

            if (arrACount < 0) {
                result = false;
            }

            if (arrBCount < 0) {
                result = false;
            }

            if (arrACount != 0 || arrBCount != 0) {
                result = false;
            }

            if (result) {
                bw.write("yes");
                bw.write("\n");
            } else {
                bw.write("no");
                bw.write("\n");
            }
        }

        br.close();
        bw.close();
    }
}
