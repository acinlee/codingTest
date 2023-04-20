package level3;

import java.util.ArrayList;
import java.util.Base64;
import java.util.Collections;

public class 여행경로 {
    public static boolean[] visit;
    public static ArrayList<String> allRoute;

    public static void main(String[] args) throws Exception {
        String[][] tickets = {{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL","SFO"}};
        solution(tickets);
    }

    public static String[] solution(String[][] tickets) {
        String[] answer = {};
        visit = new boolean[tickets.length];
        allRoute = new ArrayList<>();
        String route = "ICN";
        dfs(route, route, tickets, 0);

        Collections.sort(allRoute);
        answer = allRoute.get(0).split(" ");

        return answer;
    }

    public static void dfs(String start, String route, String[][] tickets, int cnt) {
        if (cnt == tickets.length) {
            allRoute.add(route);
            return;
        }

        for (int i=0; i<tickets.length; i++) {
            if(start.equals(tickets[i][0]) && !visit[i]){
                visit[i] = true;
                dfs(tickets[i][1], route + " " + tickets[i][1], tickets, cnt+1);
                visit[i] = false;
            }
        }
    }
}
