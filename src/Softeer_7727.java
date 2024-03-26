import java.io.*;
import java.util.*;

public class Softeer_7727 {

    static class Node {
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static int[][] arr;
    static int n, m;
    static int idx = 0;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int maxHarvest = 0;
    static List<Node> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken()) - 1;
            int y = Integer.parseInt(st.nextToken()) - 1;
            list.add(new Node(x, y));
        }

        dfs(0, 0, 0, 0, 0);

        bw.write(String.valueOf(maxHarvest));
        bw.flush();
    }

    public static void dfs(int x, int y, int num, int steps, int harvest) {
        if (steps == 4) {
            num++;
            steps = 0;
        }

        if (num == m) {
            maxHarvest = Math.max(harvest, maxHarvest);
            return;
        }


        Node node = list.get(num);

        int xx = 0;
        int yy = 0;

        if (steps == 0) {
            xx = node.x;
            yy = node.y;
        } else {
            xx = x;
            yy = y;
        }

        for (int i = 0; i < 4; i++) {
            int nx = xx + dx[i];
            int ny = yy + dy[i];

            if (nx >= 0 && ny >= 0 && nx < n && ny < n) {
                int temp = arr[xx][yy];
                arr[xx][yy] = 0;
                dfs(nx, ny, num, steps + 1, harvest + temp);
                arr[xx][yy] = temp;
            }
        }
    }
}

