package BNPL;

public class Order {
    private int orderId;
    private double totalAmount;
    private Customer customer;
    private PaymentPlan paymentPlan;

    public Order(int orderId, double totalAmount, Customer customer, int noOfInstallments) {
        this.orderId = orderId;
        this.totalAmount = totalAmount;
        this.customer = customer;
        this.paymentPlan = new PaymentPlan(totalAmount, noOfInstallments);
    }

    public int getOrderId() {
        return orderId;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public PaymentPlan getPaymentPlan() {
        return paymentPlan;
    }
}
