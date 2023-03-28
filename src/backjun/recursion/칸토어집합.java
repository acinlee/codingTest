package backjun.recursion;

import java.io.*;
import java.util.StringTokenizer;

public class 칸토어집합 {
    static String arr[];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        while (true) {
            String input = br.readLine();
            if (input == null) {
                break;
            }
            st = new StringTokenizer(input, " ");
            if (!st.hasMoreElements() || !st.hasMoreTokens()) {
                break;
            }

            String str = st.nextToken();

            int num = Integer.parseInt(str);
            int arrLength = (int) Math.pow(3, num);

            arr = new String[arrLength];
            for (int i=0; i<arrLength; i++) {
                arr[i] = "-";
            }

            cantor(0, arrLength);

            for (int i=0; i<arrLength; i++) {
                bw.write(arr[i]);
            }
            bw.write("\n");
        }
        br.close();
        bw.close();
    }

    public static void cantor(int start, int length) {
        if (length < 3) {
            return;
        }
        for (int i=start+length/3; i<start+length/3*2; i++) {
            arr[i] = " ";
        }

        cantor(start, length/3);
        cantor(start+length/3*2, length/3);
    }
}
