package level1;

import org.junit.Assert;
import org.junit.Test;

public class 다트게임 {
    public int solution(String dartResult) {
        /*  문제 풀이
            숫자가 나오는 경우 해당 배열에 '/' 삽입
            무조건 /는 3덩이가 나옴(사용자는 다트 게임을 총 3번함)
         */
        int answer = 0;
        // 문자열 나누기
        String[] splitDartResult = dartResult.split("");

        // '/'추가한 문자열 담을 배열 선언
        String[] addArr = new String[dartResult.length() + this.arrLength(splitDartResult)];

        // '/'추가한 문자열 담기
        addArr = this.splitString(dartResult.length(), addArr.length, splitDartResult);

        // String 배열 하나의 문자열로 합치기
        String splitString = String.join("", addArr);

        // '/'을 기준으로 문자열 나누기
        String[] resultString = splitString.split("/");

        // 1번, 2번, 3번 게임 초기화
        int[] result = {0, 0, 0};

        // 1번, 2번, 3번 게임 점수 미리 담기
        for (int i = 0; i < 3; i++) {
            if (resultString[i].contains("10")) {
                result[i] = 10;
            } else {
                result[i] = Character.getNumericValue(resultString[i].charAt(0));
            }
        }

        // 보너스, 옵션 점수 계산
        result = this.score(result, resultString);

        answer = result[0] + result[1] + result[2];
        return answer;
    }

    // 문자열 배열 길이 계산 함수
    public int arrLength(String[] splitDartResult) {
        int tenCount = 0;
        for (int i = 0; i < splitDartResult.length; i++) {
            if (("10").equals(splitDartResult[i] + splitDartResult[i])) {
                tenCount += 1;
            }
        }
        return 2 + tenCount;
    }

    // 숫자 앞에 '/' 가 들어간 문자열 만들기기
    public String[] splitString(int splitArrLength, int targetArrLength, String[] splitDartResult) {
        // 정규식으로 숫자인 경우 앞에 / 붙이기
        String[] addArr = new String[targetArrLength];
        String arg = "[0-9]";
        int count = 0;
        for (int i = 0; i < splitArrLength; i++) {
            if (splitDartResult[i].matches(arg)) {
                if (i == 0) {
                    if (splitDartResult[i + 1].matches(arg)) {
                        addArr[count] = splitDartResult[i] + splitDartResult[i + 1];
                        i++;
                    } else {
                        addArr[count] = splitDartResult[i];
                    }
                } else {
                    if (splitDartResult[i + 1].matches(arg)) {
                        addArr[count] = "/";
                        addArr[count + 1] = splitDartResult[i] + splitDartResult[i + 1];
                        i++;
                    } else {
                        addArr[count] = "/";
                        addArr[count + 1] = splitDartResult[i];
                    }
                    ++count;
                }

            } else {
                addArr[count] = splitDartResult[i];
            }
            ++count;
        }
        return addArr;
    }

    // 보너스, 옵션 점수 계산 함수
    public int[] score(int[] result, String[] resultString) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < resultString[i].length(); j++) {
                switch (resultString[i].charAt(j)) {
                    case 'D':
                        result[i] *= result[i];
                        break;
                    case 'T':
                        result[i] = result[i] * result[i] * result[i];
                        break;
                    case '*':
                        if (i > 0) {
                            result[i] = 2 * result[i];
                            result[i - 1] = 2 * result[i - 1];
                        } else {
                            result[i] = 2 * result[i];
                        }
                        break;
                    case '#':
                        result[i] = result[i] * (-1);
                        break;
                    default:
                        break;
                }
            }
        }
        return result;
    }

    @Test
    public void answer() {
        // given
        String dartResult1 = "1S2D*3T";
        String dartResult2 = "1D2S#10S";
        String dartResult3 = "1D2S0T";
        String dartResult4 = "1S*2T*3S";
        String dartResult5 = "1D#2S*3S";
        String dartResult6 = "1T2D3D#";
        String dartResult7 = "1D2S3T*";
        String dartResult8 = "10D4S10D";

        // when
        int answer1 = 37;
        int answer2 = 9;
        int answer3 = 3;
        int answer4 = 23;
        int answer5 = 5;
        int answer6 = -4;
        int answer7 = 59;
        int answer8 = 204;

        // then
        Assert.assertEquals(answer1, solution(dartResult1));
        Assert.assertEquals(answer2, solution(dartResult2));
        Assert.assertEquals(answer3, solution(dartResult3));
        Assert.assertEquals(answer4, solution(dartResult4));
        Assert.assertEquals(answer5, solution(dartResult5));
        Assert.assertEquals(answer6, solution(dartResult6));
        Assert.assertEquals(answer7, solution(dartResult7));
        Assert.assertEquals(answer8, solution(dartResult8));
    }
}
