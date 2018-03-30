import java.io.*;
import java.util.*;
import java.awt.geom.Line2D;

public class Task3 {

    static BufferedReader in;
    static PrintWriter out;
    static StringTokenizer tok;

    public static void main(String[] args) throws IOException {

        in = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
        
        tok = new StringTokenizer("");
        new Task3().solve();
        out.flush();
        out.close();
    }

    void solve() throws IOException {
        System.out.println("Input coordinates of the first line (x, y, x1, y1)");
        double x = nextDouble();
        double y = nextDouble();
        double x1 = nextDouble();
        double y1 = nextDouble();
        Line2D firstLine = new Line2D.Double(x, y, x1, y1);
        System.out.println("Input coordinates of the second line (x, y, x1, y1)");
        x = nextDouble();
        y = nextDouble();
        x1 = nextDouble();
        y1 = nextDouble();
        Line2D secondLine = new Line2D.Double(x, y, x1, y1);
        if (firstLine.intersectsLine(secondLine)) {
            out.println("These lines intersect");
        } else {
            out.println("These lines not intersect");
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
