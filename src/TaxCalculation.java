import java.math.BigDecimal;

public class TaxCalculation {
    public static void main(){
        // Lab 2 - Task 5
        // using double
        double productNetValue = 9.99;
        double productGrossValue = productNetValue * 1.23;
        double totalGrossValue = productGrossValue * 10000;
        double totalNetValue = totalGrossValue / 1.23;

        System.out.println("Price without VAT (Net Value): " + productNetValue);
        System.out.println("Price with VAT (Gross Value): " + productGrossValue);
        System.out.println("Total number of products sold: 10,000");
        System.out.println("Total value without VAT (Total Net Value): " + totalNetValue);
        System.out.println("Total value with VAT (Total Gross Value): " + totalGrossValue);

        // using BigDecimal class
        System.out.println("\nSame thing after using Big Decimal:");
        System.out.println("===================================");
        BigDecimal _productNetValue = new BigDecimal("9.99");
        BigDecimal _productGrossValue = _productNetValue.multiply(new BigDecimal("1.23"));
        _productGrossValue = _productGrossValue.setScale(2,BigDecimal.ROUND_HALF_EVEN);
        BigDecimal _totalGrossValue = _productGrossValue.multiply(new BigDecimal("10000"));
        BigDecimal _totalNetValue = _totalGrossValue.divide(new BigDecimal("1.23"), BigDecimal.ROUND_HALF_EVEN);

        System.out.println("Price without VAT (Net Value): " + _productNetValue);
        System.out.println("Price with VAT (Gross Value) Rounded: " + _productGrossValue);
        System.out.println("Total number of products sold: 10,000");
        System.out.println("Total value without VAT (Total Net Value): " + _totalNetValue);
        System.out.println("Total value with VAT (Total Gross Value): " + _totalGrossValue);
    }
}
