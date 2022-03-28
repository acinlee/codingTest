package level1;

import java.util.ArrayList;

public class 최소공배수최대공약수 {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        // 내 풀이
        ArrayList<Integer> mini = new ArrayList<Integer>();
        ArrayList<Integer> max = new ArrayList<Integer>();
        boolean moreThan = n > m;
        // 최대 공약수
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (m % j == 0 && n % i == 0 && j == i) {
                    System.out.println(i);
                    mini.add(i);
                }
            }

        }
        System.out.println("hello");
        // 최소 공배수
        for (int i = 1; n*i <= n * m; i++) {
            for (int j = 1; m*j <= n * m; j++) {
                if (n * i == m * j) {
                    System.out.println(n * i);
                    max.add(n * i);
                }
            }
        }
        answer[0] = mini.get(mini.size()-1);
        answer[1] = max.get(0);
        System.out.println("answer=" + answer[0] + " " + answer[1]);

        // 다른 사람 풀이
//        int temp=1;
//        int gcd=n*m;
//        while(temp!=0){
//            temp=m%n;
//            m=n;
//            n=temp;
//            System.out.println("temp : " + temp);
//            System.out.println("m : "+m);
//            System.out.println("n : " + n);
//        }
//        answer[0]=m;
//        answer[1]=gcd/m;

        return answer;
    }
}
