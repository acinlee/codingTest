package backjun.stack;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class 스택 {
    static List<String> list;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        list = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num = Integer.parseInt(st.nextToken());
        for (int i=0; i<num; i++) {
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            if ("push".equals(s)) {
                push(st.nextToken());
            } else if ("pop".equals(s)) {
                bw.write(pop());
                bw.write("\n");
            } else if ("size".equals(s)) {
                bw.write(size());
                bw.write("\n");
            } else if ("empty".equals(s)) {
                bw.write(empty());
                bw.write("\n");
            } else if ("top".equals(s)) {
                bw.write(top());
                bw.write("\n");
            }
        }

        br.close();
        bw.close();
    }

    private static void push(String num) {
        list.add(num);
    }

    private static String pop() {
        if (list.isEmpty()) {
            return "-1";
        } else {
            String popNum = list.get(list.size()-1);
            list.remove(list.size()-1);
            return popNum;
        }
    }

    private static String size() {
        return String.valueOf(list.size());
    }

    private static String empty() {
        if (list.isEmpty()) {
            return "1";
        } else {
            return "0";
        }
    }

    private static String top() {
        if (list.isEmpty()) {
            return "-1";
        } else {
            String popNum = list.get(list.size()-1);
            return popNum;
        }
    }
}
