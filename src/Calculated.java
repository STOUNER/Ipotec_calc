public class Calculated {
    int MonthInYear = 12;
    int PaymentPeriod;
    double StartingBalance;
    double EndingBalance;
    int InterestRate;
    double MonthPercent;
    double BankReward;
    double TotalPayment;
    double loanAmount;
    double Interest;
    double Payment;

    public Calculated(int loanAmount, int years, int interestRate) {
        this.loanAmount = loanAmount;
        this.StartingBalance = loanAmount;
        this.PaymentPeriod = years * MonthInYear;
        this.InterestRate = interestRate;
        this.MonthPercent = (double) InterestRate / 100 / 12;
        this.EndingBalance = loanAmount;
    }

    public double YouPaid() {
        double Payment;
        Payment = (loanAmount * MonthPercent) / (1 - (Math.pow((1 + MonthPercent), (-PaymentPeriod))));
        this.Payment = Payment;
        return Payment;
    }

    public double Interest() {
        StartingBalance = EndingBalance;
        Interest = StartingBalance * MonthPercent;
        TotalPayment += Interest;
        return Interest;
    }

    public double Principal() {
        double Principal;
        Principal = Payment - Interest;
        EndingBalance -= Principal;
        return Principal;

    }
}

