public class Main {
    public static void main(String[] args) {
        Calculated Test_1 = new Calculated(500,10,10);
        for (int i = 0; i < Calculated.PaymantPeriod; i++){
           System.out.println(Test_1.Amount());
        }
    }
}
