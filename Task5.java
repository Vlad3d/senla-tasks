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

    void solve() throws IOException {
        System.out.println("Input string");
        String str = nextTok();
        int l = 0;
        int r = str.length()-1;
        boolean isPalindrome = true;
        while (l < r) {
            if (str.charAt(l) != str.charAt(r)) {
                isPalindrome = false;
                break;
            }
            l++;
            r--;
        }
        if (isPalindrome) {
            out.println("String is palindrome");
        } else {
            out.println("String is not palindrome");
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
