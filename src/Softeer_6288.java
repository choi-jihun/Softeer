import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Softeer_6288 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int W = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int[][] arr = new int[N][2];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr, (a, b) -> Integer.compare(b[1], a[1]));
        int ans = 0;
        int i = 0;
        while (W > 0) {
            if (W >= arr[i][0]) {
                W -= arr[i][0];
                ans += arr[i][0] * arr[i][1];
            } else {
                ans += W * arr[i][1];
                W = 0;
            }
            i++;
        }
        System.out.println(ans);

    }

}