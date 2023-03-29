package backjun.nujucksum;

import java.io.*;
import java.util.*;

public class 인간_컴퓨터상호작용 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        String S = st.nextToken();

        List<Map<Character, Integer>> list = new ArrayList<>();

        Map<Character, Integer> allDataMap = new HashMap<>();
        for (int i=0; i<S.length(); i++) {
            Map<Character, Integer> map = new HashMap<>();
            if (allDataMap.containsKey(S.charAt(i))) {
                int charNum = allDataMap.get(S.charAt(i));
                allDataMap.put(S.charAt(i), charNum+1);
            } else {
                allDataMap.put(S.charAt(i), 1);
            }
            map.putAll(allDataMap);
            list.add(i, map);
        }

        st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());

        for (int i=0; i<num; i++) {
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int result = 0;
            if (!list.get(end).containsKey(s.charAt(0))) {
            } else if ((start > 0 && !list.get(start-1).containsKey(s.charAt(0))) || start == 0) {
                result = list.get(end).get(s.charAt(0));
            } else {
                result = list.get(end).get(s.charAt(0)) - list.get(start-1).get(s.charAt(0));
            }
            bw.write(String.valueOf(result));
            bw.write("\n");
        }

        br.close();
        bw.close();
    }
}
