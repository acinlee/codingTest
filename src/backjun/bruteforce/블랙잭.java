package backjun.bruteforce;

import java.io.*;
import java.util.HashSet;
import java.util.Iterator;
import java.util.StringTokenizer;

public class 블랙잭 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int cardCount = Integer.parseInt(st.nextToken());
        int sum = Integer.parseInt(st.nextToken());
        int minus = Integer.MAX_VALUE;
        int result = 0;
        HashSet<Integer> hashSet = new HashSet<>();

        int[] arr = new int[cardCount];

        st = new StringTokenizer(br.readLine());
        for (int i=0; i<cardCount; i++) {
            arr[i] = Integer.parseInt(st.nextToken(" "));
        }

        for(int i=0; i<cardCount; i++) {
            for(int j=i+1; j<cardCount; j++) {
                for(int k=j+1; k<cardCount; k++) {
                    int temp = arr[i] + arr[j] + arr[k];
                    if (sum >= temp) {
                        hashSet.add(temp);
                    }
                }
            }
        }

        Iterator<Integer> it = hashSet.iterator();

        while (it.hasNext()) {
            int num = it.next();
            int min = Math.abs(sum-num);
            if (Math.abs(sum-num) < minus) {
                minus = min;
                result = num;
            }
         }

        bw.write(String.valueOf(result));
        br.close();
        bw.close();
    }
}
