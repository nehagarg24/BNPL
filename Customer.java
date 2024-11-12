package BNPL;

public class Customer {
    private int customerId;
    private String customerName;
    private double creditScore;
    private boolean isEligibleFroBNPL;

    public Customer(int customerId, String customerName, double creditScore) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.creditScore = creditScore;
        this.isEligibleFroBNPL = checkEligibility();
    }

    private boolean checkEligibility() {
        return creditScore>=650;
    }

    public Boolean isEligibleFroBNPL() {
        return isEligibleFroBNPL;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getCreditScore() {
        return creditScore;
    }

}
