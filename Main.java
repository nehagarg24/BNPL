package BNPL;

public class Main {
    public static void main(String [] args) {
        Customer customer = new Customer(123, "Neha", 700);
        if(!customer.isEligibleFroBNPL()) {
            System.out.println("Customer is not eligible for BNPL because of low credit score.");
            return;
        }

        Order order = new Order(111, 10000, customer, 10);

        for(Installment installment : order.getPaymentPlan().getInstallments()) {
            System.out.println("Installment "+ installment.getInstallmentAmount() +" is due on "+ installment.getDueDate());
        }

        Installment firstInstallment = order.getPaymentPlan().getInstallments().get(0);
        firstInstallment.markAsPaid();

        Transaction transaction = new Transaction(1234, firstInstallment, firstInstallment.getInstallmentAmount());
        System.out.println("Transaction ID: "+ transaction.getTransactionId() + " Payment amount: "+ transaction.getPaymentAmount());

        
    }
}
