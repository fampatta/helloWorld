package lab3_1;

public class InsectPopulation {
    private double numInsect;
    public InsectPopulation (double innitalNumInsect){
        numInsect = innitalNumInsect;
    }

    public void breed() {
        numInsect = numInsect*2.0;
    }
    
    public void spray() {
        numInsect = numInsect*0.9;
    }   
    public double getNumInsect() {
        return numInsect ;
    } 
        
}
