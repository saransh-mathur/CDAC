import java.math.BigDecimal;
import java.math.RoundingMode;

public class CompoundInterestCalculator {
    private BigDecimal principal;
    private BigDecimal annualInterestRate;
    private int numberOfCompounds;
    private int years;

    public CompoundInterestCalculator(BigDecimal principal, BigDecimal annualInterestRate, int numberOfCompounds, int years) {
        this.principal = principal;
        this.annualInterestRate = annualInterestRate;
        this.numberOfCompounds = numberOfCompounds;
        this.years = years;
    }

    public BigDecimal getPrincipal() {
        return principal;
    }

    public void setPrincipal(BigDecimal principal) {
        this.principal = principal;
    }

    public BigDecimal getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(BigDecimal annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public int getNumberOfCompounds() {
        return numberOfCompounds;
    }

    public void setNumberOfCompounds(int numberOfCompounds) {
        this.numberOfCompounds = numberOfCompounds;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public BigDecimal calculateFutureValue() {
        BigDecimal ratePerCompounding = annualInterestRate.divide(BigDecimal.valueOf(numberOfCompounds * 100), RoundingMode.HALF_UP);
        BigDecimal onePlusRate = BigDecimal.ONE.add(ratePerCompounding);
        BigDecimal exponent = BigDecimal.valueOf(numberOfCompounds * years);
        BigDecimal futureValue = principal.multiply(onePlusRate.pow(exponent.intValue()));
        return futureValue;
    }

    public BigDecimal calculateTotalInterestEarned() {
        return calculateFutureValue().subtract(principal);
    }

    public String toString() {
        return String.format("Principal: ₹%s\nAnnual Interest Rate: %s%%\nCompounded: %d times per year\nInvestment Duration: %d years",
                             principal.toString(), annualInterestRate.toString(), numberOfCompounds, years);
    }
}
