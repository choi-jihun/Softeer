import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Softeer_6279 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        char[] ch = br.readLine().toCharArray();
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            if (ch[i] == 'P') {
                for (int j = Math.max(0, i - K); j <= Math.min(N - 1, i + K); j++) {
                    if (ch[j] == 'H') {
                        cnt++;
                        ch[j] = 'X';
                        break;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}
