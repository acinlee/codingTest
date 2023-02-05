package backjun.stack;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class 균형잡힌세상 {
    private static List<String> stack1;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken("");
            if (s.equals(".")) {
                break;
            }

            String[] arr = s.split("");
            boolean result = true;
            stack1 = new ArrayList<>();

            for (int j = 0; j < arr.length; j++) {
                if (arr[j].equals("(") || arr[j].equals("[")) {
                    push(arr[j]);
                } else if (arr[j].equals(")")) {
                    if (stack1.isEmpty() || !peek().equals("(")) {
                        result = false;
                        break;
                    } else {
                        pop();
                    }
                } else if (arr[j].equals("]")) {
                    if (stack1.isEmpty() || !peek().equals("[")) {
                        result = false;
                        break;
                    } else {
                        pop();
                    }
                }
            }

            if (!stack1.isEmpty()) {
                result = false;
            }

            if (result) {
                bw.write("yes");
            } else {
                bw.write("no");
            }
            bw.write("\n");
        }
        br.close();
        bw.close();
    }

    private static void push(String s) {
        stack1.add(s);
    }

    private static String peek() {
        return stack1.get(stack1.size()-1);
    }

    private static void pop() {
        stack1.remove(stack1.size()-1);
    }
}
