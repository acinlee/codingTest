package backjun.sorting;

import java.io.*;
import java.util.*;

public class 나이순정렬 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int lineNum = Integer.parseInt(st.nextToken());
        String [][] arr = new String[lineNum][2];

        for (int i=0; i<lineNum; i++) {
            st = new StringTokenizer(br.readLine());
            String age = st.nextToken();
            String name = st.nextToken();
            arr[i][0] = age;
            arr[i][1] = name;
        }

        Arrays.sort(arr, new Comparator<String[]>() {
            // 나이순 정렬
            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
            }
        });

        for(int i=0; i<lineNum; i++) {
            bw.write(arr[i][0] + " " + arr[i][1]);
            bw.write("\n");
        }


        br.close();
        bw.close();
    }
}
