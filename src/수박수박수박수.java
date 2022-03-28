public class 수박수박수박수 {
    public String solution(int n) {
        /*  문제 풀이
            1. i가 n+1보다 작을동안 반복문을 실행한다.
            2. 짝수인 경우 answer에 '박'을 추가하고 홀수 인 경우 에는 '수'를 추가 한다
         */
        String answer = "";
        for( int i = 1; i<n+1; i++){
            if(i%2 == 0){
                answer += "박";
            } else {
                answer += "수";
            }
        }
        return answer;
    }
}
