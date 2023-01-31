package backjun.geometry1;

import java.io.*;
import java.util.*;

public class 참외밭 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int cham = Integer.parseInt(st.nextToken());
        int[] input=new int[6];
        int maxR=0,maxC=0; // 최대 세로길이, 최대 가로길이
        int indexR=0,indexC=0;

        for (int i = 0; i < 6; i++) {
            st=new StringTokenizer(br.readLine());
            int dir=Integer.parseInt(st.nextToken());
            int distance=Integer.parseInt(st.nextToken());
            if(dir==3 || dir==4) {// r
                maxR=maxR<distance?distance:maxR;
                if (maxR==distance) indexR=i;
            }else { // c
                maxC=maxC<distance?distance:maxC;
                if (maxC==distance) indexC=i;
            }
            input[i]=distance;

        }
        int nextR1=input[5],nextC1=input[5]; // nextR1,R2 => 세로길이 후보
        int nextR2=input[0],nextC2=input[0]; // nextC1,C2 => 가로길이 후보
        if (indexC-1>-1) nextR1=input[indexC-1];
        if (indexC+1<6) nextR2=input[indexC+1];
        if (indexR-1>-1) nextC1=input[indexR-1];
        if (indexR+1<6) nextC2=input[indexR+1];

        // 최대 가로길이*세로길이후보 중 작은 길이 + 가로길이후보 중 작은 길이*(최대 세로길이-세로길이후보 중 작은 길이)
        int area=maxC*Math.min(nextR1, nextR2)+Math.min(nextC1, nextC2)*(maxR-(Math.min(nextR1, nextR2)));

        bw.write(String.valueOf(area*cham));
        br.close();
        bw.close();
    }
}
