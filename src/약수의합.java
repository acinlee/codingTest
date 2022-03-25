public class 약수의합 {
    public int solution(int n) {
        int answer = 0;
        /*  문제 풀이
            1. count 할 수 있는 int형 변수 선언
            2. 반복문을 돌면서 count로 n을 나누면서 나눠지면 answer에 덧셈
            3. count가 n보다 커지면 반복문 종료
         */
        // 1번
        int count = 1;
        // n이 1인 경우
        if( n == 1) {
            return 1;
        } else {
            while(count <= n) {
                if(n%count == 0) {
                    answer += count;
                }
                count += 1;
            }
        }
        return answer;
    }
}
