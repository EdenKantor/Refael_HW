public class TaxCalculator {
    private TaxBracket[] taxBrackets;

    public TaxCalculator() {
        taxBrackets = new TaxBracket[] {
            new TaxBracket(0, 7010, 0.10),
            new TaxBracket(7011, 10060, 0.14),
            new TaxBracket(10061, 16150, 0.20),
            new TaxBracket(16151, 22440, 0.31),
            new TaxBracket(22441, 46690, 0.35),
            new TaxBracket(46691, 60130, 0.47),
            new TaxBracket(60131, Double.MAX_VALUE, 0.50)
        };
    }


     // Calculates the total tax for a given salary based on tax brackets.
    // For each bracket, it calculates the taxable amount and applies the corresponding tax rate.
    public double calculateTax(double salary) {
        double totalTax = 0;

        for (TaxBracket bracket : taxBrackets) {
            if (salary <= bracket.getMinAmount()) {
                break; // No tax for this and subsequent brackets
            }

            double taxableAmount = Math.min(bracket.getMaxAmount(), salary) - bracket.getMinAmount();
            totalTax += taxableAmount * bracket.getTaxRate();

            if (salary <= bracket.getMaxAmount()) {
                break; // Salary is fully taxed within this bracket
            }
        }

        return totalTax;
    }
}
