package level1;

public class 정수제곱근판별 {
    public long solution(long n) {
        long answer = 0;
        double result = Math.sqrt(n);
        if(result % 1 == 0) {
            answer = ((long)result+1) * ((long)result+1);
        } else{
            answer = -1;
        }
        return answer;
    }
}
