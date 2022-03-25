public class 자연수뒤집어배열로만들기 {
    public int[] solution(long n) {
        /*  문제 풀이
            1. 자연수를 String로 형변환
            2. String length 길이의 배열 선언
            3. 해당 배열에 String을 substring 하여 추가
            4. 정렬
         */
        // 1번
        String longToString = Long.toString(n);
        // 2번
        int[] answer = new int[longToString.length()];
        // 3번
        for(int i=0; i<answer.length; i++){
            answer[i] = Integer.parseInt(longToString.substring(i, i+1));
        }
        // 4번
        for(int i=0; i<answer.length/2; i++) {
            int temp = answer[i];
            answer[i] = answer[answer.length-i-1];
            answer[answer.length-i-1] = temp;
        }
        return answer;
    }
}
