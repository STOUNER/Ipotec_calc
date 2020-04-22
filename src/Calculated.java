 public class Calculated {
  static int MonthInYear = 12;
  static int PaymentPeriod;
  static double StartingBalance;
  static double EndingBalance;
  static int InterestRate;
  static double MonthPercent;
  static double BankReward;
  static double TotalPayment;
  static double loanAmount;

  public Calculated(int loanAmount, int years, int interestRate) {
   this.loanAmount = loanAmount;
   this.StartingBalance = loanAmount;
   this.PaymentPeriod = years * MonthInYear;
   this.InterestRate = interestRate;
   this.MonthPercent = (double)InterestRate / 100 / 12;
   this.EndingBalance = loanAmount;
  }
  public static double Paid(){
     double Payment;
     Payment = (loanAmount * MonthPercent) / (1-(Math.pow((1+MonthPercent),(-PaymentPeriod))));
     BankReward += Payment;
     return Payment;
 }
     public static double Interest(){
      double Interest;
      StartingBalance = EndingBalance;
      Interest = StartingBalance * MonthPercent;
      EndingBalance -= Interest;
      TotalPayment += Interest;
      return Interest;
     }
}

