package backjun.sorting;

import java.io.*;
import java.util.*;

public class 단어정렬 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int lineNum = Integer.parseInt(st.nextToken());
        Map<String, Integer> map = new HashMap<>();
        String[] arr = new String[lineNum];

        for (int i=0; i<lineNum; i++) {
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            map.put(s, s.length());
        }

        // Map.Entry 리스트 작성
        List<Map.Entry<String, Integer>> list_entries = new ArrayList<Map.Entry<String, Integer>>(map.entrySet());

        // 비교함수 Comparator를 사용하여 오름차순으로 정렬
        Collections.sort(list_entries, new Comparator<Map.Entry<String, Integer>>() {
            // compare로 값을 비교
            public int compare(Map.Entry<String, Integer> obj1, Map.Entry<String, Integer> obj2) {
                if (obj1.getValue() == obj2.getValue()) {
                    return obj1.getKey().compareTo(obj2.getKey());
                } else {
                    // 오름 차순 정렬
                    return obj1.getValue().compareTo(obj2.getValue());
                }

            }
        });

        for (Map.Entry<String, Integer> entry : list_entries) {
            bw.write(entry.getKey());
            bw.write("\n");
        }
        br.close();
        bw.close();
    }
}
