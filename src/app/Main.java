package app;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale loc = Locale.GERMANY; // десятичная запятая (вроде верно я понял)

        // Товар 1
        String name1 = "smartphone";
        int quantity1 = 59;
        double price1 = 205.99;
        int days1 = 5;
        double total1 = quantity1 * price1;
        double daily1 = total1 / days1;

        // Товар 2
        String name2 = "laptop";
        int quantity2 = 11;
        double price2 = 953.35;
        int days2 = 7;
        double total2 = quantity2 * price2;
        double daily2 = total2 / days2;

        System.out.printf(loc, "Product No 1: %s,%n", name1);
        System.out.printf(loc, "total sales for %d days is EUR %.2f,%n", days1, total1);
        System.out.printf(loc, "sales by day is EUR %.2f.%n", daily1);

        System.out.printf(loc, "Product No 2: %s,%n", name2);
        System.out.printf(loc, "total sales for %d days is EUR %.2f,%n", days2, total2);
        System.out.printf(loc, "sales by day is EUR %.2f.%n", daily2);
    }
}