package BNPL;

public class CreditCheck {
    public static boolean isEligible(Customer customer) {
        return customer.getCreditScore() >= 650;
    }
}
