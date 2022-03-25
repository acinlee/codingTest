public class 하샤드 {
    public boolean solution(int x) {
        boolean answer = true;
        String[] a = String.valueOf(x).split("");
        int sum = 0;
        for(String b : a){
            sum += Integer.parseInt(b);
        }
        if(x%sum != 0) {
            answer = false;
        }
        return answer;
    }
}



