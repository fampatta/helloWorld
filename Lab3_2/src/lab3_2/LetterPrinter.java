package lab3_2;

public class LetterPrinter {
    public static void main(String[] args) {
        Letter tester = new Letter("Jade","Clarissa");
        tester.addLine("We must find Simon quickly.\nHe might be in danger.");
        System.out.println(tester.getText());           
    }                     
}
