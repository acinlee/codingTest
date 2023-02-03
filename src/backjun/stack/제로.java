package backjun.stack;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class 제로 {
    private static List<Integer> arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        int result = 0;
        arr = new ArrayList<>();

        for (int i=0; i<num; i++) {
            st = new StringTokenizer(br.readLine());
            int pushNum = Integer.parseInt(st.nextToken());
            if (pushNum != 0) {
                push(pushNum);
            } else {
                pop();
            }
        }

        for (int i=0; i<arr.size(); i++) {
            result += arr.get(i);
        }

        bw.write(String.valueOf(result));
        br.close();
        bw.close();
    }

    private static void push(int num) {
        arr.add(num);
    }

    private static void pop() {
        arr.remove(arr.size()-1);
    }
}
