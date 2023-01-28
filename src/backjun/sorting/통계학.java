package backjun.sorting;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class 통계학 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int lineNum = Integer.parseInt(st.nextToken());
        int arr[] = new int[lineNum];

        // 산술 평균 : 소수점 이하 첫째 자리에서 반올림
        int avg = 0;
        // 중앙값
        int mid = 0;
        // 최빈값
        int many = 0;
        // 범위
        int range = 0;
        double total = 0;

        for (int i=0; i<lineNum; i++) {
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            arr[i] = num;
            total += (double)num;
        }

        // 배열 정렬
        quickSort(arr);

        if (arr.length > 1) {
            avg = sansul(total, lineNum);
            mid = junggan(arr);
            many = chibean(arr);
            range = arr[lineNum-1] - arr[0];
        } else {
            avg = arr[0];
            mid = arr[0];
            many = arr[0];
            range = 0;
        }



        bw.write(String.valueOf(avg));
        bw.write("\n");
        bw.write(String.valueOf(mid));
        bw.write("\n");
        bw.write(String.valueOf(many));
        bw.write("\n");
        bw.write(String.valueOf(range));
        bw.write("\n");
        br.close();
        bw.close();
    }

    private static void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length-1);
    }

    private static void quickSort(int[] arr, int start, int end) {
        int part2 = partition(arr, start, end);
        if (start < part2-1) {
            quickSort(arr, start, part2-1);
        }
        if (part2 < end) {
            quickSort(arr, part2, end);
        }
    }

    private static int partition(int[] arr, int start, int end) {
        int pivot = arr[(start+end)/2];
        while (start <= end) {
            while (arr[start] < pivot) start++;
            while (arr[end] > pivot) end--;
            if (start <= end) {
                swap(arr, start, end);
                start++;
                end--;
            }
        }
        return start;
    }

    private static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    // 산술 평균
    private static int sansul(double num, int count) {
        return (int)Math.round(num/count);
    }

    // 중간값
    private static int junggan(int[] arr) {
        int mid = arr.length/2;
        return arr[mid];
    }

    // 최빈값
    private static int chibean(int[] arr) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        int max = Integer.MIN_VALUE;

        for (int i=0; i<arr.length; i++) {
            if (i == arr.length -1) {
                temp.add(arr[i]);
                list.add(temp);
                break;
            }

            if (arr[i] == arr[i+1]) {
                temp.add(arr[i]);
            } else {
                temp.add(arr[i]);
                list.add(temp);
                temp = new ArrayList<>();
            }
        }

        for (int i=0; i<list.size(); i++) {
            if (max < list.get(i).size()) {
                max = list.get(i).size();
            }
        }

        for (int i=0; i<list.size(); i++) {
            if (max != list.get(i).size()) {
                list.remove(i);
                i = 0;
            }
        }

        if (list.size() > 1) {
            return list.get(1).get(0);
        } else {
            return list.get(0).get(0);
        }
    }
}
