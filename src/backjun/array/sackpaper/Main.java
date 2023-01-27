package backjun.array.sackpaper;

import java.io.*;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Date timestamp = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        String time = sdf.format(timestamp);
        String random = String.format("%07d", (new SecureRandom().nextInt(9999999)));
        System.out.println(time + " " + random);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] arr = new int[9][9];

        for (int i=0; i<9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j=0; j<9; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int temp = Integer.MIN_VALUE;
        int x = 0;
        int y = 0;
        for (int i=0; i<9; i++) {
            for (int j=0; j<9; j++) {
                if (temp < arr[i][j]) {
                    temp = arr[i][j];
                    x = i+1;
                    y = j+1;
                }
            }
        }

        bw.write(String.valueOf(temp));
        bw.write("\n");
        bw.write(x + " " + y);
        br.close();
        bw.close();
    }
}
