package level1;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class 나누어떨어지는숫자배열 {
    public int[] solution(int[] arr, int divisor) {
        /*
            방법 1 기존의 for문을 활용해 풀이하는 경우
         */
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0; i<arr.length; i++) {
            if(arr[i]%divisor == 0){
                result.add(arr[i]);
            }
        }
        int[] answer = {};
        if(result.size() == 0) {
            answer = new int[]{-1};
        } else {
            answer = new int[result.size()];
            for(int i=0; i<answer.length; i++) {
                answer[i] = result.get(i);
            }

            for(int i=0; i<answer.length; i++) {
                for(int j=0; j<answer.length; j++){
                    if(answer[i] < answer[j]) {
                        int temp = answer[i];
                        answer[i] = answer[j];
                        answer[j] = temp;
                    }
                }
                for(int a : answer) {
                    System.out.print(a + " ");
                }
            }
        }
        /*
            방법 2 Array의 stream 을 이용하는 방법
            배열 arr을 하나 하나 쪼개서 divisor로 나눠지는 경우 answer 배열에 집어 넣음
         */
        //int[] answer = Arrays.stream(arr).filter(idx -> idx % divisor == 0).toArray();
        //if(answer.length == 0) {
        //    answer = new int[]{-1};
        //}
        //// 배열 길이가 0 이 아니면 배열 정렬
        //Arrays.sort(answer);
        return answer;
    }

    @Test
    public void answer() {
        // given
        int[] a = {5,9,7,10};
        int b = 5;
        int[] a2 = {2, 36, 1, 3};
        int b2 = 1;
        int[] a3 = {3,2,6};
        int b3 = 10;

        // when
        int[] result = {5, 10};
        int[] result2 = {1,2,3,36};
        int[] result3 = {-1};

        // then
        Assert.assertArrayEquals(result, solution(a, b));
        Assert.assertArrayEquals(result2, solution(a2, b2));
        Assert.assertArrayEquals(result3, solution(a3, b3));
    }
}
