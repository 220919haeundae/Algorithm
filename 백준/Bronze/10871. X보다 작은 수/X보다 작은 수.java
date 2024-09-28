import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N,X,A;
        
        StringTokenizer first = new StringTokenizer(br.readLine(), " ");
        N = Integer.parseInt(first.nextToken());
        X = Integer.parseInt(first.nextToken());
        
        StringTokenizer second = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            A = Integer.parseInt(second.nextToken());
            if (A < X) {
                sb.append(A).append(" ");
            }
        }
        
        System.out.print(sb);
    }
}