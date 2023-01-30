package backjun.setandmap;

import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class 서로다른부분문자열의개수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        String s = st.nextToken();

        Set<String> stringSet = new HashSet<>();

        int count = s.length();
        for (int i=0; i<count+1; i++) {
            for (int j=i; j<count+1; j++) {
                String as = s.substring(i, j);
                if (!as.equals("") && as.length() >= 1) {
                    stringSet.add(s.substring(i, j));
                }
            }
        }

        bw.write(String.valueOf(stringSet.size()));
        br.close();
        bw.close();
    }
}
