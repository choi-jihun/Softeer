import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Softeer_6283 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = br.readLine().replaceAll(" ", "").toCharArray();
        char[] ascending = {'1', '2', '3', '4', '5', '6', '7', '8'};
        char[] descending = {'8', '7', '6', '5', '4', '3', '2', '1'};

        if (Arrays.equals(arr, ascending)) {
            System.out.println("ascending");
        } else if (Arrays.equals(arr, descending)) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
    }

}
