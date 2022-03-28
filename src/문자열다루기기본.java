public class 문자열다루기기본 {
    public boolean solution(String s) {
        /* 문제 풀이
            1. 문자열 s가 4,6 이 아닌 경우 false
            2. s를 int형으로 형 변환 시 exception이 일어나면 answer은 false
         */
        boolean answer = true;
        try {
            if( s.length() == 4 || s.length() == 6) {
                int result = Integer.parseInt(s);
            } else {
                answer = false;
            }
        } catch (Exception e) {
            answer = false;
        }
        return answer;
    }
}
