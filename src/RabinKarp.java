public class RabinKarp {
    public void RabinKarpAlg (String y, String x, int baza, int q) {
        int n = y.length();
        int m = x.length();
        int h = 1;
        int nr_tipar = 0;
        int nr_fd = 0;
        for (int i = 1; i <= m - 1; i++) {
            h = (h * baza) % q;
        }
        for (int i = 0; i <= m - 1; i++) {
            nr_tipar = (baza * nr_tipar + x.charAt(i)) % q;
            nr_fd = (baza * nr_fd + y.charAt(i)) % q;
        }
        for (int d = 0; d <= n - m; d++) {
            if (nr_tipar == nr_fd) {
                int inegalitate = 0;
                for (int i = 0; i <= m - 1; i++) {
                    if (y.charAt(d + i) != x.charAt(i)) {
                        inegalitate = 1;
                        break;
                    }
                }
                if (inegalitate == 0) {
                    System.out.println("S-a gasit o aparitie a tiparului care incepe la pozitia " + d);
                }
            }
            if (d < n - m) {
                nr_fd = (baza * (nr_fd - y.charAt(d) * h) + y.charAt(d + m)) % q;
            }
            if (nr_fd < 0) {
                nr_fd = nr_fd + q;
            }
        }
    }
}
