import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Softeer_6291 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];
        StringTokenizer st;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        //2차원 배열에서 두번째 원소를 기준으로 정렬
        Arrays.sort(arr, Comparator.comparingInt(a -> a[1]));
        int cnt = 0;
        int finishTime = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i][0] >= finishTime) {
                cnt++;
                finishTime = arr[i][1];
            }
        }
        System.out.println(cnt);
    }
}
