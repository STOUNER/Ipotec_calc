public class Main {
    public static void main(String[] args) {
        Calculated Test_1 = new Calculated(100000,30,6);
        for (int i = 0; i < Test_1.PaymentPeriod; i++){
            System.out.println("Платёж: " + Test_1.YouPaid());
            System.out.println("Процент банку: " + Test_1.Interest());;
            System.out.println("Тело кредита: " + Test_1.Principal());
            System.out.println(' ');
        }
        System.out.println(Test_1.BankReward);
        System.out.println(Test_1.TotalPayment);
    }
}
