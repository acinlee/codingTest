package backjun.backtracking;

import java.io.*;
import java.util.StringTokenizer;

public class 스도쿠 {
    private static int[][] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        arr = new int[9][9];
        for (int i=0; i<9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j=0; j<9; j++) {
                int num = Integer.parseInt(st.nextToken(" "));
                arr[i][j] = num;
            }
        }

        sudoku();

        for (int i=0; i<9; i++) {
            for (int j=0; j<9; j++) {
                bw.write(arr[i][j] + " ");
            }
            bw.write("\n");
        }
        br.close();
        bw.close();
    }

    private static void sudoku() {
        for (int i=0; i<9; i++) {
            for (int j=0; j<9; j++){
                if (arr[i][j] == 0) {
                    sudokuSort(i, j);
                }
            }
        }
    }

    private static void sudokuSort(int row, int col) {
        int rowZeroCount = 0;
        int colZeroCount = 0;
        for (int i=0; i<9; i++) {
            if(arr[row][i] == 0) {
                rowZeroCount += 1;
            }
            if(arr[i][col] == 0) {
                colZeroCount += 1;
            }
        }

        if (rowZeroCount == 1) {
            boolean[] oneToNine = new boolean[9];
            int num = 0;
            for (int i=0; i<9; i++) {
                if (arr[row][i] != 0) {
                    oneToNine[arr[row][i]-1] = true;
                }
            }

            for (int i=0; i<9; i++) {
                if (!oneToNine[i]) {
                    num = i+1;
                }
            }

            for (int i=0; i<9; i++) {
                if (arr[row][i] == 0) {
                    arr[row][i] = num;
                }
            }
        }

        if (colZeroCount == 1) {
            boolean[] oneToNine = new boolean[9];
            int num = 0;
            for (int i=0; i<9; i++) {
                if (arr[i][col] != 0) {
                    oneToNine[arr[i][col]-1] = true;
                }
            }

            for (int i=0; i<9; i++) {
                if (!oneToNine[i]) {
                    num = i+1;
                }
            }

            for (int i=0; i<9; i++) {
                if (arr[i][col] == 0) {
                    arr[i][col] = num;
                }
            }
        }

        switch (row/3) {
            case 0:
                switch (col/3) {
                    case 0:
                        int zeroCount = 0;
                        int num = 0;
                        boolean[] oneToNine = new boolean[9];
                        for (int i=0; i<3; i++) {
                            for (int j=0; j<3; j++){
                                if (arr[i][j] == 0 ) {
                                    zeroCount += 1;
                                } else {
                                    oneToNine[arr[i][j]-1] = true;
                                }
                            }
                        }
                        if (zeroCount == 1) {
                            for (int i=0; i<9; i++) {
                                if (!oneToNine[i]) {
                                    num = i+1;
                                }
                            }
                            for (int i=0; i<3; i++) {
                                for (int j = 0; j < 3; j++) {
                                    if (arr[i][j] == 0) {
                                        arr[i][j] = num;
                                    }
                                }
                            }
                        }
                        break;
                    case 1:
                        zeroCount = 0;
                        num = 0;
                        oneToNine = new boolean[9];
                        for (int i=0; i<3; i++) {
                            for (int j=3; j<6; j++){
                                if (arr[i][j] == 0 ) {
                                    zeroCount += 1;
                                } else {
                                    oneToNine[arr[i][j]-1] = true;
                                }
                            }
                        }
                        if (zeroCount == 1) {
                            for (int i=0; i<9; i++) {
                                if (!oneToNine[i]) {
                                    num = i+1;
                                }
                            }
                            for (int i=0; i<3; i++) {
                                for (int j=3; j<6; j++){
                                    if (arr[i][j] == 0) {
                                        arr[i][j] = num;
                                    }
                                }
                            }
                        }
                        break;
                    case 2:
                        zeroCount = 0;
                        num = 0;
                        oneToNine = new boolean[9];
                        for (int i=0; i<3; i++) {
                            for (int j=6; j<9; j++){
                                if (arr[i][j] == 0 ) {
                                    zeroCount += 1;
                                } else {
                                    oneToNine[arr[i][j]-1] = true;
                                }
                            }
                        }
                        if (zeroCount == 1) {
                            for (int i=0; i<9; i++) {
                                if (!oneToNine[i]) {
                                    num = i+1;
                                }
                            }
                            for (int i=0; i<3; i++) {
                                for (int j=6; j<9; j++){
                                    if (arr[i][j] == 0) {
                                        arr[i][j] = num;
                                    }
                                }
                            }
                        }
                        break;
                }
                break;
            case 1:
                switch (col/3) {
                    case 0:
                        int zeroCount = 0;
                        int num = 0;
                        boolean[] oneToNine = new boolean[9];
                        for (int i=3; i<6; i++) {
                            for (int j=0; j<3; j++){
                                if (arr[i][j] == 0 ) {
                                    zeroCount += 1;
                                } else {
                                    oneToNine[arr[i][j]-1] = true;
                                }
                            }
                        }

                        if (zeroCount == 1) {
                            for (int i=0; i<9; i++) {
                                if (!oneToNine[i]) {
                                    num = i+1;
                                }
                            }
                            for (int i=3; i<6; i++) {
                                for (int j=0; j<3; j++){
                                    if (arr[i][j] == 0) {
                                        arr[i][j] = num;
                                    }
                                }
                            }
                        }
                        break;
                    case 1:
                        zeroCount = 0;
                        num = 0;
                        oneToNine = new boolean[9];
                        for (int i=3; i<6; i++) {
                            for (int j=3; j<6; j++){
                                if (arr[i][j] == 0 ) {
                                    zeroCount += 1;
                                } else {
                                    oneToNine[arr[i][j]-1] = true;
                                }
                            }
                        }

                        if (zeroCount == 1) {
                            for (int i=0; i<9; i++) {
                                if (!oneToNine[i]) {
                                    num = i+1;
                                }
                            }
                            for (int i=3; i<6; i++) {
                                for (int j=3; j<6; j++){
                                    if (arr[i][j] == 0) {
                                        arr[i][j] = num;
                                    }
                                }
                            }
                        }
                        break;
                    case 2:
                        zeroCount = 0;
                        num = 0;
                        oneToNine = new boolean[9];
                        for (int i=3; i<6; i++) {
                            for (int j=6; j<9; j++){
                                if (arr[i][j] == 0 ) {
                                    zeroCount += 1;
                                } else {
                                    oneToNine[arr[i][j]-1] = true;
                                }
                            }
                        }
                        if (zeroCount == 1) {
                            for (int i=0; i<9; i++) {
                                if (!oneToNine[i]) {
                                    num = i+1;
                                }
                            }
                            for (int i=3; i<6; i++) {
                                for (int j=6; j<9; j++){
                                    if (arr[i][j] == 0) {
                                        arr[i][j] = num;
                                    }
                                }
                            }
                        }
                        break;
                }
                break;
            case 2:
                switch (col/3) {
                    case 0:
                        int zeroCount = 0;
                        int num = 0;
                        boolean[] oneToNine = new boolean[9];
                        for (int i=6; i<9; i++) {
                            for (int j=0; j<3; j++){
                                if (arr[i][j] == 0 ) {
                                    zeroCount += 1;
                                } else {
                                    oneToNine[arr[i][j]-1] = true;
                                }
                            }
                        }
                        if (zeroCount == 1) {
                            for (int i=0; i<9; i++) {
                                if (!oneToNine[i]) {
                                    num = i+1;
                                }
                            }
                            for (int i=6; i<9; i++) {
                                for (int j=0; j<3; j++){
                                    if (arr[i][j] == 0) {
                                        arr[i][j] = num;
                                    }
                                }
                            }
                        }
                        break;
                    case 1:
                        zeroCount = 0;
                        num = 0;
                        oneToNine = new boolean[9];
                        for (int i=6; i<9; i++) {
                            for (int j=3; j<6; j++){
                                if (arr[i][j] == 0 ) {
                                    zeroCount += 1;
                                } else {
                                    oneToNine[arr[i][j]-1] = true;
                                }
                            }
                        }

                        if (zeroCount == 1) {
                            for (int i=0; i<9; i++) {
                                if (!oneToNine[i]) {
                                    num = i+1;
                                }
                            }
                            for (int i=6; i<9; i++) {
                                for (int j=3; j<6; j++){
                                    if (arr[i][j] == 0) {
                                        arr[i][j] = num;
                                    }
                                }
                            }
                        }
                        break;
                    case 2:
                        zeroCount = 0;
                        num = 0;
                        oneToNine = new boolean[9];
                        for (int i=6; i<9; i++) {
                            for (int j=6; j<9; j++){
                                if (arr[i][j] == 0 ) {
                                    zeroCount += 1;
                                } else {
                                    oneToNine[arr[i][j]-1] = true;
                                }
                            }
                        }
                        if (zeroCount == 1) {
                            for (int i=0; i<9; i++) {
                                if (!oneToNine[i]) {
                                    num = i+1;
                                }
                            }
                            for (int i=6; i<9; i++) {
                                for (int j=6; j<9; j++){
                                    if (arr[i][j] == 0) {
                                        arr[i][j] = num;
                                    }
                                }
                            }
                        }
                        break;
                }
                break;
        }
    }


}
