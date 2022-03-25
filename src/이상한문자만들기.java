public class 이상한문자만들기 {
    public String solution(String s) {
        String answer = "";
        /*  문제 풀이
            1. count를 세는 int형 변수 선언, index를 세는 int형 변수 선언
            2. 문자열 길이 만큼 반복문 돌면서 count를 기준으로 문자열 변환하여 answer에 추가
            3. 공백이 나오는 경우 count를 0로 초기화
         */
        // 1번
        int count = 0;
        int index = 0;
        // 2번
        while (index < s.length()){
            String sub = s.substring(index, index+1);
            // 3번
            if(sub.equals(" ")){
                answer+=" ";
                count = 0;
                index += 1;
                continue;
            }
            if( count == 0 ){
                answer += sub.toUpperCase();
            } else if (count % 2 == 0) {
                // 짝수인 경우
                answer += sub.toUpperCase();
            } else {
                // 홀수인 경우
                answer += sub.toLowerCase();
            }
            index += 1;
            count += 1;
        }
        return answer;
    }
}
