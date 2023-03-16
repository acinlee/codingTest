package backjun.stack;

import java.io.*;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class 수열 {
    private static Stack stack;
    private static ArrayList<Integer> arr;
    private static ArrayList<String> stackStatusList;
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        stack = new Stack<>();
        stackStatusList = new ArrayList<>();
        arr = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        for (int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            push(m);
            if (stackStatusList.contains("NO")) {
                break;
            }
        }

        if (stackStatusList.contains("NO")) {
            bw.write("NO");
        } else {
            for (String a : stackStatusList) {
                bw.write(a);
                bw.write("\n");
            }
        }

        br.close();
        bw.close();
    }

    private static void pop() {
        int popNum = (int) stack.pop();
        arr.add(popNum);
        stackStatusList.add("-");
    }

    private static void push(int m) throws IOException {
        // 소모된 리스트에 m이 이미 있는 경우
        if (arr.contains(m)) {
            stackStatusList.add("NO");
            bw.write("NO");
            return;
        }

        // 스택이 비어 있는 경우
        if (stack.isEmpty()) {
            for (int i=1; i<m+1; i++) {
                if (!arr.contains(i)) {
                    stack.push(i);
                    bw.write("a");
                    bw.write("\n");
                    stackStatusList.add("+");
                }
            }
            pop();
            return;
        }

        // 스택의 맨 위의 값이 m보다 작을 경우
        int peekNum = (int) stack.peek();
        if (peekNum < m) {
            for (int i = peekNum+1; i<m+1; i++) {
                if (!arr.contains(i)) {
                    stack.push(i);
                    stackStatusList.add("+");
                }
            }
            pop();
        } else {
            // 스택의 맨 위의 값이 m보다 클 경우
            while (true) {
                int num = (int) stack.peek();
                if (num == m) {
                    pop();
                    break;
                }
                pop();
            }
        }
    }
}
