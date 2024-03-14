package f111_ed_aula04;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println(ex1(5, 6));
        // System.out.println(ex2(5, 6));
        // System.out.println(ex3(5, 6));
        // System.out.println(ex4(5));
        System.out.println(ex5(6));
    }

    private static double ex1(int n1, int n2) {
        return n1 * n2;
    }

    private static double ex2(int n1, int n2) {
        int c = 1, res = 0;
        while (c <= n1) {
            res += n2;
            c++;
        }
        return res;
    }

    private static double ex3(int n1, int n2) {
        if (n1 == 1) {
            return n2;
        }
        return (n2 + ex3(n1 - 1, n2));
    }

    private static int ex4(int n1) {
        if (n1 == 0) {
            return 1;
        }
        return n1 * ex4(n1 - 1);
    }

    private static long ex5(int i) {
        if (i < 2) {
            return i;
        }
        return ex5(i - 1) + ex5(i - 2);
    }
}
