package backjun.recursion;

import java.io.*;
import java.util.StringTokenizer;

public class 재귀의귀재 {
    static int count = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());


        for (int i=0; i<num; i++) {
            st = new StringTokenizer(br.readLine());
            bw.write(isPalindrome(st.nextToken()) + " " + count);
            bw.write("\n");
        }

        br.close();
        bw.close();
    }

    public static int recursion(String s, int l, int r){
        count++;
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);
    }

    public static int isPalindrome(String s){
        count = 0;
        return recursion(s, 0, s.length()-1);
    }
}
