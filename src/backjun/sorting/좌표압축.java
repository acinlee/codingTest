package backjun.sorting;

import java.io.*;
import java.util.*;

public class 좌표압축 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        int[] arr = new int[num];
        Map<Integer, Integer> map = new HashMap<>();

        st = new StringTokenizer(br.readLine());
        for (int i=0; i<num; i++) {
            arr[i] = Integer.parseInt(st.nextToken(" "));
            map.put(arr[i], 0);
        }

        // Map.Entry 리스트 작성
        List<Map.Entry<Integer, Integer>> list_entries = new ArrayList<Map.Entry<Integer, Integer>>(map.entrySet());

        // 비교함수 Comparator를 사용하여 오름차순으로 정렬
        Collections.sort(list_entries, new Comparator<Map.Entry<Integer, Integer>>() {
            // compare로 값을 비교
            public int compare(Map.Entry<Integer, Integer> obj1, Map.Entry<Integer, Integer> obj2) {
                return obj1.getKey().compareTo(obj2.getKey());
            }
        });

        int count = 0;
        for (Map.Entry<Integer, Integer> a: list_entries) {
            map.put(a.getKey(), count);
            count++;
        }

        for (int i=0; i<num; i++) {
            bw.write(String.valueOf(map.get(arr[i])));
            bw.write(" ");
        }

        bw.write("");
        br.close();
        bw.close();
    }
}
