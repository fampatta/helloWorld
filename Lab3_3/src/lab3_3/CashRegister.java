package lab3_3;

public class CashRegister {
    private double purchase;
    private double taxablePurchase;
    private double payment;
    private double rateTax;
    private double sumTax;
   
    public CashRegister(double vat) {
        rateTax = vat;
    }
    
    public void recordPurchase(double amount){
        purchase = purchase + amount;
    }
    
    public void recordTaxablePurchase(double amount){ 
        taxablePurchase = taxablePurchase + amount; 
        sumTax = sumTax+rateTax*amount;
    }    

    public void enterPayment(double amount){
        payment = payment + amount;
    }
    
    public double getTotalTax(){         
        return sumTax;
    }
    
    public double giveChange(){
        double change = payment - purchase - taxablePurchase - sumTax;
        payment = 0;
        purchase = 0;
        purchase = 0;
        taxablePurchase = 0;
        sumTax = 0;        
        return change;
    }   
}
