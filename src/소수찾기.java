public class 소수찾기 {
    public int solution(int n) {
        /*  문제 풀이
            에라토스테네스의 체 활용
            1보다 큰 모든 자연수는 소수의 곱으로 이루어져 있다.
            어떤 자연수 n이 있을 때, √n 보다 작은 모든 소수들로 나누어 떨어지지 않으면 n은 소수입니다.
            참고 위키 백과 : https://ko.wikipedia.org/wiki/%EC%97%90%EB%9D%BC%ED%86%A0%EC%8A%A4%ED%85%8C%EB%84%A4%EC%8A%A4%EC%9D%98_%EC%B2%B4
         */
        int answer = 0;
        int [] number = new int[n+1];
        for( int i = 2; i<=n; i++){
            number[i] = i;
        }

        for( int i=2; (i*i)<=n; i++) {
            if(number[i]==0) continue;
            for( int j=i*i; j<=n; j+=i ){
                number[j] = 0;
            }
        }

        for(int i=2; i<=n; i++) {
            if(number[i] != 0) {
                answer+=1;
            }
        }
        return answer;
    }
}
