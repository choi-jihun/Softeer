import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Softeer_6294 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] arr = new int[N + 1];
        arr[0] = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i < N + 1; i++) {
            arr[i] = Integer.parseInt(st.nextToken()) + arr[i - 1];
        }
        for (int i = 1; i < K + 1; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            double avg = (((double) (arr[B] - arr[A - 1]) / (B - A + 1)));
            avg = (double) Math.round(avg * 100) / 100.0;
            sb.append(String.format("%.2f", avg)).append("\n");
        }
        System.out.println(sb);
    }
}
