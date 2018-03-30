import java.io.*;
import java.util.*;
import java.awt.geom.Line2D;

public class Task4 {

    static BufferedReader in;
    static PrintWriter out;
    static StringTokenizer tok;

    public static void main(String[] args) throws IOException {

        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        
        tok = new StringTokenizer("");
        new Task4().solve();
        out.flush();
        out.close();
    }

    void solve() throws IOException {
        System.out.println("Input 2 numbers");
        int n = nextInt();
        int m = nextInt();
        int gcd = gcd(n, m);
        out.println("GCD " + n + " and " + m + " is " + gcd);
        out.println("LCM " + n + " and " + m + " is " + ((n * m) / gcd));
    }
    
    int gcd(int n, int m) {
        if (m == 0) {
            return n;
        }
        return gcd(m, n%m);
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
