package backjun.sorting;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class 소트인사이드 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (String a : st.nextToken().split("")) {
            arrayList.add(Integer.parseInt(a));
        }

        Collections.sort(arrayList);

        for (int i=arrayList.size()-1; i>=0; i--) {
            bw.write(String.valueOf(arrayList.get(i)));
        }

        br.close();
        bw.close();
    }
}
