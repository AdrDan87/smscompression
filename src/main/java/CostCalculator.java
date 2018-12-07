import java.math.BigDecimal;
import java.math.RoundingMode;

public class CostCalculator {
    private  final BigDecimal UNIT_PRICE;

    CostCalculator(BigDecimal unitPrice){
        this.UNIT_PRICE = unitPrice;
    }

    public BigDecimal calculate(int lenght){

        return new BigDecimal(lenght).multiply(UNIT_PRICE).setScale(0, RoundingMode.HALF_UP);
    }
}
