package level1;

import java.util.*;
public class 자릿수더하기 {
    public int solution(int n) {
        int answer = 0;
        /* 문제 풀이
            1. n을 String로 변환
            2. String substring으로 값 쪼개서 더하기
         */
        String intToString = Integer.toString(n);
        for(int i=0; i<intToString.length(); i++) {
            answer += Integer.parseInt(intToString.substring(i, i+1));
        }
        return answer;
    }
}
