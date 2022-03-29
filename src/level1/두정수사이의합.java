package level1;


import org.junit.Assert;
import org.junit.Test;

public class 두정수사이의합 {
    public long solution(int a, int b) {
        /*  문제 풀이
            1. i가 a고 i가 1씩 증가하여 b보다 같거나 작은 경우에 종료되는 반복문 생성
            2. 반복문을 돌면서 i값을 더하여 answer에 더함
         */
        long answer = 0;
        if (a < b) {
            for(int i = a; i<=b; i++) {
                answer += i;
            }
        } else {
            for(int i = b; i<=a; i++) {
                answer += i;
            }
        }

        return answer;
    }
    @Test
    public void answer() {
        // given
        int a = 3;
        int b = 5;
        int a2 = 3;
        int b2 = 3;
        int a3 = 5;
        int b3 = 3;

        // when
        int result = 12;
        int result2 = 3;
        int result3 = 12;

        // then
        Assert.assertEquals(result, solution(a, b));
        Assert.assertEquals(result2, solution(a2, b2));
        Assert.assertEquals(result3, solution(a3, b3));
    }
}
