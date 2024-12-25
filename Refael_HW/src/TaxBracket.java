/**
 * Represents a single tax bracket in the Israeli tax system.
 * Contains the minimum and maximum amounts for the bracket and its tax rate.
 */
public class TaxBracket {
    private double minAmount;
    private double maxAmount;
    private double taxRate;
    
    public TaxBracket(double minAmount, double maxAmount, double taxRate) {
        this.minAmount = minAmount;
        this.maxAmount = maxAmount;
        this.taxRate = taxRate;
    }
    
    public double getMinAmount(){
    	return minAmount;
    	}
    
    public double getMaxAmount(){
    	return maxAmount;
    	}
    
    public double getTaxRate(){
    	return taxRate;
    	}
    
}