public class NaiveSearching {
    public void NaiveSearch(String y, String x, int n, int m) {
        for (int i = 0; i <= n - m; i++) {
            int inegalitate = 0;
            for (int j = 0; j <= m - 1; j++) {
                if (y.charAt(i + j) != x.charAt(j)) {
                    inegalitate = 1;
                    break;
                }
            }
            if (inegalitate == 0) {
                System.out.println("S-a gasit o aparitie a tiparului care incepe la pozitia " + i);
            }
        }
    }
}
