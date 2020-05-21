public class Calculated {
    int MonthInYear = 12;
    int PaymentPeriod;
    double StartingBalance;
    double EndingBalance;
    int InterestRate;
    double MonthPercent;
    double TotalInterest;
    double TotalPayment;
    double loanAmount;
    double Interest;
    double Payment;
    double Principal;
    int Month = 1;

    public Calculated(int loanAmount, int years, int interestRate) {
        this.loanAmount = loanAmount;
        this.StartingBalance = loanAmount;
        this.PaymentPeriod = years * MonthInYear;
        this.InterestRate = interestRate;
        this.MonthPercent = (double) InterestRate / 100 / 12;
        this.EndingBalance = loanAmount;
    }

    public Calculated(int loanAmount, int years, int interestRate,double ExtraPayment) {
        this.loanAmount = loanAmount - ExtraPayment;
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
        TotalPayment += Payment;
        return Payment;
    }

    public double Interest() {
        StartingBalance = EndingBalance;
        Interest = StartingBalance * MonthPercent;
        return Interest;

    }

    public double Principal() {
        double Principal;
        Principal = Payment - Interest;
        EndingBalance -= Principal;
        this.Principal = Principal;
        return Principal;
    }

    public double TotalInterest() {
        TotalInterest += (Payment - Principal);
        return TotalInterest;
    }
}

