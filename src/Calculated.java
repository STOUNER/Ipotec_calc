 public class Calculated {
  static int MonthInYear = 12;
  static int PaymantPeriod;
  static int CurrentBalance;
  static int StartingBalance;
  static int InterestRate;

  public Calculated(int StartingBalance, int years, int interestRate) {
   this.StartingBalance = StartingBalance;
   this.PaymantPeriod = years * MonthInYear;
   this.InterestRate = interestRate;
  }

 }
