import java.math.BigDecimal;
import java.math.RoundingMode;

public class LoanAmortizationCalculator {
    private BigDecimal principal;
    private BigDecimal annualInterestRate;
    private int loanTerm;

    public LoanAmortizationCalculator(BigDecimal principal, BigDecimal annualInterestRate, int loanTerm) {
        this.principal = principal;
        this.annualInterestRate = annualInterestRate;
        this.loanTerm = loanTerm;
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

    public int getLoanTerm() {
        return loanTerm;
    }

    public void setLoanTerm(int loanTerm) {
        this.loanTerm = loanTerm;
    }

    public BigDecimal calculateMonthlyPayment() {
        BigDecimal monthlyInterestRate = annualInterestRate.divide(BigDecimal.valueOf(12 * 100), RoundingMode.HALF_UP);
        int numberOfMonths = loanTerm * 12;
        BigDecimal onePlusRate = BigDecimal.ONE.add(monthlyInterestRate);
        BigDecimal power = onePlusRate.pow(numberOfMonths);
        BigDecimal numerator = principal.multiply(monthlyInterestRate.multiply(power));
        BigDecimal denominator = power.subtract(BigDecimal.ONE);
        return numerator.divide(denominator, RoundingMode.HALF_UP);
    }

    public BigDecimal calculateTotalAmountPaid() {
        return calculateMonthlyPayment().multiply(BigDecimal.valueOf(loanTerm * 12));
    }

    public String toString() {
        return String.format("Principal: ?%s\nAnnual Interest Rate: %s%%\nLoan Term: %d years", 
                             principal.toString(), annualInterestRate.toString(), loanTerm);
    }
}
