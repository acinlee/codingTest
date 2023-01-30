package backjun.bruteforce;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class 분해합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        String s = st.nextToken();
        int num = Integer.parseInt(s);
        int count = 1;
        ArrayList<Integer> arr = new ArrayList<>();

        while (count < num) {
            int a = count;
            String countToStr = String.valueOf(count);
            for (int i=0; i<countToStr.length(); i++) {
                int b = Integer.parseInt(String.valueOf(countToStr.charAt(i)));
                a += b;
            }
            if (a == num) {
                arr.add(count);
            }
            count++;
        }

        Collections.sort(arr);

        if (arr.isEmpty()) {
            bw.write("0");
        } else {
            bw.write(String.valueOf(arr.get(0)));
        }
        br.close();
        bw.close();
    }
}
