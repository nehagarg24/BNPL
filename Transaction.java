package BNPL;

import java.time.LocalDate;

public class Transaction {
    private int transactionId;
    private Installment installment;
    private LocalDate paymentDate;
    private double paymentAmount;

    public Transaction(int transactionId, Installment installment, double paymentAmount) {
        this.transactionId = transactionId;
        this.installment = installment;
        this.paymentAmount = paymentAmount;
        this.paymentDate = LocalDate.now();
    }

    public int getTransactionId() {
        return transactionId;
    }

    public Installment getInstallment() {
        return installment;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public double getPaymentAmount() {
        return paymentAmount;
    }
}
