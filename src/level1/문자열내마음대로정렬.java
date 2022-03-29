package level1;

public class 문자열내마음대로정렬 {
    public String[] solution(String[] strings, int n) {
        /*  문제 풀이
            1. string for 문 돌면서 charAt로 해당 문자 비교해 정렬
            2. 같은 문자일 경우 사전 순으로 정렬
         */
        String[] answer = new String[strings.length];
        for (int i=0; i<strings.length; i++) {
            for (int j=0; j<strings.length; j++){
                if(strings[i].charAt(n) < strings[j].charAt(n)){
                    String temp = strings[i];
                    strings[i] = strings[j];
                    strings[j] = temp;
                } else if(strings[i].charAt(n) == strings[j].charAt(n)) {
                    if(strings[i].compareTo(strings[j]) < 0) {
                        //strings[i] 가 strings[j] 보다 사전 순 높을때
                        String tempCompare = strings[i];
                        strings[i] = strings[j];
                        strings[j] = tempCompare;
                    }
                }
            }
        }
        for(int i=0; i<answer.length; i++) {
            answer[i] = strings[i];
        }
        return answer;
    }
}
