import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Softeer_6289 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] weight = new int[N];
        int[] ans = new int[N];
        Arrays.fill(ans, 0);
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            weight[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()) - 1;
            int b = Integer.parseInt(st.nextToken()) - 1;
            if (weight[a] > weight[b]) {
                if (ans[a] != -1) {
                    ans[a] = 1;
                }
                ans[b] = -1;
            } else if (weight[b] > weight[a]) {
                if (ans[b] != -1) {
                    ans[b] = 1;
                }
                ans[a] = -1;
            } else {
                ans[a] = -1;
                ans[b] = -1;
            }
        }
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            if (ans[i] == 1 || ans[i] == 0)
                cnt++;
        }
        System.out.println(cnt);
    }
}
