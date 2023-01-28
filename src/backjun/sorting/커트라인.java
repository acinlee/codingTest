package backjun.sorting;

import java.io.*;
import java.util.StringTokenizer;

public class 커트라인 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        // 응시자 수
        int peopleCount = Integer.parseInt(st.nextToken(" "));
        // 상 받는 인원 수
        int winnerCount = Integer.parseInt(st.nextToken(" "));
        // 커트라인
        int cutLine = peopleCount - winnerCount;

        st = new StringTokenizer(br.readLine());
        int[] score = new int[peopleCount];

        for (int i=0; i<peopleCount; i++) {
            score[i] = Integer.parseInt(st.nextToken(" "));
        }

        for(int i=0; i<score.length; i++) {
            for(int j=i; j<score.length; j++) {
                if (score[i] > score[j]) {
                    int temp = score[i];
                    score[i] = score[j];
                    score[j] = temp;
                }
            }
        }

        bw.write(String.valueOf(score[cutLine]));
        br.close();
        bw.close();
    }
}
