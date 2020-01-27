package lab3_3;

public class CashRegisterTester {
    public static void main(String[] args) {
        CashRegister tester = new CashRegister(0.07);
    tester.recordPurchase(50);
    tester.recordPurchase(10);
    tester.recordTaxablePurchase(20);
    tester.enterPayment(100);
    System.out.println("Your change is "+tester.giveChange());    
    }    
}
