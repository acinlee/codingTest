package todayhouse;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class oneQuestion {
    public long solution(int[][] beds, int[][] tables, int cost) {
        long answer = 0;
        ArrayList<Long> expensive = new ArrayList<>();
        for (int i = 0; i < tables.length; i++) {
            for (int j = 0; j < beds.length; j++) {
                long bedWidth = beds[j][0];
                long tableWidth = tables[i][0];
                long bedHeight = beds[j][1];
                long tableHeight = tables[i][1];
                long bedCost = beds[j][2];
                long tableCost = tables[i][2];
                /*
                    경우의 수 4가지
                    1. bed 넓이 높이 모두 table 넓이 높이 보다 큰 경우 및 반대인 경우
                    2. bed 넓이 > table 넓이, bed 높이 < table 높이 && bed 넓이 < table 넓이, bed 높이 > table 높이
                    3. (bed 넓이 = table 넓이, bed 높이 < table 높이, bed 높이 > table 높이) (bed 넓이 > table 넓이, bed 넓이 < table 넓이, bed 높이 = table 높이)
                    4. bed 넓이 및 높이 == table 넓이 및 높이
                 */
                long costs = 0;
                if ((bedWidth > tableWidth && bedHeight > tableHeight) || (bedWidth < tableWidth && bedHeight < tableHeight)) {
                    if (bedWidth > tableWidth) {
                        costs = bedWidth * (bedHeight + tableHeight) * cost + bedCost + tableCost;
                        expensive.add(costs);
                        costs = (bedWidth + tableWidth) * bedHeight * cost + bedCost + tableCost;
                        expensive.add(costs);
                    } else {
                        costs = tableWidth * (bedHeight + tableHeight) * cost + bedCost + tableCost;
                        expensive.add(costs);
                        costs = (bedWidth + tableWidth) * tableHeight * cost + bedCost + tableCost;
                        expensive.add(costs);
                    }
                } else if ((bedWidth > tableWidth && bedHeight < tableHeight) || (bedWidth < tableWidth && bedHeight > tableHeight)) {
                    if ( bedWidth > tableWidth ){
                        costs = bedWidth * (bedHeight + tableHeight) * cost + bedCost + tableCost;
                        expensive.add(costs);
                        costs = (bedWidth + tableWidth) * tableHeight * cost + bedCost + tableCost;
                        expensive.add(costs);
                    } else {
                        costs = tableWidth * (bedHeight + tableHeight) * cost + bedCost + tableCost;
                        expensive.add(costs);
                        costs = (bedWidth + tableWidth) * bedHeight * cost + bedCost + tableCost;
                        expensive.add(costs);
                    }

                } else if (bedWidth < tableWidth && bedHeight > tableHeight) {

                } else if (bedWidth == tableWidth && bedHeight == tableHeight) {

                }
            }
        }
        answer = Collections.min(expensive);
        return answer;
    }

    @Test
    public void answer() {
        // given
        int[][] beds1 = {{4, 1, 200000}};
        int[][] tables1 = {{2, 3, 100000}};
        int cost1 = 10000;

        int[][] beds2 = {{2, 3, 40}, {2, 5, 20}};
        int[][] tables2 = {{1, 1, 30}};
        int cost2 = 100000;

        int[][] beds3 = {{2, 3, 400000}, {2, 5, 200000}};
        int[][] tables3 = {{1, 1, 300000}};
        int cost3 = 10;

        // when
        int result1 = 420000;
        int result2 = 4200000;
        int result3 = 4200000;

        // then
        Assert.assertEquals(result1, solution(beds1, tables1, cost1));
    }
}
