package level1;

public class 문자열내림차순배치 {
    public String solution(String s) {
        /*  문제풀이
            1. s 길이 만큼의 char 배열 선언
            2. char 배열에 s를 char로 쪼개 추가
            3. 반복문 돌면서 아스키 코드 값으로 비교하여 배열 정렬
            4. char 문자 덧셈하여 answer 값 만들기
         */
        String answer = "";
        // 1번
        char [] result = new char[s.length()];
        // 2번
        for(int i=0; i<s.length(); i++){
            result[i] = s.charAt(i);
        }
        // 3번
        for(int i=0; i<s.length(); i++){
            for(int j=0; j<s.length(); j++) {
                if(result[i] > result[j]) {
                    char temp = result[i];
                    result[i] = result[j];
                    result[j] = temp;
                }
            }
        }
        // 4번
        for (int i=0; i<result.length; i++) {
            answer += result[i];
        }
        return answer;
    }
}
