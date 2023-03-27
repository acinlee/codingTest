package backjun.recursion;

import java.io.*;
import java.util.StringTokenizer;

public class 팩토리얼 {
    static int result = 1;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        factorial(num);

        bw.write(String.valueOf(result));
        br.close();
        bw.close();
    }

    public static void factorial(int num) {
        if (num != 0) {
            result *= num;
            factorial(num-1);
        }
    }
}
