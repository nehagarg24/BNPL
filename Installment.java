package BNPL;

import java.time.LocalDate;

public class Installment {
    private int installmentNumber;
    private double installmentAmount;
    private LocalDate dueDate;
    private boolean isPaid;

    public Installment(int installmentNumber, double installmentAmount) {
        this.installmentNumber = installmentNumber;
        this.installmentAmount = installmentAmount;
        this.dueDate = LocalDate.now().plusMonths(installmentNumber);
        this.isPaid = false;
    }

    public int getInstallmentNumber() {
        return installmentNumber;
    }

    public double getInstallmentAmount() {
        return installmentAmount;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void markAsPaid() {
        this.isPaid = true;
    }

    public void markAsUnpaid() {
        this.isPaid = false;
    }
}
