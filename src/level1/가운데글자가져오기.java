package level1;

import org.junit.Assert;
import org.junit.Test;

public class 가운데글자가져오기 {
    public String solution(String s) {
        /* 문제 풀이
            2로 나눈 몫 기준으로 홀수 일 때는 몫에 해당하는 위치의 배열값을 가져오면 되며
            짝수인 경우 몫, 몫-1 위치의 배열값을 가져오면 된다.
         */
        String answer = "";
        String[] arr = s.split("");
        if (s.length() % 2 == 0){
            answer += arr[s.length() / 2 - 1] + arr[s.length() / 2];
        } else {
            answer = arr[s.length() / 2];
        }
        return answer;
    }

    @Test
    public void answer() {
        // given
        String s1 = "abcde";
        String s2 = "qwer";

        // when
        String result1 = "c";
        String result2 = "we";

        // then
        Assert.assertEquals(result1, solution(s1));
        Assert.assertEquals(result2, solution(s2));
    }
}
