public class Main {
    public static void main(String[] args) {
        Calculated Test_1 = new Calculated(100000,30,6);
        for (int i = 0; i < Calculated.PaymentPeriod; i++){
            System.out.println(Calculated.Paid());
            System.out.println(Calculated.Interest());;
        }
        System.out.println(Calculated.BankReward);
        System.out.println(Calculated.TotalPayment);
    }
}
