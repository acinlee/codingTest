package backjun.sorting;

import java.io.*;
import java.util.StringTokenizer;

public class 수정렬하기3 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = Integer.parseInt(st.nextToken());
        int arr[] = new int[count];

        for (int i=0; i<count; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
        }

        quickSort(arr);

        for (int i=0; i<count; i++) {
            bw.write(String.valueOf(arr[i]));
            bw.write("\n");
        }
        br.close();
        bw.close();
    }

    public static void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length-1);
    }

    public static void quickSort(int[] arr, int start, int end) {
        int part2 = partition(arr, start, end);
        if (start < part2-1) {
            quickSort(arr, start, part2-1);
        }
        if (part2 < end) {
            quickSort(arr, part2, end);
        }
    }

    public static int partition(int[] arr, int start, int end) {
        int pivot = arr[(start+end)/2];
        while (start <= end) {
            while (arr[start] < pivot) {
                start++;
            }
            while (arr[end] > pivot) {
                end--;
            }
            if (start<=end) {
                swap(arr, start, end);
                start++;
                end--;
            }
        }
        return start;
    }

    public static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
