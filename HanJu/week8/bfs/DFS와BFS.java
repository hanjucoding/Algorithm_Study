import java.io.*;
import java.util.*;



public class Main {

    static StringBuilder sb = new StringBuilder();
    static int[][] arr;
    static boolean[] visited;
    static int N, M;
    static Queue<Integer> queue = new LinkedList<>();
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        arr = new int[N+1][N+1];
        visited = new boolean[N+1];

        for(int i = 0 ; i < M ; i ++) {
            StringTokenizer str = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(str.nextToken());
            int b = Integer.parseInt(str.nextToken());
            arr[b][a] = 1;
            arr[a][b] = 1;
        }
        dfs(V);
        sb.append('\n');
        visited = new boolean[N+1];
        bfs(V);
        System.out.println(sb.toString());
    }
    //dfs재귀함수로 구현
    static void dfs(int V){
        sb.append(V+" ");
        visited[V] = true;
        for(int i = 0 ; i <= N ; i ++) {
//            System.out.println(arr[V][i]);
            if(arr[V][i] ==1 && !visited[i]){
                dfs(i);
            }
        }
    }
    //bfs 큐로 구현
    static void bfs(int V){
        queue.add(V);
        visited[V] = true;
        while(!queue.isEmpty()){
            int v = queue.poll();
            sb.append(v+" ");
            for (int i = 0; i <= N ; i++) {
                if(arr[v][i] ==1 && !visited[i]){
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }


    }
}

//풀이 https://hanjucoding.tistory.com/4
