import java.util.*;
public class Parse {
 
    static int count = 0;
 
    static int exp(int a, int n) {
        if (n == 0) return 1;
        if (n == 1) return a;
        int k = exp(a, n/2);
        if (n % 2 == 0) {
           return k*k;
        } else {
           return a*k*k;
        }
    }
 
    static void parse(int sum ,int last ,int m ,int x) {
        if (sum == m) {
            count ++;
            return;
        }
        for (int i = last; exp(i, x) <= m - sum; i++) {
            parse(sum + exp(i, x), i, m, x);
        }
    }
    static void m(O t) {
       O ta = new O(10);
       t = ta;
    }
    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
        // //System.out.println(exp(5,3));
        // int m = in.nextInt();
        // int x = in.nextInt();
        // in.close();
        // parse(0 ,1 , m, x);
        // System.out.println(count);
        O t = new O(1);
        m(t);
        System.out.println(t.v);
    }
}
class O {
    int v;

    public O(int k) {
        this.v = k;
    }
}