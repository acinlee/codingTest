package level3;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class 단어변환 {
    public static void main(String[] args) throws Exception {
        //String[] words = {"hot", "dot", "dog", "lot", "log", "cog"};
        String[] words = {"hot", "dot", "dog", "lot", "log", "pog"};
        String begin = "hit";
        String target = "cog";
        System.out.println(solution(begin, target, words));
    }

    public static int solution(String begin, String target, String[] words) {
        // 방문 여부 확인 배열
        boolean[] visited = new boolean[words.length];

        Queue<Object[]> q = new LinkedList<>();
        q.offer(new Object[]{begin, 0});

        while (!q.isEmpty()) {
            int wordEqualCnt = 0;
            Object[] obj = q.poll();
            String val = String.valueOf(obj[0]);
            int cnt = Integer.parseInt(String.valueOf(obj[1]));

            // queue 에서 나온 값이 target 값과 같다면 변경 횟수 리턴
             if (val.equals(target)) {
                return cnt;
            }

            for (int i=0; i<words.length; i++) {
                for (int j=0; j<begin.length(); j++) {
                    if (val.charAt(j) == words[i].charAt(j)) {
                         wordEqualCnt++;
                    }
                }
                if (wordEqualCnt == begin.length()-1 && !visited[i]) {
                    q.offer(new Object[]{words[i], cnt+1});
                    visited[i] = true;
                }
                wordEqualCnt = 0;
            }
        }

        return 0;
    }
}
