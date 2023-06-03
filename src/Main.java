public class Main {
    public static void main(String[] args) {
        NaiveSearching obj1 = new NaiveSearching();
        String y = "564429170632879";
        String x = "291706";
        obj1.NaiveSearch(y,x,y.length(),x.length());
        RabinKarp obj2 = new RabinKarp();
        obj2.RabinKarpAlg(y,x,10,11);
        obj2.RabinKarpAlg(y,x,10,23);
        obj2.RabinKarpAlg(y,x,256,Integer.MAX_VALUE);
    }
}