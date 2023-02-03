package backjun.dynamicplanning;

import java.io.*;
import java.util.StringTokenizer;

public class 피보나치수1 {
    private static int fibCount = 0;
    private static int fibonacciCount = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        int[] arr = new int[num];

        fib(num);
        fibonacci(num, arr);

        bw.write(fibCount + " " + fibonacciCount);
        br.close();
        bw.close();
    }

    private static int fib(int n) {
        if (n == 1 || n == 2) {
            fibCount+=1;
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
    private static int fibonacci(int n, int[] arr) {
        arr[0] = 1;
        arr[1] = 1;

        for (int i = 2; i < n; i++) {
            fibonacciCount+=1;
            arr[i] = arr[i-2] + arr[i-1];
        }
        return arr[n-1];
    }
}
