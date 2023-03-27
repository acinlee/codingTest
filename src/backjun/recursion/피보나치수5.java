package backjun.recursion;

import java.io.*;
import java.util.StringTokenizer;

public class 피보나치수5 {
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());


        if (num == 0) {
            bw.write("0");
        } else if (num == 1) {
            bw.write("1");
        } else {
            int count = 2;
            arr = new int[num+1];
            arr[0] = 0;
            arr[1] = 1;
            fibonacci(count);
            bw.write(String.valueOf(arr[num]));
        }

        br.close();
        bw.close();
    }
    public static void fibonacci(int count) {
        if (count != arr.length) {
            arr[count] = arr[count-1] + arr[count-2];
            fibonacci(count+1);
        }
    }
}
