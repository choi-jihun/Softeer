import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Softeer_6292 {
    static long MOD = 1000000007;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long K = Long.parseLong(st.nextToken());
        long P = Long.parseLong(st.nextToken());
        long N = Long.parseLong(st.nextToken());

        N *= 10;
        long ans = recursive(P, N);

        System.out.println((ans * K) % MOD);
    }

    static long recursive(long P, long time) {
        if (time == 0)
            return 1;

        if (time == 1)
            return P % MOD;

        long temp = recursive(P, time / 2) % MOD;
        temp = (temp * temp) % MOD;

        if (time % 2 == 1) {
            return (temp * (P % MOD)) % MOD;
        } else
            return temp;
    }
}
