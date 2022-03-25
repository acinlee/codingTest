public class 정수내림차순배치 {
    public long solution(long n) {
        long answer = 0;
        String [] result = new String[Long.toString(n).length()];
        for (int i=0; i<result.length; i++){
            String splitNum1 = result.substring(i,i+1);
            for(int j=0; j<result.length; j++){
                String splitNum2 = result.substring(j,j+1);
                String temp = splitNum1;
                if( Integer.parseInt(splitNum1) < Integer.parseInt(splitNum2)){
                    splitNum1 = splitNum2;
                    splitNum2 = temp;
                }
            }
        }
        return answer;
    }
}
