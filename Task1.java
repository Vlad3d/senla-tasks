import java.io.*;
import java.util.*;
import java.awt.geom.Line2D;

public class Task5 {

    static BufferedReader in;
    static PrintWriter out;
    static StringTokenizer tok;

    public static void main(String[] args) throws IOException {

        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        
        tok = new StringTokenizer("");
        new Task5().solve();
        out.flush();
        out.close();
    }
    
    boolean[] prime;

    void solve() throws IOException {
        int n = nextInt();
        sieve(n);
        for (int i = 2; i <= n; i++) {
            if (prime[i]) {
                out.print(i + " ");
            }
        }
    }
    
    void sieve(int n) {
        prime = new boolean[n+1];
        Arrays.fill(prime, true);
        prime[0] = prime[1] = false;
        for (int i = 2; i * i <= n; i++) {
        	if (prime[i]) {
    			for (int j= i * i; j <= n; j += i) {
    				prime[j] = false;
    			}
        	}
        }
    }
    
    String nextTok() throws IOException {
        while (!tok.hasMoreTokens()) {
            tok = new StringTokenizer(in.readLine());
        }
        return tok.nextToken();
    }

    String nextLine() throws IOException {
        return in.readLine();
    }

    int nextInt() throws IOException {
        return Integer.parseInt(nextTok());
    }

    long nextLong() throws IOException {
        return Long.parseLong(nextTok());
    }

    double nextDouble() throws IOException {
        return Double.parseDouble(nextTok());
    }

}
