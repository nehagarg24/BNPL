package BNPL;

import java.util.ArrayList;
import java.util.List;

public class PaymentPlan {

    private double totalAmount;
    private int noOfInstallments;
    private List<Installment> installments;

    public PaymentPlan(double totalAmount, int noOfInstallments) {
        this.totalAmount = totalAmount;
        this.noOfInstallments = noOfInstallments;
        this.installments = createInstallments();
    }

    private List<Installment> createInstallments() {
        List<Installment> installments = new ArrayList<>();
        double installmentAmount = totalAmount/noOfInstallments;

        for(int i=1; i<=noOfInstallments;i++) {
            Installment installment = new Installment(i, installmentAmount);
            installments.add(installment);
        }
        return installments;
    }

    public List<Installment> getInstallments() {
        return installments;
    }
}
