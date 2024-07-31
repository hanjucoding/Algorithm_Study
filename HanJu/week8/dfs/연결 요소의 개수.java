import java.io.*;
import java.util.*;

public class Main {
    static int N, M, count;
    static int[][] arr;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N+1][N+1];
        count = 0;
        visited = new boolean[N + 1];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arr[x][y] = arr[y][x] = 1;
        }
        for (int i = 1; i < N + 1; i++) {
            if (!visited[i]) {
                dfs(i);
                count++;
            }
        }
        System.out.println(count);
    }

    static void dfs(int idx) {
        if (visited[idx]) return;
        else{
            visited[idx] = true;
            for (int i = 1; i < N + 1; i++) {
                if (arr[idx][i] == 1 && !visited[i]) {
                    dfs(i);
                }
            }
        }

    }
}
