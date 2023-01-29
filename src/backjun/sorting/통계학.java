package backjun.sorting;

import java.io.*;
import java.util.*;

public class 통계학 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int lineNum = Integer.parseInt(st.nextToken());
        int arr[] = new int[lineNum];
        int total = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i=0; i<lineNum; i++) {
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            arr[i] = num;
            total += num;

            // map에 arr[i]의 숫자를 추가하고 이미 존재하면 카운트 1 증가 (getOrDefault 처음 알았다)
            map.put(arr[i], map.getOrDefault(arr[i],0) + 1);
        }

        int max = 0;
        for (Integer i : map.keySet()) {
            if (map.get(i) > max) {
                max = map.get(i);
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (Integer i : map.keySet()) {
            if (map.get(i) == max) {
                list.add(i);
            }
        }

        Arrays.sort(arr);
        Collections.sort(list);

        bw.write(String.valueOf(Math.round((double)total/lineNum)));
        bw.write("\n");
        bw.write(String.valueOf(arr[lineNum/2]));
        bw.write("\n");
        bw.write(list.size()==1 ? String.valueOf(list.get(0)) : String.valueOf(list.get(1)));
        bw.write("\n");
        bw.write(String.valueOf(Math.abs(arr[lineNum-1] - arr[0])));
        bw.write("\n");
        br.close();
        bw.close();
    }
}
