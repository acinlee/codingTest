package level3;

public class 네트워크 {
    public static void main(String[] args) throws Exception {
        int n = 3;
        int[][] computers = {{1,1,0}, {0,1,0}, {0,0,1}};
        System.out.println(solution(n, computers));
    }

    public static int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[computers.length];

        for (int i=0; i< computers.length; i++) {
            if (!visited[i]) {
                answer++;
                dfs(i, visited, computers);
            }
        }
        return answer;
    }

    public static void dfs(int start, boolean[] visited, int[][] computers) {
        visited[start] = true;

        for (int i=0; i< computers.length; i++) {
            if(!visited[i] && computers[start][i] == 1) {
                dfs(i, visited, computers);
            }
        }
    }

}
