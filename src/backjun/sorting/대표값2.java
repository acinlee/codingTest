package backjun.sorting;

import java.io.*;
import java.util.StringTokenizer;

public class 대표값2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int [] arr = new int[5];
        int count = 0;
        for (int i=0; i<arr.length; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            arr[i] = num;
            count += num;
        }

        int mid = count/5;

        arr = sortArr(arr);

        bw.write(String.valueOf(mid));
        bw.write("\n");
        bw.write(String.valueOf(arr[2]));

        br.close();
        bw.close();
    }

    public static int[] sortArr(int[] arr) {
        for (int i=0; i<arr.length; i++) {
            for (int j=i+1; j<arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
