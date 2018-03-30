import java.io.*;
import java.util.*;

public class Task2 {

    static BufferedReader in;
    static PrintWriter out;
    static StringTokenizer tok;

    public static void main(String[] args) throws IOException {

        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        
        tok = new StringTokenizer("");
        new Task2().solve();
        out.flush();
        out.close();
    }

    void solve() throws IOException {
        int n = nextInt();
        int fib = 0;
        try {
            fib = fib(n);
        } catch (Exception e) {
            out.println("Better use dp algorithm!!! fib[i] = fib[i-1]+fib[i-2]");
            return;
        }
        out.println(n + "-th fibonacci number is " + fib);
    }
    
    int fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            fib(n - 1) + fib(n - 2);
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
