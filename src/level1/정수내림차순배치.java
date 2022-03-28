package level1;

public class 정수내림차순배치 {
    public long solution(long n) {
        long answer = 0;
        /*  풀이 진행
            1. n을 String으로 변환
            2. String length 크기의 배열 선언
            3. String을 쪼개서 배열에 하나씩 넣기
            4. 넣은 배열의 값들 int로 변환 하여 하나씩 비교
            5. 비교하여 정렬 후 다시 문자열로 합치기
         */
        // 1번
        String longToString = Long.toString(n);
        // 2번
        String [] arr = new String[longToString.length()];
        // 3번
        for (int i = 0; i<longToString.length(); i++) {
            arr[i] = longToString.substring(i, i+1);
        }
        // 4번
        for (int i = 0; i<arr.length; i++) {
            for(int j = 0; j< arr.length; j++) {
                String temp = arr[i];
                if(Integer.parseInt(arr[i]) > Integer.parseInt(arr[j])) {
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        // 5번
        String result = String.join("", arr);
        answer = Long.parseLong(result);
        return answer;
    }
}
