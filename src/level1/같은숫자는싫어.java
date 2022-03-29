package level1;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class 같은숫자는싫어 {
    public int[] solution(int[] arr) {
        /*  문제 풀이
            1. arrayList 선언
            2. arr 배열 길이 만큼 반복문을 돌면서 연속적인 수가 나온느 경우 arrayList에 추가
            3. arrayList에 있는 수 answer 배열에 옮김
         */
        ArrayList<Integer> result = new ArrayList<>();
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            // 제일 마지막 변수
            if (temp == arr[i]) {
                if(i == arr.length-1){
                    result.add(temp);
                }
                continue;
            } else if (temp != arr[i]){
                if(i == arr.length-1){
                    result.add(temp);
                    result.add(arr[i]);
                } else {
                    result.add(temp);
                    temp = arr[i];
                }
            }
        }
        int[] answer = new int[result.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = result.get(i);
        }

        return answer;
    }

    @Test
    public void answer() {
        // given
        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        int[] arr2 = {4, 4, 4, 3, 3};
        int[] arr3 = {1, 0, 1, 0};

        // when
        int[] result = {1, 3, 0, 1};
        int[] result2 = {4, 3};
        int[] result3 = {1, 0, 1, 0};

        // then
        Assert.assertArrayEquals(result, solution(arr));
        Assert.assertArrayEquals(result2, solution(arr2));
        Assert.assertArrayEquals(result3, solution(arr3));
    }
}
