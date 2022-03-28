package level1;

public class 문자열내p와y의개수 {
    public boolean solution(String s) {
        /*  문제 풀이
            1. s를 lowerCase로 소문자 변환
            2. p개수, y개수를 저장하는 int 형 변수 선언
            3. int형 변수 비교하여 같지 않으면 false
         */
        boolean answer = true;
        String result = s.toLowerCase();
        int countP = (int) result.chars().filter(c -> c == 'p').count();
        int countY = (int) result.chars().filter(c -> c == 'y').count();
        if( countP != countY) {
            answer = false;
        }
        return answer;
    }
}
