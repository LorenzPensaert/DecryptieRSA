public class Main {

    public static void main(String[] args) {
        long e = 1399;
        long n = 2382929;
        // P & Q are prime numbers of N
        long p = 1481;
        long q = 1609;
        float d = zoekd(p,q,e);
        System.out.println(d);

        String tekst = "272563 141185 157540 12525 2056379 1618202 602079 692081 563333 2086344 1037710 430169 2026161 765628 1889550 1483041 1677772 1351811 1395319 2093722 1400941 140572 1116830 1351811 1100805 1922937 796672 1045432 969813 1312837 1739593 1116830 324923 1386225 225876 140572 955582 140572 1713785 543747 2069045 1725095 1998277 563333 2008288 1483041 1283470 563333 207168 1100192 1395319 1037710 831909 2248621 1573189 2139274 2026161 1459616 1889550 1618202 602079 955582 1087881 1945197 602079 969813 2096395 602079 1908731 140572 969813 1055063 1351811 1100805 722804 1108337 1100192 55040 968182 207168 1988221 1945197 602079 628345 317861 1371856 1945197 1386225 602079 387975 2248621 1312837 387975 430169 1194106 331034 186877 430169 1194106 628345 1194106 508393 682768 1077966 653708 1088484 1797008 129923 1386225 1444360 1739593";
        String[] numbers = tekst.split(" ");
        for(String number : numbers) {
            double C = Integer.parseInt(number);
            double M = Math.pow(C, d) % n;
            System.out.println(C + " => " + M);
        }
    }

    private static long reken(long deeltal,long deler,long x_2,long x_1) {
        long q,r,x;
        q=deeltal/deler;
        r=deeltal%deler;
        x=x_2-q*x_1;
        if (r==0) return x_1;
        return reken(deler,r,x_1,x);
    }

    private static long zoekd(long p,long q,long e) {
        return reken((p-1)*(q-1),e,0,1);
    }
}
