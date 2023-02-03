package backjun.stack;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class 괄호 {
    private static List<String> stack;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());

        stack = new ArrayList<>();

        for (int i=0; i<num; i++) {
            boolean result = true;
            int count = 0;
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            String [] arr = s.split("");
            for (int j=0; j< arr.length; j++) {
                if (arr[j].equals("(")) {
                    count += 1;
                } else {
                    count -= 1;
                }
                if (count < 0) {
                    result = false;
                    break;
                }
            }
            if (count != 0) {
                result = false;
            }
            if (result) {
                bw.write("YES");
                bw.write("\n");
            } else {
                bw.write("NO");
                bw.write("\n");
            }
        }

        br.close();
        bw.close();
    }
}
