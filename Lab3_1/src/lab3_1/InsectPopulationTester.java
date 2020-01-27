package lab3_1;

public class InsectPopulationTester {
    public static void main(String[] args) {
        InsectPopulation tester = new InsectPopulation(10);
        tester.breed();
        tester.spray();
        System.out.println("Number of insects: "+tester.getNumInsect());   
     
        tester.breed();
        tester.spray();
        System.out.println("Number of insects: "+tester.getNumInsect()); 
        
        tester.breed();
        tester.spray();
        System.out.println("Number of insects: "+tester.getNumInsect());       
    }   
}
