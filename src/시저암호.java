public class 시저암호 {
    public String solution(String s, int n) {
        /*  문제 풀이
            1. char 배열 선언해 s를 쪼개어 배열에 추가
            2. 각 char에 대해 n만큼 더한 아스키 코드 값 배출
            3. n만큼 더 한 숫자가 90, 122보다 크다면 65, 97로 변환
         */
        String answer = "";
        // 1번
        for(int i = 0; i < s.length(); i++){
            if ( s.charAt(i) != ' ') {
                // 대문자
                if(s.charAt(i) <= 90) {
                    if(s.charAt(i) + n > 90) {
                        answer += String.valueOf((char)(65 + ((s.charAt(i) + n) - 91)));
                    } else {
                        answer += String.valueOf((char)(s.charAt(i) + n));
                    }
                } else {
                    // 소문자
                    if(s.charAt(i) + n > 122) {
                        answer += String.valueOf((char)(97 + ((s.charAt(i) + n) - 123)));
                    } else {
                        answer += String.valueOf((char)(s.charAt(i) + n));
                    }
                }
            } else {
                answer += s.charAt(i);
            }
        }
        return answer;
    }
}
