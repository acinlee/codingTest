import java.util.ArrayList;

public class 제일작은수제거하기 {
    public ArrayList solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        int sm = arr[0];
        for(int i : arr) {
            if(sm>i) {
                sm=i;
            }
        }
        if(arr.length==1) {
            answer.add(-1);
        }
        else {
            for(int i:arr) {
                if(i != sm) {
                    answer.add(i);
                }
            }
        }
        return answer;
    }
}
