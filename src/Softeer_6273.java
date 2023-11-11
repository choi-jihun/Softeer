import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Softeer_6273 {

    static boolean[] visited;
    static int[] matrix;
    static int result = 99999999;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        matrix = new int[N];
        visited = new boolean[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        dfs(0, N, M, K, arr);
        System.out.println(result);
    }

    static void dfs(int count, int N, int M, int K, int[] arr) {
        if (count == N) {
            int idx = 0;
            int bucket = 0;
            int sumOfData = 0;

            for (int i = 0; i < K; i++) {
                while (matrix[idx] + bucket <= M) {
                    bucket += matrix[idx];
                    idx = (idx + 1) % N;
                }
                sumOfData += bucket;
                bucket = 0;
            }
            result = Math.min(sumOfData, result);
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                matrix[count] = arr[i];
                dfs(count + 1, N, M, K, arr);
                visited[i] = false;
            }
        }
    }
}
