public class Calculated {
 static int MonthInYear = 12;
 static int PaymantPeriod;
 int loanAmount;
 int interestRate;

 public Calculated(int loanAmount, int years, int interestRate) {
  this.loanAmount = loanAmount;
  this.PaymantPeriod = years * MonthInYear;
  this.interestRate = interestRate; //test git
 }

 public int Amount() {
  int Amount;
   Amount = loanAmount / PaymantPeriod;
   loanAmount -= Amount;
   return loanAmount;
 }
}
