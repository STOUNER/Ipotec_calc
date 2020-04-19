 public class Calculated {
  static int MonthInYear = 12;
  static int PaymentPeriod;
  static double CurrentBalance;
  static double StartingBalance;
  static int InterestRate;
  static int MonthPercent = InterestRate / MonthInYear;

  public Calculated(int loanAmount, int years, int interestRate) {
   this.StartingBalance = loanAmount;
   this.PaymentPeriod = years * MonthInYear;
   this.InterestRate = interestRate;
  }
  public static double Amount(){
      double Interest;
      CurrentBalance = StartingBalance;
      Interest = (CurrentBalance * MonthPercent) / Math.pow((1 -(1+MonthPercent)),(MonthInYear*-1));
      StartingBalance =- Interest;
      return Interest;
 }
 }
