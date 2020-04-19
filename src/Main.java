public class Main {
    public static void main(String[] args) {
        Calculated Test_1 = new Calculated(500,1,10);
        for (int i = 0; i < Calculated.PaymentPeriod; i++){
            System.out.println(Calculated.Amount());
        }
    }
}
