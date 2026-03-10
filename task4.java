import java.math.BigDecimal;

public class task4 {
    public static void main(String[] args) {

        double netDouble = 9.99;
        double grossDouble = netDouble * 1.23;
        double totalDouble = grossDouble * 10000;
        double backToNetDouble = totalDouble / 1.23;

        System.out.println("--- Using double ---");
        System.out.println("Net price: " + netDouble);
        System.out.println("Gross price: " + grossDouble);
        System.out.println("Total (x10000): " + totalDouble);
        System.out.println("Back to net: " + backToNetDouble);

        BigDecimal netBD = new BigDecimal("9.99");
        BigDecimal grossBD = netBD.multiply(new BigDecimal("1.23"));
        BigDecimal totalBD = grossBD.multiply(new BigDecimal("10000"));

        System.out.println("--- Using BigDecimal ---");
        System.out.println("Net price: " + netBD);
        System.out.println("Gross price: " + grossBD);
        System.out.println("Total (x10000): " + totalBD);
    }
}